package vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas;

import capaEntidades.Auditoria;
import capaEntidades.cliente;
import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.perfil_Y_usuario;
import capaEntidades.proveedor;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.clientesDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.frmDesarrollo.registroProveedores;

public class vistaClientes extends javax.swing.JFrame {

    HashMap<Boolean, String> getEstado;
    clientesDAO savesCLients = new clientesDAO();
    modeloTransferencia modelo = general.transferencia;

    public vistaClientes() {
        initComponents();
        getEstado = new HashMap<>();
        setTitle("Ventana vista: clientes registrados");
        this.setLocationRelativeTo(null);
        this.setExtendedState(registroProveedores.MAXIMIZED_BOTH);
        List<cliente> list = new ArrayList<>();
        list = savesCLients.clientesRegistrados();
        Table(list);
        verificationCloseWindows();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttoInactivos = new javax.swing.JButton();
        buttonInactivar = new javax.swing.JButton();
        buttonActivar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes registrados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Documento", "Nombre", "Apellidos", "Telefono", "Correo ", "Direccion", "Fecha registro", "Estado"
            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por:");

        comboSearch.setBackground(new java.awt.Color(255, 255, 255));
        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Documento", "Nombre", "Apellidos", "Telefono", "Correo", " " }));

        buttonSearch.setBackground(new java.awt.Color(70, 80, 82));
        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("Buscar...");
        buttonSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttoInactivos.setBackground(new java.awt.Color(70, 80, 82));
        buttoInactivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttoInactivos.setForeground(new java.awt.Color(0, 0, 0));
        buttoInactivos.setText("Inactivos");
        buttoInactivos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttoInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoInactivosActionPerformed(evt);
            }
        });

        buttonInactivar.setBackground(new java.awt.Color(70, 80, 82));
        buttonInactivar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInactivar.setForeground(new java.awt.Color(0, 0, 0));
        buttonInactivar.setText("Inactivar");
        buttonInactivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInactivarActionPerformed(evt);
            }
        });

        buttonActivar.setBackground(new java.awt.Color(70, 80, 82));
        buttonActivar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonActivar.setForeground(new java.awt.Color(0, 0, 0));
        buttonActivar.setText("Activar");
        buttonActivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActivarActionPerformed(evt);
            }
        });

        buttonLimpiar.setBackground(new java.awt.Color(70, 80, 82));
        buttonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        buttonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(70, 80, 82));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttoInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buttonInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttoInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonActivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
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

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        // TODO add your handling code here:
        int file = tableClientes.rowAtPoint(evt.getPoint());
        txtId.setText(tableClientes.getModel().getValueAt(file, 0).toString().trim());
        txtSearch.setText(tableClientes.getModel().getValueAt(file, 1).toString().trim());
    }//GEN-LAST:event_tableClientesMouseClicked

    private void buttonInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInactivarActionPerformed
        // TODO add your handling code here:
        if (!txtId.getText().isEmpty()) {
            int question = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de inactivar el cliente?", "Inactivar cliente...", JOptionPane.YES_NO_OPTION);
            if (question == 0) {
                int idd = Integer.parseInt(txtId.getText());
                boolean isActivo = savesCLients.inactivarClientes(idd); // Corregido a inactivarProveedor
                if (isActivo) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente inactivado correctamente.", "Inactivando...", JOptionPane.INFORMATION_MESSAGE);
                    List<cliente> list = savesCLients.clientesRegistrados();
                    Table(list);
                    String acction ="El usuario inactivo un cliente";
                    recordAcction(modelo, acction);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo inactivar el Cliente.", "Error: Seleciono al Cliente directamente en la tabla", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonInactivarActionPerformed

    private void buttonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActivarActionPerformed
        // TODO add your handling code here:
        if (!txtId.getText().isEmpty()) {
            int question = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de activar el cliente?", "activar cliente...", JOptionPane.YES_NO_OPTION);
            if (question == 0) {
                int idd = Integer.parseInt(txtId.getText());
                boolean isActivo = savesCLients.activarCliente(idd); // Corregido a inactivarProveedor
                if (isActivo) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente activado correctamente.", "activando...", JOptionPane.INFORMATION_MESSAGE);
                    List<cliente> list = savesCLients.clientesInactivos();
                    Table(list);
                    String acction ="El usuario activo un cliente";
                    recordAcction(modelo, acction);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo activar el Cliente.", "Error: Seleciono al Cliente directamente en la tabla", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonActivarActionPerformed

    private void buttoInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoInactivosActionPerformed
        // TODO add your handling code here:
        List<cliente> listInactivos = savesCLients.clientesInactivos();
        if (listInactivos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos los clientes estan activos.", "No hay ningun cliente Inactivo.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Table(listInactivos);
        }
    }//GEN-LAST:event_buttoInactivosActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        // TODO add your handling code here:
        List<cliente> listInactivos = savesCLients.clientesRegistrados();
        Table(listInactivos);
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (txtSearch.getText().isEmpty() || comboSearch.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingresar y seleccionar el dato del cliente que desea buscar.", "Campo busqueda sin valor", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String search = comboSearch.getSelectedItem().toString();
            String value = txtSearch.getText();
            List listSearch = savesCLients.busquedaCliente(search, value);
            if (!listSearch.isEmpty()) {
                Table(listSearch);
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encontró ningún cliente con el tipo dato: " + search + " ingresado.", "Busqueda fallida...", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void verificationCloseWindows() {
        perfil_Y_usuario userData = new perfil_Y_usuario();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    public void Table(List<cliente> listClients) {
        DefaultTableModel modelTable = new DefaultTableModel();
        String[] Columns = {"Id", "Documento", "Nombre", "Apellidos", "Telefono", "Correo", "Direccion", "Fecha registro", "Estado"};
        modelTable.setColumnIdentifiers(Columns);
        // mapear Estado; 1:true, 0: false; 
        getEstado.put(true, "Activo");
        getEstado.put(false, "Inactivo");
        // Limpiar el modelo de la tabla
         while (tableClientes.getRowCount() > 0) {
            ((DefaultTableModel) tableClientes.getModel()).removeRow(0);
        }
        for (int i = 0; i < listClients.size(); i++) {
            // obtenemos el estado 
            boolean estado = listClients.get(i).isActivo();
            // obtenemos el tipo de estado mapeado 
            String typeEstado = getEstado.get(estado);

            modelTable.addRow(new Object[]{
                listClients.get(i).getId(),
                listClients.get(i).getDocument(),
                listClients.get(i).getNameClient(),
                listClients.get(i).getSurName(),
                listClients.get(i).getTelNumber(),
                listClients.get(i).getCorreo(),
                listClients.get(i).getDireccion(),
                listClients.get(i).getFechaRegistro(),
                // pasamos el tipo de estado a la columna estado 
                typeEstado

            });
            tableClientes.setModel(modelTable);

        }
        tableClientes.removeColumn(tableClientes.getColumnModel().getColumn(0));
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
    private javax.swing.JButton buttoInactivos;
    private javax.swing.JButton buttonActivar;
    private javax.swing.JButton buttonInactivar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
