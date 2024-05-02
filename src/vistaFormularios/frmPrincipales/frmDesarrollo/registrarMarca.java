package vistaFormularios.frmPrincipales.frmDesarrollo;

import capaEntidades.Auditoria;
import capaEntidades.categoria;
import capaEntidades.general;
import capaEntidades.marca;
import capaEntidades.modeloTransferencia;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.categoriaDAO;
import entidadesDAO.marcaDAO;
import javax.swing.JOptionPane;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.ventanaProveedor;

public class registrarMarca extends javax.swing.JFrame {

    marca data = new marca();
    marcaDAO saveData = new marcaDAO();
    categoria dataC = new categoria();
    categoriaDAO saveDataC = new categoriaDAO();
    modeloTransferencia modelo = general.transferencia;
    registrarProducto ventana;

    public registrarMarca(registrarProducto ventana) {
        initComponents();
        this.ventana = ventana;
        
        setTitle("Registro de marcas");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(registrarMarca.DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        buttonClosed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("registrar marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese la marca");

        txtDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSave.setBackground(new java.awt.Color(255, 255, 204));
        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setText("Guardar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonClosed.setBackground(new java.awt.Color(255, 255, 204));
        buttonClosed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClosed.setForeground(new java.awt.Color(0, 0, 0));
        buttonClosed.setText("Salir");
        buttonClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClosedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(buttonClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonClosed, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
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

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        if (txtDescription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el dato requerido en la caja de texto.",
                    "Campo vacio", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String description = txtDescription.getText();
            data.setDescripcion(description);
            saveData.registrarMarca(data);
            String acctionUser = "El usuario ha registrado una nueva marca";
            recordDescription(modelo, acctionUser);
            JOptionPane.showMessageDialog(rootPane, "La marca se registro exitosamente!", "Marca registrada", JOptionPane.INFORMATION_MESSAGE);
            updateCombo();
        }

    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClosedActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_buttonClosedActionPerformed

    private void recordDescription(modeloTransferencia modelo, String acctionRealized) {
        modelo = general.transferencia;
        String acction = acctionRealized;
        Auditoria dataAcction = new Auditoria();
        auditoriaDAO saveAcction = new auditoriaDAO();
        dataAcction.setAccionUser(acction);
        dataAcction.setIdUser(modelo.getIdUser());
        saveAcction.RegistrarAccion(dataAcction);

    }
    private void updateCombo(){
        ventana.listDescriptions();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClosed;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
