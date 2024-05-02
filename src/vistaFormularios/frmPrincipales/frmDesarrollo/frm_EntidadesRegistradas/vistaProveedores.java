/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas;

import capaEntidades.Auditoria;
import entidadesDAO.auditoriaDAO;
import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.perfil_Y_usuario;
import capaEntidades.proveedor;
import entidadesDAO.proveedorDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import vistaFormularios.frmPrincipales.MenuPrincipal;

/**
 *
 * @author DELL
 */
public final class vistaProveedores extends javax.swing.JFrame {

    HashMap<Boolean, String> getEstado;
    proveedorDAO proveedoresSaves = new proveedorDAO();
    modeloTransferencia modelo = general.transferencia;

    public vistaProveedores() {
        getEstado = new HashMap<>();
        initComponents();
        txtID.setVisible(false);
        // segundos para mostrar el mensaje de referencia
        ToolTipManager.sharedInstance().setInitialDelay(1);
        messageReference();
        List<proveedor> listProveedores = proveedoresSaves.proveedoresRegistrados();
        Table(listProveedores);
        this.setExtendedState(vistaProveedores.MAXIMIZED_BOTH);
        verificationCloseWindows();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        buttonInactivos = new javax.swing.JButton();
        buttonInactivarP = new javax.swing.JButton();
        buttonActivedP = new javax.swing.JButton();
        buttonLimpiarTable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedores registrados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(236, 236, 236)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Documento", "Nombre", "Apellido", "Telefono", "Correo", "Direccion", "Fecha registro", "Estado"
            }
        ));
        tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedores);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        buttonInactivos.setBackground(new java.awt.Color(70, 80, 82));
        buttonInactivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInactivos.setForeground(new java.awt.Color(0, 0, 0));
        buttonInactivos.setText("Inactivos");
        buttonInactivos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInactivosActionPerformed(evt);
            }
        });

        buttonInactivarP.setBackground(new java.awt.Color(70, 80, 82));
        buttonInactivarP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInactivarP.setForeground(new java.awt.Color(0, 0, 0));
        buttonInactivarP.setText("Inactivar");
        buttonInactivarP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonInactivarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInactivarPActionPerformed(evt);
            }
        });

        buttonActivedP.setBackground(new java.awt.Color(70, 80, 82));
        buttonActivedP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonActivedP.setForeground(new java.awt.Color(0, 0, 0));
        buttonActivedP.setText("Activar");
        buttonActivedP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonActivedP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActivedPActionPerformed(evt);
            }
        });

        buttonLimpiarTable.setBackground(new java.awt.Color(70, 80, 82));
        buttonLimpiarTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLimpiarTable.setForeground(new java.awt.Color(0, 0, 0));
        buttonLimpiarTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonLimpiarTable.setText("Limpiar ");
        buttonLimpiarTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonLimpiarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarTableActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar por:");

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~ ", "Documento", "Nombre", "Apellidos", "Correo", "Telefono" }));

        buttonSearch.setBackground(new java.awt.Color(70, 80, 82));
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

        jButton1.setBackground(new java.awt.Color(70, 80, 82));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_1.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(buttonInactivarP, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buttonActivedP, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpiarTable, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSearch)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInactivarP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActivedP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpiarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (txtSearch.getText().isEmpty() || comboSearch.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingresar y seleccionar el dato del proveedor que desea buscar.", "Campo busqueda sin valor", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String search = comboSearch.getSelectedItem().toString();
            String value = txtSearch.getText();
            List listSearch = proveedoresSaves.busquedaProveedor(search, value);
            if (!listSearch.isEmpty()) {
                Table(listSearch);
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró ningún cliente con el tipo dato: " + search + " ingresado.", "Busqueda fallida...", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {
            System.out.println("Erro de busqueda boton:" + e);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonLimpiarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarTableActionPerformed
        // TODO add your handling code here:
        List<proveedor> list = proveedoresSaves.proveedoresRegistrados();

        Table(list);
    }//GEN-LAST:event_buttonLimpiarTableActionPerformed

    private void buttonInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInactivosActionPerformed
        // TODO add your handling code here:
        List<proveedor> listInactivos = proveedoresSaves.proveedoresInactivos();
        if (listInactivos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos los proveedores estan activos.", "No hay ningun proveedor Inactivo.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Table(listInactivos);
        }

    }//GEN-LAST:event_buttonInactivosActionPerformed

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedoresMouseClicked
        // TODO add your handling code here:
        int file = tableProveedores.rowAtPoint(evt.getPoint());
        txtID.setText(tableProveedores.getModel().getValueAt(file, 0).toString().trim());
        txtSearch.setText(tableProveedores.getModel().getValueAt(file, 1).toString().trim());
    }//GEN-LAST:event_tableProveedoresMouseClicked

    private void buttonInactivarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInactivarPActionPerformed
        // TODO add your handling code here:

        if (!txtID.getText().isEmpty()) {
            int question = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de inactivar el proveedor?", "Inactivar proveedor...", JOptionPane.YES_NO_OPTION);
            if (question == 0) {
                int idd = Integer.parseInt(txtID.getText());
                boolean isActivo = proveedoresSaves.inactivarProveedor(idd); // Corregido a inactivarProveedor
                if (isActivo) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor inactivado correctamente.", "Inactivando...", JOptionPane.INFORMATION_MESSAGE);
                    List<proveedor> list = proveedoresSaves.proveedoresRegistrados();
                    Table(list);
                    String acction = "el usuario Inactivo un proveedor";
                    recordAcction(modelo, acction);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo inactivar el proveedor.", "Error: Seleciono al proveedor directamente en la tabla", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_buttonInactivarPActionPerformed

    private void buttonActivedPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActivedPActionPerformed
        // TODO add your handling code here:
        if (!txtID.getText().isEmpty()) {
            int question = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de activar el proveedor?", "activar proveedor...", JOptionPane.YES_NO_OPTION);
            if (question == 0) {
                int id = Integer.parseInt(txtID.getText());
                boolean isActivo = proveedoresSaves.activarProveedor(id); // Corregido a inactivarProveedor
                if (isActivo) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor activado correctamente.", "Activando...", JOptionPane.INFORMATION_MESSAGE);
                    List<proveedor> list = proveedoresSaves.proveedoresInactivos();
                    Table(list);
                    String acction = "el usuario activo aun proveedor";
                    recordAcction(modelo, acction);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo activar el proveedor.", "Error: Seleciono al proveedor directamente en la tabla", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonActivedPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void messageReference() {
        txtSearch.setToolTipText("Ingrese el dato de refencia del proveedor.");
    }

    private void Table(List<proveedor> listProveedores) {

        DefaultTableModel modelTable = new DefaultTableModel();
        String[] Columns = {"Id", "Documento", "Nombre", "Apellidos", "Telefono", "Correo", "Direccion", "Fecha registro", "Estado"};
        modelTable.setColumnIdentifiers(Columns);
        // mapear Estado; 1:true, 0: false; 
        getEstado.put(true, "Activo");
        getEstado.put(false, "Inactivo");

        // Limpiar la tabla
        while (tableProveedores.getRowCount() > 0) {
            ((DefaultTableModel) tableProveedores.getModel()).removeRow(0);
        }

        for (int i = 0; i < listProveedores.size(); i++) {
            // obtenemos el estado 
            boolean estado = listProveedores.get(i).isActivo();
            // obtenemos el tipo de estado mapeado 
            String typeEstado = getEstado.get(estado);
            modelTable.addRow(new Object[]{
                listProveedores.get(i).getId(),
                listProveedores.get(i).getDocument(),
                listProveedores.get(i).getNameProveedor(),
                listProveedores.get(i).getLastName(),
                listProveedores.get(i).getTelefono(),
                listProveedores.get(i).getCorreo(),
                listProveedores.get(i).getDireccion(),
                listProveedores.get(i).getFechaRegistro(),
                // pasamos el tipo de estado a la columna estado 
                typeEstado

            });
            tableProveedores.setModel(modelTable);

        }
        tableProveedores.removeColumn(tableProveedores.getColumnModel().getColumn(0));
    }

    public void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    private void recordAcction(modeloTransferencia modelo, String acctionRealized) {
        modelo = general.transferencia;
        String acction = acctionRealized;
        Auditoria recordAcction = new Auditoria();
        auditoriaDAO saveAcction = new auditoriaDAO();
        recordAcction.setIdUser(modelo.getIdUser());
        recordAcction.setAccionUser(acction);
        saveAcction.RegistrarAccion(recordAcction);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActivedP;
    private javax.swing.JButton buttonInactivarP;
    private javax.swing.JButton buttonInactivos;
    private javax.swing.JButton buttonLimpiarTable;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
