package vistaFormularios.frmPrincipales.frmDesarrollo;

import Reporte.Excel;
import capaEntidades.Auditoria;
import capaEntidades.Producto;
import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.perfil_Y_usuario;
import entidadesDAO.ProductoDAO;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.categoriaDAO;
import entidadesDAO.marcaDAO;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.ventanaProveedor;

public class registrarProducto extends javax.swing.JFrame {

    modeloTransferencia modelo = general.transferencia;
    ProductoDAO saveDatas = new ProductoDAO();
    Producto data = new Producto();

    public registrarProducto() {
        initComponents();
        setTitle("Registro de productos");
        this.setExtendedState(registrarProducto.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        List<Producto> listp = saveDatas.productosGuardados();
        Table(listp);
        listDescriptions();
        listCategorys();
        verificationCloseWindows();
        EscondesTxtId();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextPane();
        buttonSearchProveedor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        numericPrecio = new javax.swing.JSpinner();
        dateVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonEmpty = new javax.swing.JButton();
        buttonClosed = new javax.swing.JButton();
        buttonReport = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        buttonSave = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonMarca = new javax.swing.JButton();
        buttonCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el codigo");

        txtCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese el nombre");

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese la descripcion");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Seleccione la marca");

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seleccione la categoria");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese el stock");

        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Proveedor");

