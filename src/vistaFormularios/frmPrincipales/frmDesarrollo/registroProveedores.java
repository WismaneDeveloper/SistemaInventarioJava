package vistaFormularios.frmPrincipales.frmDesarrollo;

import capaEntidades.cliente;
import capaEntidades.perfil_Y_usuario;
import capaEntidades.proveedor;
import entidadesDAO.clientesDAO;
import entidadesDAO.proveedorDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaProveedores;

public class registroProveedores extends javax.swing.JFrame {

    proveedor dataProveedor = new proveedor();
    proveedorDAO saveDataProveedor = new proveedorDAO();
    cliente dataCliente = new cliente();
    clientesDAO saveDataCliente = new clientesDAO();

    public registroProveedores() {
        initComponents();
        setTitle("Ventana registro: Provedores/Clientes");
        this.setLocationRelativeTo(null);
        this.setExtendedState(registroProveedores.MAXIMIZED_BOTH);
        this.setResizable(false);
//        txtIdProveedor.setVisible(false);
        verificationCloseWindows();
        ToolTipManager.sharedInstance().setInitialDelay(0);
        messageReference();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboRecord = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        buttonUpdate = new javax.swing.JButton();
        buttonSaveProveedor = new javax.swing.JButton();
        buttonVoidtxts = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        comboSearch = new javax.swing.JComboBox<>();
        buttonSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        checkOpcion = new javax.swing.JCheckBox();
        buttonSeeClients = new javax.swing.JButton();
        buttonSeeProveedor = new javax.swing.JButton();
        checkUpdate = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdentify = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de proveedor Y Cliente");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quien desea registrar");

        comboRecord.setBackground(new java.awt.Color(255, 255, 255));
        comboRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboRecord.setForeground(new java.awt.Color(0, 0, 0));
        comboRecord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Proveedor", "Cliente\t" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(238, 238, 238)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(comboRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(comboRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

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

        buttonSaveProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSaveProveedor.setForeground(new java.awt.Color(0, 0, 0));
        buttonSaveProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        buttonSaveProveedor.setText("Guardar");
        buttonSaveProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSaveProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveProveedorActionPerformed(evt);
            }
        });

        buttonVoidtxts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonVoidtxts.setForeground(new java.awt.Color(0, 0, 0));
        buttonVoidtxts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonVoidtxts.setText("Limpiar");
        buttonVoidtxts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVoidtxts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoidtxtsActionPerformed(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(0, 0, 0));
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.png"))); // NOI18N
        buttonBack.setText("Salir");
        buttonBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seleccione");

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboSearch.setBackground(new java.awt.Color(255, 255, 255));
        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~", "Documento", "Nombre", "Apellidos", "Telefono", "Correo" }));
        comboSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buttonSearch.setText("Buscar...");
        buttonSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar por:");

        checkOpcion.setBackground(new java.awt.Color(0, 51, 255));
        checkOpcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkOpcion.setForeground(new java.awt.Color(255, 255, 255));
        checkOpcion.setText("Proveedor/Cliente");

        buttonSeeClients.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeeClients.setForeground(new java.awt.Color(0, 0, 0));
        buttonSeeClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        buttonSeeClients.setText("Ver clientes");
        buttonSeeClients.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSeeClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeeClientsActionPerformed(evt);
            }
        });

        buttonSeeProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSeeProveedor.setForeground(new java.awt.Color(0, 0, 0));
        buttonSeeProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        buttonSeeProveedor.setText("ver proveedores");
        buttonSeeProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSeeProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeeProveedorActionPerformed(evt);
            }
        });

        checkUpdate.setBackground(new java.awt.Color(0, 51, 255));
        checkUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkUpdate.setForeground(new java.awt.Color(255, 255, 255));
        checkUpdate.setText("Proveedor/Cliente");
        checkUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUpdateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seleccione una actualizacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSeeClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSaveProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonVoidtxts, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeeProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(checkUpdate)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(checkOpcion)
                        .addGap(42, 42, 42)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35)
                        .addComponent(comboSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSearch)
                            .addComponent(jLabel8)
                            .addComponent(checkOpcion))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonVoidtxts, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkUpdate)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSeeClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(buttonSeeProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento/nit");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        txtIdentify.setBackground(new java.awt.Color(255, 255, 255));
        txtIdentify.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIdentify.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdentify.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhone.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.setCaretColor(new java.awt.Color(0, 0, 0));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCorreo.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Direccion");

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion.setCaretColor(new java.awt.Color(0, 0, 0));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdentify)
                                        .addGap(3, 3, 3)))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtPhone))
                                        .addGap(100, 100, 100))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(362, 362, 362)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                    .addComponent(txtDireccion))))
                        .addGap(31, 31, 31))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdentify, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido)
                    .addComponent(txtPhone)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void buttonSaveProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveProveedorActionPerformed
        // TODO add your handling code here:
        switch (comboRecord.getSelectedIndex()) {
            case 1:
                registroProveedores();
                break;
            case 2:
                registrarCliente();
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Por favor, seleccione el tipo de registro.", "Seleccione cliente o proveedor", JOptionPane.ERROR_MESSAGE);
                break;
        }

    }//GEN-LAST:event_buttonSaveProveedorActionPerformed

    private void buttonVoidtxtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoidtxtsActionPerformed
        // TODO add your handling code here: 
        limpiar();
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }


    }//GEN-LAST:event_buttonVoidtxtsActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (txtSearch.getText().isEmpty() || comboSearch.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingresar y seleccionar el dato del proveedor/Cliente que desea buscar.", "Campo busqueda sin valor", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (checkOpcion.isSelected()) {
                String search = comboSearch.getSelectedItem().toString();
                String value = txtSearch.getText();
                List listSearch = saveDataProveedor.busquedaProveedor(search, value);
                if (!listSearch.isEmpty()) {
                    ProveedoresSaves(listSearch);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún proveedor con el tipo dato: " + search + " ingresado.", "Busqueda fallida...", JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                String search = comboSearch.getSelectedItem().toString();
                String value = txtSearch.getText();
                List listSearch = saveDataCliente.busquedaCliente(search, value);
                if (!listSearch.isEmpty()) {
                    clientesSaves(listSearch);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontró ningún cliente con el tipo dato: " + search + " ingresado.", "Busqueda fallida...", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (Exception e) {
            System.out.println("Erro de busqueda boton:" + e);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:

        new MenuPrincipal().setVisible(true);
        this.dispose();


    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here: 
        if (checkUpdate.isSelected()) {
            if (!txtIdentify.getText().isEmpty() && !txtId.getText().isEmpty() && !txtName.getText().isEmpty()) {
                String mensaje = "¿Seguro desea actualizar el proveedor?";
                int question = JOptionPane.showConfirmDialog(rootPane, mensaje, "Registro...",
                        JOptionPane.INFORMATION_MESSAGE);
                if (question == JOptionPane.YES_OPTION) {
                    dataProveedor.setId(Integer.parseInt(txtId.getText()));
                    dataProveedor.setDocument(txtIdentify.getText());
                    dataProveedor.setNameProveedor(txtName.getText());
                    dataProveedor.setLastName(txtApellido.getText());
                    dataProveedor.setCorreo(txtCorreo.getText());
                    dataProveedor.setDireccion(txtDireccion.getText());
                    dataProveedor.setTelefono(txtPhone.getText());
                    boolean isUpdate = saveDataProveedor.actualizarProveedor(dataProveedor);
                    if (isUpdate) {
                        String nombreProveedor = dataProveedor.getNameProveedor();
                        JOptionPane.showMessageDialog(rootPane, "Proveedor " + nombreProveedor + " Actualizado con exito! Puede buscar  los cambios.", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al actualizar el Proveedor.A segurese de haberlo seleccionado en la lista", "Error...", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor asegurese de selecciona un tipo de actualizacion.Ademas seleccionar el cliente directamente desde la tabla.", "Campo/s vacio", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (!txtIdentify.getText().isEmpty() && !txtId.getText().isEmpty() && !txtName.getText().isEmpty()) {
                String mensaje = "¿Seguro desea actualizar el cliente?";
                int question = JOptionPane.showConfirmDialog(rootPane, mensaje, "Registro...",
                        JOptionPane.INFORMATION_MESSAGE);
                if (question == JOptionPane.YES_OPTION) {
                    dataCliente.setId(Integer.parseInt(txtId.getText()));
                    dataCliente.setDocument(Integer.parseInt(txtIdentify.getText()));
                    dataCliente.setNameClient(txtName.getText());
                    dataCliente.setSurName(txtApellido.getText());
                    dataCliente.setCorreo(txtCorreo.getText());
                    dataCliente.setDireccion(txtDireccion.getText());
                    dataCliente.setTelNumber(txtPhone.getText());
                    boolean isUpdate = saveDataCliente.actualizarCliente(dataCliente);
                    if (isUpdate) {
                        String nombreCliente = dataCliente.getNameClient();
                        JOptionPane.showMessageDialog(rootPane, "Cliente " + nombreCliente + " Actualizado con exito! Puede buscar ver los cambios.", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al actualizar el cliente.A segurese de haberlo seleccionado en la lista", "Error...", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor asegurese de  seleccionar el cliente directamente desde la tabla.", "Campo/s vacio", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonSeeProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeeProveedorActionPerformed
        // TODO add your handling code here:
        List<proveedor> list = saveDataProveedor.proveedoresRegistrados();
        ProveedoresSaves(list);
    }//GEN-LAST:event_buttonSeeProveedorActionPerformed

    private void buttonSeeClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeeClientsActionPerformed
        // TODO add your handling code here:

        List<cliente> list = saveDataCliente.clientesRegistrados();
        clientesSaves(list);
    }//GEN-LAST:event_buttonSeeClientsActionPerformed

    private void checkUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkUpdateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int fila = table.rowAtPoint(evt.getPoint());
        txtId.setText(table.getModel().getValueAt(fila, 0).toString().trim().toUpperCase());
        txtName.setText(table.getModel().getValueAt(fila, 2).toString().trim().toUpperCase());
        txtIdentify.setText(table.getModel().getValueAt(fila, 1).toString().trim().toUpperCase());
        txtApellido.setText(table.getModel().getValueAt(fila, 3).toString().trim().toUpperCase());
        txtCorreo.setText(table.getModel().getValueAt(fila, 4).toString().trim().toUpperCase());
        txtPhone.setText(table.getModel().getValueAt(fila, 5).toString().trim().toUpperCase());
        txtDireccion.setText(table.getModel().getValueAt(fila, 6).toString().trim().toUpperCase());
    }//GEN-LAST:event_tableMouseClicked

    private void ProveedoresSaves(List<proveedor> proveedoresList) {
        DefaultTableModel modelTable = new DefaultTableModel();
        String colums[] = {"Id","Documento", "Nombre", "Apellidos", "Correo", "Telefono", "Direccion"};
        modelTable.setColumnIdentifiers(colums);
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < proveedoresList.size(); i++) {
            modelTable.addRow(new Object[]{
                proveedoresList.get(i).getId(),
                proveedoresList.get(i).getDocument(),
                proveedoresList.get(i).getNameProveedor(),
                proveedoresList.get(i).getLastName(),
                proveedoresList.get(i).getCorreo(),
                proveedoresList.get(i).getTelefono(),
                proveedoresList.get(i).getDireccion()
            });
        }
        table.setModel(modelTable);
        table.removeColumn(table.getColumnModel().getColumn(0));
    }

    public void clientesSaves(List<cliente> listClientes) {
        DefaultTableModel modelTable = new DefaultTableModel();
        String colums[] = {"Id","Documento", "Nombre", "Apellidos", "Correo", "Telefono", "Direccion"};
        modelTable.setColumnIdentifiers(colums);
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < listClientes.size(); i++) {
            modelTable.addRow(new Object[]{
                listClientes.get(i).getId(),
                listClientes.get(i).getDocument(),
                listClientes.get(i).getNameClient(),
                listClientes.get(i).getSurName(),
                listClientes.get(i).getCorreo(),
                listClientes.get(i).getTelNumber(),
                listClientes.get(i).getDireccion()
            });
        }
        table.setModel(modelTable);
        table.removeColumn(table.getColumnModel().getColumn(0));

    }

    public void limpiar() {
        txtIdentify.setText("");
        txtName.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtPhone.setText("");
        txtDireccion.setText("");
        checkOpcion.setSelected(false);
        checkUpdate.setSelected(false);
    }

    public void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    public void registroProveedores() {
        if (txtName.getText().isEmpty() || txtIdentify.getText().isEmpty()
                || txtCorreo.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Campos requeridos no tienen ningun valor.Por favor, ingrese los datos en los campos requeridos",
                    "Campos requeridos vacios", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String Document = txtIdentify.getText();
                if (saveDataProveedor.proveedorRegistrado(Document)) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Has intentado registrar un proveedor que ya lo esta.Por favor, verifique el nuevo ingreso.",
                            "Intento de registro", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String mensaje = "¿Seguro desea registrar el proveedor?";
                    int question = JOptionPane.showConfirmDialog(rootPane, mensaje, "Registro...",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (question == JOptionPane.YES_OPTION) {
                        dataProveedor.setDocument(Document);
                        dataProveedor.setNameProveedor(txtName.getText());
                        dataProveedor.setLastName(txtApellido.getText());
                        dataProveedor.setCorreo(txtCorreo.getText());
                        dataProveedor.setDireccion(txtDireccion.getText());
                        dataProveedor.setTelefono(txtPhone.getText());
                        saveDataProveedor.registrarProveedor(dataProveedor);
                        String nombreProveedor = dataProveedor.getNameProveedor();
                        JOptionPane.showMessageDialog(rootPane, "Proveedor " + nombreProveedor + " registrado con exito!", "Registro completado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        limpiar();
                    }

                }
            } catch (NumberFormatException e) {
                String mensajeError = "Error: Has ingresado un carácter en un campo que solo acepta valores numéricos.";
                JOptionPane.showMessageDialog(rootPane, mensajeError,
                        "Entrada inválida en algún campo", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Error: " + e);

            }
        }
    }

    public void registrarCliente() {
        if (txtName.getText().isEmpty() || txtIdentify.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Campos requeridos no tienen ningun valor.Por favor, ingrese los datos en los campos requeridos",
                    "Campos requeridos vacios", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                int documento = Integer.parseInt(txtIdentify.getText());
                if (saveDataCliente.clienteRegistrado(documento)) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Has intentado registrar un proveedor que ya lo esta.Por favor, verifique el nuevo ingreso.",
                            "Intento de registro", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String mensaje = "¿Seguro desea registrar el Cliente?";
                    int question = JOptionPane.showConfirmDialog(rootPane, mensaje, "Registro...",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (question == JOptionPane.YES_OPTION) {
                        dataCliente.setDocument(documento);
                        dataCliente.setNameClient(txtName.getText());
                        dataCliente.setSurName(txtApellido.getText());
                        dataCliente.setTelNumber(txtPhone.getText());
                        dataCliente.setCorreo(txtCorreo.getText());
                        dataCliente.setDireccion(txtDireccion.getText());
                        saveDataCliente.registrarCliente(dataCliente);
                        String nombreCliente = dataCliente.getNameClient();
                        JOptionPane.showMessageDialog(rootPane, "Cliente " + nombreCliente + " registrado con exito!", "Registro completado", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        limpiar();
                    }

                }
            } catch (NumberFormatException e) {
                String mensajeError = "Error: Has ingresado un carácter en un campo que solo acepta valores numéricos.";
                JOptionPane.showMessageDialog(rootPane, mensajeError,
                        "Entrada inválida en algún campo", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Error: " + e);
            }
        }
    }

    private void messageReference() {
        txtSearch.setToolTipText("Ingrese el dato de refencia del proveedor/Cliente.");
        checkOpcion.setToolTipText("Si desea buscar un proveedor seleccione. Si un cliente no seleccione");
        buttonSeeProveedor.setToolTipText("proveedores");
        checkUpdate.setToolTipText("Seleccione si desea actualizar proveedor. si un cliente no seleccione");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonSaveProveedor;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonSeeClients;
    private javax.swing.JButton buttonSeeProveedor;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JButton buttonVoidtxts;
    private javax.swing.JCheckBox checkOpcion;
    private javax.swing.JCheckBox checkUpdate;
    private javax.swing.JComboBox<String> comboRecord;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentify;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
