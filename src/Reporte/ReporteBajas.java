package Reporte;

import ConexionBaseDatos.sqlConexionBD;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReporteBajas {

    public static void reporte() {
        // Crear un libro de trabajo Excel y una hoja de cálculo
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Productos de baja");

        try {
            // Cargar una imagen (en este caso, un logo) desde un archivo
            InputStream is = new FileInputStream("src/Imagenes/OIP.jpeg");
            byte[] bytes = IOUtils.toByteArray(is);
            int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            is.close();

            // Configurar el logo en la hoja de cálculo
            CreationHelper help = book.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();
            ClientAnchor anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setRow1(1);
            Picture pict = draw.createPicture(anchor, imgIndex);
            pict.resize(1, 3);

            // Establecer el estilo para el título
            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(CellStyle.ALIGN_CENTER);
            tituloEstilo.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
            Font fuenteTitulo = book.createFont();
            fuenteTitulo.setFontName("Arial");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(fuenteTitulo);

            // Crear una fila para el título y establecer el estilo
            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte de bajas productos");

            // Fusionar celdas para el título
            sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));

            // Definir las cabeceras de las columnas
            String[] cabecera = new String[]{
                "IdActivo", "Motivo", "Cantidad de baja", "baja",
                "Codigo", "Nombre", "Marca", "Categoria", "Precio",
                "Registro", "Vencimiento", "Proveedor", "responsable"
            };

            // Establecer el estilo para las cabeceras
            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex()); // Cambiar a verde
            headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(CellStyle.BORDER_THIN);
            headerStyle.setBorderLeft(CellStyle.BORDER_THIN);
            headerStyle.setBorderRight(CellStyle.BORDER_THIN);
            headerStyle.setBorderTop(CellStyle.BORDER_THIN);

            Font font = book.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 12);
            headerStyle.setFont(font);

            // Crear una fila para las cabeceras y establecer el estilo
            Row filaEncabezados = sheet.createRow(4);

            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellStyle(headerStyle);
                celdaEncabezado.setCellValue(cabecera[i]);
            }

            // Establecer la conexión a la base de datos
            sqlConexionBD con = new sqlConexionBD();
            CallableStatement callProcedure;
            ResultSet rs;
            Connection conn = con.conexionBaseDatos();

            // Inicializar el número de fila de datos
            int numFilaDatos = 5;

            // Establecer el estilo para los datos de las celdas
            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setBorderBottom(CellStyle.BORDER_THIN);
            datosEstilo.setBorderTop(CellStyle.BORDER_THIN);
            datosEstilo.setBorderRight(CellStyle.BORDER_THIN);
            datosEstilo.setBorderLeft(CellStyle.BORDER_THIN);

            // Consulta SQL para obtener datos de la base de datos (en español)
            String consultaSQL = "{CALL MostrarBajas()}";

            callProcedure = conn.prepareCall(consultaSQL);
            rs = callProcedure.executeQuery();

            int numCol = rs.getMetaData().getColumnCount();

            // Iterar a través de los resultados y agregar datos a la hoja de cálculo
            while (rs.next()) {
                Row filaDatos = sheet.createRow(numFilaDatos);

                for (int a = 0; a < numCol; a++) {

                    Cell CeldaDatos = filaDatos.createCell(a);
                    CeldaDatos.setCellStyle(datosEstilo);
                    CeldaDatos.setCellValue(rs.getString(a + 1));
                }

                numFilaDatos++;
            }

            // Establecer el mismo ancho para todas las columnas
            int totalColumnas = cabecera.length;
            for (int i = 0; i < totalColumnas; i++) {
                sheet.setColumnWidth(i, 5510); // Establecer el ancho de cada columna en 5010 unidades de ancho de caracteres
            }

            // Cambiar el nivel de zoom
            sheet.setZoom(120, 120); // Esto establecerá el nivel de zoom al 100%

            // Guardar el archivo Excel y abrirlo
            String fileName = "productos de baja";
            String home = System.getProperty("user.home");
            File file = new File(home + "/Downloads/" + fileName + ".xlsx");
            FileOutputStream fileOut = new FileOutputStream(file);
            book.write(fileOut);
            fileOut.close();
            Desktop.getDesktop().open(file);
            JOptionPane.showMessageDialog(null, "Reporte Generado", "generando...", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