        txtDocument.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtDescription);

        buttonSearchProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearchProveedor.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearchProveedor.setText("...");
        buttonSearchProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSearchProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchProveedorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ingrese el precio del producto");

        numericPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, 1.0E62d, 15000.0d));
        numericPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Seleccione la fecha de vencimiento");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Busque al proveedor");

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar por:");

        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Codigo", "Nombre", "Marca", "Categoria", "Proveedor", " " }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonEmpty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEmpty.setForeground(new java.awt.Color(0, 0, 0));
        buttonEmpty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonEmpty.setText("Limpiar");
        buttonEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmptyActionPerformed(evt);
            }
        });

        buttonClosed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClosed.setForeground(new java.awt.Color(0, 0, 0));
        buttonClosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.png"))); // NOI18N
        buttonClosed.setText("Salir");
        buttonClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClosedActionPerformed(evt);
            }
        });

        buttonReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonReport.setForeground(new java.awt.Color(0, 0, 0));
        buttonReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        buttonReport.setText("Reporte");
        buttonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonClosed, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEmpty)
                            .addComponent(buttonClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones de registro"));

        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        buttonSave.setText("Guardar");
        buttonSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2)_1.png"))); // NOI18N
        buttonUpdate.setText("Actualizar");
        buttonUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMarca.setForeground(new java.awt.Color(0, 0, 0));
        buttonMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarxd.png"))); // NOI18N
        buttonMarca.setText("Marca");
        buttonMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMarcaActionPerformed(evt);
            }
        });

        buttonCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCategory.setForeground(new java.awt.Color(0, 0, 0));
        buttonCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarxd.png"))); // NOI18N
        buttonCategory.setText("Categoria");
        buttonCategory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(buttonCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(buttonCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numericPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(buttonSearchProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(comboMarca)
                    .addComponent(comboCategory)
                    .addComponent(txtStock)
                    .addComponent(txtDocument))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel4))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numericPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonSearchProveedor)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoryActionPerformed

    private void buttonSearchProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchProveedorActionPerformed
        // TODO add your handling code here:
        new ventanaProveedor(this).setVisible(true);
    }//GEN-LAST:event_buttonSearchProveedorActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:

        try {
            if (txtCode.getText().isEmpty() || txtDescription.getText().isEmpty() || txtDocument.getText().isEmpty()
                    || txtName.getText().isEmpty() || comboMarca.getSelectedIndex() == 0 || comboCategory.getSelectedIndex() == 0
                    || txtStock.getText().isEmpty() || numericPrecio.getValue() == null || dateVencimiento.getDate() == null) {

                JOptionPane.showMessageDialog(rootPane, "Por favor, completa todos los campos.", "Campos vacíos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Seguro desea registrar el producto?", "Registrando...", JOptionPane.INFORMATION_MESSAGE);
                if (respuesta == JOptionPane.YES_NO_OPTION) {
                    driverExceptions();

                    int indexMarca = comboMarca.getSelectedIndex();
                    int indexCategory = comboCategory.getSelectedIndex();
                    data.setCodigo(txtCode.getText());
                    data.setNombre(txtName.getText());
                    data.setDescripcion(txtDescription.getText());
                    data.setIdMarca(indexMarca);
                    data.setIdCategoria(indexCategory);
                    data.setStock(Integer.parseInt(txtStock.getText()));
                    data.setPrecio(Double.parseDouble(numericPrecio.getValue().toString()));
                    data.setIdProveedor(Integer.parseInt(txtIdProveedor.getText()));
                    // Obtén la fecha del JCalendar
                    java.util.Date dateVencimientoUtil = dateVencimiento.getDate();
                    java.sql.Date fechaVencimientoSql = new java.sql.Date(dateVencimientoUtil.getTime());
                    data.setFechaVencimiento(fechaVencimientoSql);
                    if (saveDatas.verificarRegistro(txtCode.getText())) {
                        JOptionPane.showMessageDialog(rootPane, "Error:el Producto ya esta registrado.Solo actualice su stock", "Intento de duplicacion", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    saveDatas.registrarProducto(data);
                    JOptionPane.showMessageDialog(rootPane, "El producto " + txtName.getText() + " ha sido registrado existosamente!", "Registro de producto", JOptionPane.INFORMATION_MESSAGE);
                    List<Producto> listP = saveDatas.productosGuardados();
                    Table(listP);
                    String acctionMessage = "El usuario registro un producto.";
                    recordDescription(modelo, acctionMessage);

                } else {
                    clearRecord();
                }

            }

        } catch (Exception e) {
            System.out.println("error:" + e);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMarcaActionPerformed
        // TODO add your handling code here:
        new registrarMarca(this).setVisible(true);


    }//GEN-LAST:event_buttonMarcaActionPerformed

    private void buttonCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCategoryActionPerformed
        // TODO add your handling code here:
        new registrarCategoria(this).setVisible(true);

    }//GEN-LAST:event_buttonCategoryActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int fila = table.rowAtPoint(evt.getPoint());
        txtIdProducto.setText(table.getModel().getValueAt(fila, 0).toString().trim());
        txtIdProveedor.setText(table.getModel().getValueAt(fila, 1).toString().trim());
        txtMarca.setText(table.getModel().getValueAt(fila, 2).toString().trim());
        txtCategoria.setText(table.getModel().getValueAt(fila, 3).toString().trim());
        txtCode.setText(table.getModel().getValueAt(fila, 4).toString().trim());
        txtName.setText(table.getModel().getValueAt(fila, 5).toString().trim());
        txtDescription.setText(table.getModel().getValueAt(fila, 6).toString().trim());
        comboMarca.setSelectedItem(table.getModel().getValueAt(fila, 7).toString().trim());
        comboCategory.setSelectedItem(table.getModel().getValueAt(fila, 8).toString().trim());
        txtStock.setText(table.getModel().getValueAt(fila, 9).toString().trim());
        numericPrecio.setValue(table.getModel().getValueAt(fila, 10));
        dateVencimiento.setDate((Date) table.getModel().getValueAt(fila, 11));
        txtDocument.setText(table.getModel().getValueAt(fila, 13).toString().trim());


    }//GEN-LAST:event_tableMouseClicked

    private void buttonEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmptyActionPerformed
        // TODO add your handling code here:
        clearRecord();
        List<Producto> list = saveDatas.productosGuardados();
        Table(list);
    }//GEN-LAST:event_buttonEmptyActionPerformed

    private void buttonClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClosedActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_buttonClosedActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (txtCode.getText().isEmpty() || txtDescription.getText().isEmpty() || txtDocument.getText().isEmpty()
                    || txtName.getText().isEmpty() || comboMarca.getSelectedIndex() == 0 || comboCategory.getSelectedIndex() == 0
                    || txtStock.getText().isEmpty() || numericPrecio.getValue() == null || dateVencimiento.getDate() == null) {

                JOptionPane.showMessageDialog(rootPane, "Por favor, completa todos los campos.", "Campos vacíos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Seguro desea actualizar el producto?", "Registrando...", JOptionPane.INFORMATION_MESSAGE);
                if (respuesta == JOptionPane.YES_NO_OPTION) {
                    driverExceptions();

                    int indexMarca = comboMarca.getSelectedIndex();
                    int indexCategory = comboCategory.getSelectedIndex();
                    data.setId(Integer.parseInt(txtIdProducto.getText()));
                    data.setCodigo(txtCode.getText());
                    data.setNombre(txtName.getText());
                    data.setDescripcion(txtDescription.getText());
                    data.setIdMarca(indexMarca);
                    data.setIdCategoria(indexCategory);
                    data.setStock(Integer.parseInt(txtStock.getText()));
                    data.setPrecio(Double.parseDouble(numericPrecio.getValue().toString()));
                    data.setIdProveedor(Integer.parseInt(txtIdProveedor.getText()));
                    java.util.Date dateVencimientoUtil = dateVencimiento.getDate();
                    java.sql.Date fechaVencimientoSql = new java.sql.Date(dateVencimientoUtil.getTime());
                    data.setFechaVencimiento(fechaVencimientoSql);
                    boolean isUpdate = saveDatas.actualizarProducto(data);
                    if (isUpdate) {
                        JOptionPane.showMessageDialog(rootPane, "El producto " + txtName.getText() + " ha sido Actualizado existosamente!", "Actualizacion de producto", JOptionPane.INFORMATION_MESSAGE);
                        List<Producto> list = saveDatas.productosGuardados();
                        Table(list);
                        String acctionMessage = "El usuario actualizo un producto.";
                        recordDescription(modelo, acctionMessage);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al actualizar el producto.A segurese de haberlo seleccionado en la ", "Error...", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    clearRecord();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        if (comboSearch.getSelectedIndex() == 0 || txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione el tipo de busqueda o ingrese el dato a buscar.", "Busqueda sin referencias", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String typeDato = comboSearch.getSelectedItem().toString();
            String value = txtSearch.getText();
            List listSearch = saveDatas.busquedaProducto(typeDato, value);
            if (!listSearch.isEmpty()) {
                Table(listSearch);
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró ningún producto con el tipo dato: " + typeDato + " ingresado.", "Busqueda fallida...", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_buttonSearchActionPerformed

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSearchActionPerformed

    private void buttonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReportActionPerformed
        // TODO add your handling code here:
        Excel.reporte();
    }//GEN-LAST:event_buttonReportActionPerformed

    public void setText(HashMap<String, String> text) {
        txtIdProveedor.setText(text.get("IdProveedor"));
        txtDocument.setText(text.get("DocumentProveedor"));
    }

    public final void listDescriptions() {
        marcaDAO dao = new marcaDAO();
        List<String> descripciones = dao.obtenerDescripciones();
        for (String descripcion : descripciones) {
            comboMarca.removeItem(descripcion);
            comboMarca.addItem(descripcion);
        }

    }

    public final void listCategorys() {

        categoriaDAO dao = new categoriaDAO();
        List<String> list = dao.obtenerCategoria();
        for (String description : list) {
            comboCategory.removeItem(description);
            comboCategory.addItem(description);

        }
    }

    private void driverExceptions() throws Exception {
        String codigo = txtCode .getText().toUpperCase();
        if (codigo.isEmpty() || !codigo.matches("[A-Za-z0-9-]+")) {
            JOptionPane.showMessageDialog(rootPane, "El código del producto debe contener solo letras, números y guiones.", "Téngalo en cuenta", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception("El código del producto debe contener solo letras, números y guiones.");
        }

        double precio;
        try {
            precio = Double.parseDouble(numericPrecio.getValue().toString());
            if (precio <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Error:El precio debe ser mayor que 0.", "Por favor tengalo en cuenta.", JOptionPane.INFORMATION_MESSAGE);
                throw new Exception("El precio debe ser mayor que 0.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error:El precio debe ser un número.", "Por favor ingrese un valor numerico", JOptionPane.ERROR_MESSAGE);
            throw new Exception("El precio debe ser un número.");
        }
        int stock;
        try {
            stock = Integer.parseInt(txtStock.getText());
            if (stock < 0) {
                JOptionPane.showMessageDialog(rootPane, "Error:El stock debe ser un número entero no negativo.", "Ingrese bien el stock", JOptionPane.ERROR_MESSAGE);
                throw new Exception("El stock debe ser un número entero no negativo.");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El stock debe ser un número entero.", "No ingrese caracteres en el campo stock.", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception("El stock debe ser un número entero.");
        }
        // Obtén la fecha del JCalendar
        java.util.Date fechaVencimientoUtil = dateVencimiento.getDate();

        // Validación de fecha para la fecha de vencimiento
        java.util.Date fechaActual = new java.util.Date();
        if (fechaVencimientoUtil.before(fechaActual)) {
            JOptionPane.showMessageDialog(rootPane, "La fecha de vencimiento debe ser una fecha futura no la actual.", "Ingrese correctamente la fecha", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception("La fecha de vencimiento debe ser una fecha futura.");

        }

    }

    private void Table(List<Producto> list) {

        DefaultTableModel modelTable = new DefaultTableModel();
        String columns[] = {"Id1", "Id2", "id3", "id4,", "Codigo",
            "Nombre", "Descripcion", "Marca", "Categoria", "Stock",
            "Precio", "Vencimiento", "Registro", "Proveedor"};
        modelTable.setColumnIdentifiers(columns);

        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            modelTable.addRow(new Object[]{
                list.get(i).getId(), //0
                list.get(i).getIdProveedor(), //1 0
                list.get(i).getIdMarca(),//2 0
                list.get(i).getIdCategoria(),//3 0
                list.get(i).getCodigo(),//4 1
                list.get(i).getNombre(),//5 2
                list.get(i).getDescripcion(),//6 3
                list.get(i).getMarca(),//7 4
                list.get(i).getCategoria(),//8 5
                list.get(i).getStock(),//9 6
                list.get(i).getPrecio(), // 10  7
                list.get(i).getFechaVencimiento(),//11 8
                list.get(i).getFechaRegistro(),//12 9
                list.get(i).getProveedor()//13 10

            });

        }
        table.setModel(modelTable);
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component c = table.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

               
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }

        table.removeColumn(table.getColumnModel().getColumn(0));
        table.removeColumn(table.getColumnModel().getColumn(0));
        table.removeColumn(table.getColumnModel().getColumn(0));
        table.removeColumn(table.getColumnModel().getColumn(0));

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

    private void clearRecord() {
        txtIdProducto.setText("");
        txtIdProveedor.setText("");
        txtCode.setText("");
        txtName.setText("");
        txtDescription.setText("");
        comboMarca.setSelectedIndex(0);
        comboCategory.setSelectedIndex(0);
        txtStock.setText("");
        numericPrecio.setValue(0);
        dateVencimiento.setCalendar(null);
        txtDocument.setText("");
    }

    private void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    } 
    private void EscondesTxtId(){
        txtIdProducto.setVisible(false);
        txtIdProveedor.setVisible(false);
        txtMarca.setVisible(false);
        txtCategoria.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCategory;
    private javax.swing.JButton buttonClosed;
    private javax.swing.JButton buttonEmpty;
    private javax.swing.JButton buttonMarca;
    private javax.swing.JButton buttonReport;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonSearchProveedor;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboSearch;
    private com.toedter.calendar.JDateChooser dateVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner numericPrecio;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextPane txtDescription;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
