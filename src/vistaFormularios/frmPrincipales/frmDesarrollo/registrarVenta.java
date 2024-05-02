package vistaFormularios.frmPrincipales.frmDesarrollo;

import capaEntidades.Auditoria;
import capaEntidades.DetalleVenta;
import capaEntidades.ProductoVendido;
import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.venta;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import entidadesDAO.DetalleVentaDao;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.ventaDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.ventanaCliente;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.ventanaProductosVentana;
import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class registrarVenta extends javax.swing.JFrame {
    
    private int itemVenta = 0;
    private double sumaVentas = 0.00;
    private double Cargo = 0.00;
    private double sumaCargo = 0.00;
    private double totalVenta = 0.00;
    DefaultTableModel modelTable = new DefaultTableModel();
    modeloTransferencia modelo = general.transferencia;
    venta data = new venta();
    ventaDAO dao = new ventaDAO();
    DetalleVentaDao DetalleDAO = new DetalleVentaDao();
    List<ProductoVendido> productosVendidos = new ArrayList<>();
    
    public registrarVenta() {
        initComponents();
        detallesDeventa();
        verificationCloseWindows();
        this.setDefaultCloseOperation(registrarVenta.DISPOSE_ON_CLOSE);
        setTitle("Registro de ventas");
        this.setExtendedState(registrarVenta.MAXIMIZED_BOTH);
        txtIdCliente.setVisible(false);
        txtIdProducto.setVisible(false);
        txtSinUso.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonSearchClient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPrecion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonSearchProduc = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtNumeroVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JLabelCargoIva = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabelMontoTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmpleadoNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabelIva = new javax.swing.JLabel();
        jLabelTotalVenta = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        comboMetodoPago = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonImpresiont = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVenta = new javax.swing.JTable();
        txtIdCliente = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtCantidadCarrito = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSinUso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonSearchClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        buttonSearchClient.setText("Buscar Cliente");
        buttonSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchClientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Documento");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSearchClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearchClient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Producto");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio");

        buttonSearchProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        buttonSearchProduc.setText("Buscar Producto");
        buttonSearchProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchProducActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Disponible");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSearchProduc, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearchProduc)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Numero de venta del dia");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha");

        JLabelCargoIva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelCargoIva.setForeground(new java.awt.Color(0, 0, 0));
        JLabelCargoIva.setText("00.00");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("MONTO TOTAL");

        jLabelMontoTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMontoTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMontoTotal.setText("00.00");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CARGO TOTAL");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Quien esta vendiendo");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("CARGO IVA");

        jLabelIva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIva.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIva.setText("00.00");

        jLabelTotalVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTotalVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotalVenta.setText("00.00");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("TOTAL SIN CARGO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroVenta)
                            .addComponent(txtFecha)
                            .addComponent(txtEmpleadoNombre)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 81, Short.MAX_VALUE))
                                    .addComponent(JLabelCargoIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabelIva, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTotalVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(txtNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelCargoIva)
                    .addComponent(jLabelIva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMontoTotal)
                    .addComponent(jLabelTotalVenta))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        comboMetodoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboMetodoPago.setForeground(new java.awt.Color(0, 0, 0));
        comboMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- ", "Tarjeta", "Efectivo", "Transaccion Bancaria" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboMetodoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        buttonAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carrito-de-compras.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.setBorder(null);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.setBorder(null);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(0, 0, 0));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarBoton.png"))); // NOI18N
        buttonCancel.setText("Cancelar");
        buttonCancel.setBorder(null);
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        buttonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.setBorder(null);
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonImpresiont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonImpresiont.setForeground(new java.awt.Color(0, 0, 0));
        buttonImpresiont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        buttonImpresiont.setText("Imprimir");
        buttonImpresiont.setBorder(null);
        buttonImpresiont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImpresiontActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(buttonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(buttonImpresiont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonImpresiont, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tableVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableVenta.setForeground(new java.awt.Color(0, 0, 0));
        tableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "num", "codigo", "producto", "cantidad", "precio unitario", "total", "~", "~"
            }
        ));
        tableVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVenta);
        if (tableVenta.getColumnModel().getColumnCount() > 0) {
            tableVenta.getColumnModel().getColumn(6).setMinWidth(1);
            tableVenta.getColumnModel().getColumn(6).setPreferredWidth(1);
            tableVenta.getColumnModel().getColumn(6).setMaxWidth(1);
            tableVenta.getColumnModel().getColumn(7).setMinWidth(1);
            tableVenta.getColumnModel().getColumn(7).setPreferredWidth(1);
            tableVenta.getColumnModel().getColumn(7).setMaxWidth(1);
        }

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cantidad");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCantidadCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSinUso, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSinUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonImpresiontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImpresiontActionPerformed
        try {
            // TODO add your handling code here:
            message("Generando la factura del cliente correctamente...", "Factura/" + txtNumeroVenta.getText());
            int id = dao.idVenta();
            String numeroVenta = String.format("%05d", id);

            // Creacion del archivo y documento.
            FileOutputStream archivo;
            File file = new File("src/reportesPdf/FacturaVenta" + numeroVenta + ".pdf");
            archivo = new FileOutputStream(file);
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            // ---- Archivo Finalizado.  diseño del documento a partir de ahora.

            SimpleDateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fechaActual = new Date();
            String FechaYhora = fechaFormat.format(fechaActual);

            // Agregar un logo de la compañía
            Image logo = Image.getInstance("src/Imagenes/factura.png");
            logo.scaleAbsolute(100, 50);
            logo.setAlignment(Element.ALIGN_LEFT);
            documento.add(logo);

            // hacemos el formato de fecha a imprimir y creamos un parrafo:.
            Paragraph parrafoFacturaYFecha = new Paragraph();

            // mostramos el numero de la factura y la hora. le damos algunos espacios
            parrafoFacturaYFecha.add("Factura: " + numeroVenta + "\n \n \n" + FechaYhora);

            // creamos el encabezado de una tabla Y le pasamos dos columnas
            PdfPTable encabezado = new PdfPTable(2);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(Rectangle.NO_BORDER);// Si queremos quitamos o colocamor un borde
            encabezado.setSpacingAfter(10);
            encabezado.setSpacingBefore(10);

            // ajustamos sus anchos
            float[] columnasEncabezado = new float[]{60, 70};
            
            encabezado.setWidths(columnasEncabezado);
            // aliniamos como queremos que se vea el encabezado. en este caso hacia la izquierda.
            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            // Bordes
            encabezado.getDefaultCell().setBorder(Rectangle.BOX);

            // hacemos la parte de la compañia del pdf
            String nit = "<< NIT COMPAÑIA>>";
            String nombre = "<<NOMBRE>>";
            String telefono = "<<TELEFONO>>";
            String direccion = "<<DIRECCION>>";
            String correo = "<<CORREO>>";
            
            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Chunk chunk = new Chunk("Nit:" + nit + "\nNombre:" + nombre + "\nTelefono:" + telefono + "\nDireccion:" + direccion + "\nCorreo:" + correo, font);

            // Color de la fuente
            font.setColor(BaseColor.BLUE);

            // Alineación
            Paragraph paragraph = new Paragraph(chunk);
            paragraph.setAlignment(Element.ALIGN_CENTER);

            // Añadimos los datos a una celda.
            encabezado.addCell(paragraph);

            //Añadimos el parrafo de Factura y fecha: 
            encabezado.addCell(parrafoFacturaYFecha);

            // lo añadimo el encabezado al documento. 
            documento.add(encabezado);

            // Estilos de fuente
            Font fontHeader = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE);
            Font fontCell = FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK);

            // Colores para las celdas
            BaseColor headerColor = new BaseColor(0, 121, 182); // Color azul para el encabezado
            BaseColor cellColor = new BaseColor(233, 240, 248); // Color gris claro para las celdas

            // Creación de la tabla de cliente con estilos
            PdfPTable tablaCliente = new PdfPTable(3);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.setSpacingAfter(10f);
            tablaCliente.setSpacingBefore(10f);

            // Celdas del encabezado
            PdfPCell celdaHeaderDocumento = new PdfPCell(new Phrase("Documento", fontHeader));
            celdaHeaderDocumento.setBackgroundColor(headerColor);
            celdaHeaderDocumento.setBorder(Rectangle.NO_BORDER);
            celdaHeaderDocumento.setPadding(5);
            
            PdfPCell celdaHeaderNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaHeaderNombre.setBackgroundColor(headerColor);
            celdaHeaderNombre.setBorder(Rectangle.NO_BORDER);
            celdaHeaderNombre.setPadding(5);
            
            PdfPCell celdaHeaderApellidos = new PdfPCell(new Phrase("Apellidos", fontHeader));
            celdaHeaderApellidos.setBackgroundColor(headerColor);
            celdaHeaderApellidos.setBorder(Rectangle.NO_BORDER);
            celdaHeaderApellidos.setPadding(5);

            // Añadir celdas de encabezado a la tabla
            tablaCliente.addCell(celdaHeaderDocumento);
            tablaCliente.addCell(celdaHeaderNombre);
            tablaCliente.addCell(celdaHeaderApellidos);

            // Celdas con los datos del cliente
            PdfPCell documentoCelda = new PdfPCell(new Phrase(txtDocumento.getText().toUpperCase(), fontCell));
            documentoCelda.setBackgroundColor(cellColor);
            documentoCelda.setBorder(Rectangle.NO_BORDER);
            documentoCelda.setPadding(5);
            
            PdfPCell nombreCelda = new PdfPCell(new Phrase(txtNombre.getText().toUpperCase(), fontCell));
            nombreCelda.setBackgroundColor(cellColor);
            nombreCelda.setBorder(Rectangle.NO_BORDER);
            nombreCelda.setPadding(5);
            
            PdfPCell apellidosCelda = new PdfPCell(new Phrase(txtApellidos.getText().toUpperCase(), fontCell));
            apellidosCelda.setBackgroundColor(cellColor);
            apellidosCelda.setBorder(Rectangle.NO_BORDER);
            apellidosCelda.setPadding(5);

            // Añadir celdas de datos a la tabla
            tablaCliente.addCell(documentoCelda);
            tablaCliente.addCell(nombreCelda);
            tablaCliente.addCell(apellidosCelda);

            // Agregar la tabla al documento
            documento.add(tablaCliente);
            
            float[] columnWidths = new float[]{6f, 3f, 2f, 3f, 3f};

            // Creación de la tabla de productos con estilos
            PdfPTable tablaProducto = new PdfPTable(columnWidths);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.setSpacingAfter(10f);
            tablaProducto.setSpacingBefore(10f);

            // Definición de bordes y colores de las celdas por defecto
            tablaProducto.getDefaultCell().setBorder(PdfPCell.BOX);
            tablaProducto.getDefaultCell().setBorderColor(BaseColor.GRAY);

            // Encabezados de la tabla
            String[] columnas = {"Descripcion", "Producto", "Cantidad", "Precio Unitario", "Total"};
            for (String columna : columnas) {
                PdfPCell header = new PdfPCell();
                header.setBackgroundColor(headerColor);
                header.setBorderWidth(2);
                header.setPhrase(new Phrase(columna, fontHeader));
                tablaProducto.addCell(header);
            }

            // Datos de la tabla
            for (int i = 0; i < tableVenta.getRowCount(); i++) {
                final int fila = i;
                Stream.of(7, 2, 3, 4, 5).forEach((Integer columna) -> {
                    String dato = tableVenta.getModel().getValueAt(fila, columna).toString();
                    PdfPCell cell = new PdfPCell(new Phrase(dato, fontCell));
                    cell.setBackgroundColor(cellColor);
                    cell.setBorderWidth(1);
                    tablaProducto.addCell(cell);
                });
            }

            // Añadir la tabla de productos al documento
            documento.add(tablaProducto);
            
            Font fontIva = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Font fontTotal = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Font fontPie = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 16, BaseColor.DARK_GRAY);

            // Información del IVA
            Paragraph iva = new Paragraph("IVA 19%", fontIva);
            iva.setAlignment(Element.ALIGN_LEFT);
            iva.setSpacingBefore(10);
            documento.add(iva);

            // Información del cargo total
            String cargoTotal = JLabelCargoIva.getText();
            Paragraph informacionCargo = new Paragraph("Total cargo: " + cargoTotal, fontTotal);
            informacionCargo.setAlignment(Element.ALIGN_LEFT);
            informacionCargo.setSpacingBefore(5);
            documento.add(informacionCargo);

            // Información del total a pagar
            String montoTotal = jLabelMontoTotal.getText();
            Paragraph informacionPago = new Paragraph("Total a pagar: $" + montoTotal, fontTotal);
            informacionPago.setAlignment(Element.ALIGN_RIGHT);
            informacionPago.setSpacingBefore(5);
            documento.add(informacionPago);

            // Pie de página
            Paragraph pie = new Paragraph("Gracias por su compra. Vuelva pronto!", fontPie);
            pie.setAlignment(Element.ALIGN_CENTER);
            pie.setSpacingBefore(20);
            documento.add(pie);
            
            documento.close();
            archivo.close();
            Desktop.getDesktop().open(file);
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(registrarVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(registrarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonImpresiontActionPerformed

    private void buttonSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchClientActionPerformed
        // TODO add your handling code here:
        new ventanaCliente(this).setVisible(true);
    }//GEN-LAST:event_buttonSearchClientActionPerformed

    private void buttonSearchProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchProducActionPerformed
        new ventanaProductosVentana(this).setVisible(true);
    }//GEN-LAST:event_buttonSearchProducActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        try {
            // TODO add your handling code here:
            if (comboMetodoPago.getSelectedIndex() == 0) {
                message("Por favor seleccione el metodo de pago.", "Metodo de pago requerido.");
                return;
            }
            
            if (txtCantidadCarrito.getText().isEmpty()) {
                message("Por favor ingrese la cantidad que el cliente va a comprar.", "Campo cantidad vacio...");
                return;
            }
            if (txtDocumento.getText().isEmpty() || txtNombre.getText().isEmpty()) {
                message("No se puede agregar sin las referencia del cliente.Por favor busque y seleccione al cliente.", "Campos requeridos vacios.");
                return;
            }
            if (txtCodigo.getText().isEmpty() || txtProducto.getText().isEmpty() || txtStock.getText().isEmpty()
                    || txtPrecion.getText().isEmpty()) {
                message("Por favor ingrese los datos del producto o busquelo desde el boton.", "Campos requeridos vacios");
            } else {
                String codigo = txtCodigo.getText();
                String nombreProducto = txtProducto.getText();
                int cantidadDisponible = Integer.parseInt(txtStock.getText());
                int cantidadVentad = Integer.parseInt(txtCantidadCarrito.getText());
                double precio = Double.parseDouble(txtPrecion.getText());
                if (cantidadVentad <= cantidadDisponible || cantidadVentad == 0) {
                    itemVenta = itemVenta + 1;
                    modelTable = (DefaultTableModel) tableVenta.getModel();
                    
                    for (int i = 0; i < tableVenta.getRowCount(); i++) {
                        Object cellValue = tableVenta.getValueAt(i, 1);
                        if (cellValue != null && cellValue.equals(txtCodigo.getText())) {
                            message("Este producto ya esta agregado a la venta.", "Intento de duplicacion.");
                            return;
                        }
                    }
                    
                    ArrayList listaVenta = new ArrayList();
                    listaVenta.add(itemVenta);
                    listaVenta.add(codigo);
                    listaVenta.add(nombreProducto);
                    listaVenta.add(cantidadVentad);
                    listaVenta.add(precio);
                    listaVenta.add(calcularTotal(cantidadVentad, precio));
                    listaVenta.add(cantidadDisponible);
                    listaVenta.add(txtDescripcion.getText());
                    /*------------------------------------------------------------*/
                    Object[] objeto = new Object[8];
                    objeto[0] = listaVenta.get(0);
                    objeto[1] = listaVenta.get(1);
                    objeto[2] = listaVenta.get(2);
                    objeto[3] = listaVenta.get(3);
                    objeto[4] = listaVenta.get(4);
                    objeto[5] = listaVenta.get(5);
                    objeto[6] = listaVenta.get(6);
                    objeto[7] = listaVenta.get(7);
                    System.out.println(Arrays.toString(objeto));
                    modelTable.addRow(objeto);
                    calcularTotal(cantidadVentad, precio);
                    totalVenta = calcularTotal(cantidadVentad, precio);
                    sumaVentas += totalPago(calcularTotal(cantidadVentad, precio));
                    sumaCargo += Cargo;
                    totalPago(sumaVentas);
                    totalCargoIVA(sumaCargo);
                    tableVenta.setModel(modelTable);
                    int nuevo = cantidadDisponible - cantidadVentad;
                    dao.actualizarStock(nuevo, codigo);
                    int idP = Integer.parseInt(txtIdProducto.getText());
                    ProductoVendido productoVendido = new ProductoVendido();
                    productoVendido.setIdProducto(idP);
                    productoVendido.setCantidad(cantidadVentad);
                    productoVendido.setPrecioUnitario(precio);
                    productoVendido.setTotalVenta(totalVenta);
                    productoVendido.setCargo(Cargo);
                    productosVendidos.add(productoVendido);
                    
                } else {
                    message("la cantidad no coincide con el stock disponible, por favor ingrese la cantidad correcta.", "Cantidad incorrecta");
                }
                
            }
        } catch (Exception ex) {
            Logger.getLogger(registrarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        // TODO add your handling code here:

        limpiar();
        limpiarCliente();
        limpiarCalculos();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:

        modelTable = (DefaultTableModel) tableVenta.getModel();
        int selectRow = tableVenta.getSelectedRow();
        if (selectRow == itemVenta || selectRow != itemVenta) {
            double monto = (double) modelTable.getValueAt(selectRow, 5);
            double cargo = productosVendidos.get(selectRow).getCargo();
            
            sumaVentas -= monto;
            sumaCargo -= cargo;
            itemVenta -= itemVenta;
            
            totalPago(sumaVentas);
            totalCargoIVA(sumaCargo);
            
            jLabelIva.setText("0.00");
            jLabelTotalVenta.setText("0.00");
            
            dao.actualizarStock(Integer.parseInt(txtStock.getText()), txtCodigo.getText());
            
            modelTable.removeRow(selectRow);
            productosVendidos.remove(selectRow);
        } else {
            message("Por favor seleccione el producto añadido en la tabla.", "Seleccione el producto.");
        }
        

    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        if (comboMetodoPago.getSelectedIndex() == 0
                || txtNombre.getText().isEmpty()
                || txtDocumento.getText().isEmpty()
                || txtIdCliente.getText().isEmpty()
                || jLabelMontoTotal.getText().isEmpty()
                || txtCantidadCarrito.getText().isEmpty()
                || txtIdProducto.getText().isEmpty()) {
            
            message("Se necesita los datos del cliente y la venta agregada para guardar la venta.", "Informacion requerida nula...");
        } else {
            int question = JOptionPane.showConfirmDialog(rootPane,
                    "¿Quieres concluir la venta?, verifica que el cliente este seguro.",
                    "Guardando...?", JOptionPane.YES_NO_CANCEL_OPTION);
            if (question == JOptionPane.YES_OPTION) {
                data.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
                data.setMetodoPago(comboMetodoPago.getSelectedIndex());
                boolean registrado = dao.RegistrarVenta(data);
                int id = dao.idVenta();
                txtNumeroVenta.setText(String.format("%05d", id));
                if (registrado) {
                    registrarDetalle(id);
                    message("Venta realiza  al cliente " + txtNombre.getText() + " con exito! ", "Venta satifactoria");
                    recordDescription(modelo, "el usuario hizo una venta.");
                } else {
                    message("Por favor seleccione e ingrese todos los datos requeridos.", "Campos vacios...");
                }
                
            } else {
                limpiar();
                limpiarCliente();
            }
            
        }
        

    }//GEN-LAST:event_buttonSaveActionPerformed

    private void tableVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVentaMouseClicked
        // TODO add your handling code here:
        int fila = tableVenta.rowAtPoint(evt.getPoint());
        txtSinUso.setText(tableVenta.getModel().getValueAt(fila, 0).toString().trim().toUpperCase());
        txtCodigo.setText(tableVenta.getModel().getValueAt(fila, 1).toString().trim().toUpperCase());
        txtProducto.setText(tableVenta.getModel().getValueAt(fila, 2).toString().trim().toUpperCase());
        txtPrecion.setText(tableVenta.getModel().getValueAt(fila, 4).toString().trim().toUpperCase());
        txtStock.setText(tableVenta.getModel().getValueAt(fila, 6).toString().trim());
        txtDescripcion.setText(tableVenta.getModel().getValueAt(fila, 7).toString().trim());

    }//GEN-LAST:event_tableVentaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarVenta().setVisible(true);
            }
        });
    }
    
    public void setTextProducto(HashMap<String, String> text) {
        txtIdProducto.setText(text.get("Id"));
        txtCodigo.setText(text.get("code"));
        txtProducto.setText(text.get("producto"));
        txtDescripcion.setText(text.get("descripcion"));
        txtPrecion.setText(text.get("precio"));
        txtStock.setText(text.get("disponible"));
    }
    
    public void SetTextCliente(HashMap<String, String> text) {
        txtIdCliente.setText(text.get("id"));
        txtDocumento.setText(text.get("documento"));
        txtNombre.setText(text.get("nombre"));
        txtApellidos.setText(text.get("apellidos"));
    }
    
    public void message(String message, String title) {
        JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void detallesDeventa() {
        Date fechaHoy = new Date();
        SimpleDateFormat formateoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String Fecha = String.format(formateoFecha.format(fechaHoy));
        txtFecha.setText(Fecha);
        txtEmpleadoNombre.setText(modelo.getEmpleado() + " " + " " + modelo.getApellidos());
    }
    
    private void recordDescription(modeloTransferencia modelo, String acctionRealized) {
        modelo = general.transferencia;
        String acction = acctionRealized;
        Auditoria dataAcction = new Auditoria();
        auditoriaDAO saveAcction = new auditoriaDAO();
        dataAcction.setAccionUser(acction);
        dataAcction.setIdUser(modelo.getIdUser());
        saveAcction.RegistrarAccion(dataAcction);
        
    }
    
    private double calcularTotal(int cantidad, double precio) {
        double iva = 0.19;
        double total = cantidad * precio;
        jLabelTotalVenta.setText(String.format("%,.0f", total));
        double cargoIVA = total * iva;
        jLabelIva.setText(String.format("%,.0f", cargoIVA));
        double totalVenta = total + cargoIVA;
        Cargo = cargoIVA;
        
        return totalVenta;
    }
    
    private double totalPago(double montoTotal) {
        
        jLabelMontoTotal.setText(String.format("%,.0f", montoTotal));
        return montoTotal;
        
    }
    
    private double totalCargoIVA(double totalCargo) {
        
        JLabelCargoIva.setText(String.format("%,.0f", totalCargo));
        return totalCargo;
    }
    
    private void limpiar() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtCantidadCarrito.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtPrecion.setText("");
        JLabelCargoIva.setText("00.00");
        jLabelMontoTotal.setText("00.00");
        jLabelTotalVenta.setText("00.00");
        jLabelIva.setText("00.00");
        modelTable = (DefaultTableModel) tableVenta.getModel();
        int NumFilas = tableVenta.getRowCount();
        for (int i = 0; i < NumFilas; i++) {
            modelTable.removeRow(0);
        }
        
    }
    
    private void limpiarCliente() {
        comboMetodoPago.setSelectedIndex(0);
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
    }
    
    private void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });
        
    }
    
    private void registrarDetalle(int id) {
        for (ProductoVendido productoVendido : productosVendidos) {
            DetalleVenta detalle = new DetalleVenta();
            detalle.setIdVenta(id);
            detalle.setIdProducto(productoVendido.getIdProducto());
            detalle.setIdEmpleado(modelo.getIdEmpleado());
            detalle.setCantida(productoVendido.getCantidad());
            detalle.setPrecioUnitario(productoVendido.getPrecioUnitario());
            detalle.setMontoTotal(productoVendido.getTotalVenta());
            
            DetalleDAO.registrarDetalle(detalle);
        }
    }
    
    private void limpiarCalculos() {
        itemVenta = 0;
        sumaCargo = 0.00;
        sumaVentas = 0.00;
        totalVenta = 0.00;
        jLabelTotalVenta.setText("00.00");
        jLabelIva.setText("00.00");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelCargoIva;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonImpresiont;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearchClient;
    private javax.swing.JButton buttonSearchProduc;
    private javax.swing.JComboBox<String> comboMetodoPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIva;
    private javax.swing.JLabel jLabelMontoTotal;
    private javax.swing.JLabel jLabelTotalVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tableVenta;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantidadCarrito;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmpleadoNombre;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroVenta;
    private javax.swing.JTextField txtPrecion;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSinUso;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
