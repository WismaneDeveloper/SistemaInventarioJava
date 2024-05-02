package vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas;

import capaEntidades.DetalleVenta;
import capaEntidades.venta;
import entidadesDAO.DetalleVentaDao;
import entidadesDAO.ventaDAO;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.VentanaCajaRegistradora;

public final class vistaVenta extends javax.swing.JFrame {

    HashMap<Boolean, String> getEstado = new HashMap<>();
    DetalleVentaDao detalleDao = new DetalleVentaDao();
    ventaDAO ventaO = new ventaDAO();
    List<DetalleVenta> listaDetalle = detalleDao.mostrarVentas();

    public vistaVenta() {
        initComponents();
        setTitle("Ventas registradas");
        this.setDefaultCloseOperation(vistaVenta.DISPOSE_ON_CLOSE);
        verificationCloseWindows();
        TableVenta(listaDetalle);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        comboSearch = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        buttonLimpiar = new javax.swing.JButton();
        buttonPdf = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        buttonReporte = new javax.swing.JButton();
        buttonInactivar = new javax.swing.JButton();
        txtNumeroDeVenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jScrollPane1.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Referencia de venta:");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Numero de venta ", "Producto ", "Fecha ", "Cliente" }));
        comboSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        buttonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escoba.png"))); // NOI18N
        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonPdf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPdf.setForeground(new java.awt.Color(0, 0, 0));
        buttonPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        buttonPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPdfActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton4.setText("Canceladas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Puerta.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        jButton6.setText("$-$-$");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buttonReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonReporte.setForeground(new java.awt.Color(0, 0, 0));
        buttonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        buttonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReporteActionPerformed(evt);
            }
        });

        buttonInactivar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonInactivar.setForeground(new java.awt.Color(0, 0, 0));
        buttonInactivar.setText("Eliminar");
        buttonInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInactivarActionPerformed(evt);
            }
        });

        txtNumeroDeVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumeroDeVenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroDeVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(txtNumeroDeVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPdf, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(txtNumeroDeVenta))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int fila = table.rowAtPoint(evt.getPoint());
        txtNumeroDeVenta.setText(table.getModel().getValueAt(fila, 1).toString().trim().toUpperCase());
    }//GEN-LAST:event_tableMouseClicked

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        if (comboSearch.getSelectedIndex() == 0) {
            message("Por favor seleccione por que desea buscar.", "Tipo de busqueda no seleccionado.");
        } else {
            List<DetalleVenta> list = detalleDao.buscarVenta(comboSearch.getSelectedItem().toString(), txtSearch.getText());
            if (!list.isEmpty()) {
                TableVenta(list);
            } else {
                message("No se encontro ninguna venta con el dato " + txtSearch.getText() + " ingresado.", "Sin resultados...");
            }
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumeroDeVenta.setText("");
        txtSearch.setText("");
        comboSearch.setSelectedIndex(0);
        TableVenta(listaDetalle);
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReporteActionPerformed
        // TODO add your handling code here:
        Reporte.ReporteVentas.reporte();
    }//GEN-LAST:event_buttonReporteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new VentanaCajaRegistradora().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void buttonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPdfActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNumeroDeVenta.getText().isEmpty()) {
                message("Por favor seleccione la venta desde la tabla. Para obtener la factura.", "Campo ferencia de venta vacio.");
            } else {
                int id = ventaO.idVenta();
                String numeroVenta = String.format("%05d", id);
                File file = new File("src/reportesPdf/FacturaVenta" + numeroVenta + ".pdf");
                Desktop.getDesktop().open(file);
            }
        } catch (IOException I) {
            System.out.println("Error" + I);
        }
    }//GEN-LAST:event_buttonPdfActionPerformed

    private void buttonInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInactivarActionPerformed
        // TODO add your handling code here:
        if (txtNumeroDeVenta.getText().isEmpty()) {
            message("Por favor seleccione la venta desde la tabla.", "Campo referencia de venta vacio.");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Seguro desea eliminar la venta?", "Este seguro...", JOptionPane.YES_NO_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                boolean inactivado = ventaO.InactivarVenta(Integer.parseInt(txtNumeroDeVenta.getText()));
                if (inactivado) {
                    message("Venta " + txtNumeroDeVenta.getText() + " Eliminada con exito.", "Inactivando venta...");
                    TableVenta(listaDetalle);
                } else {
                    message("Error: Hubo un error de conexion a base de datos, comuniquese con un desarrollador.", "Error...");
                }
            } else {
                txtNumeroDeVenta.setText("");
                txtSearch.setText("");
            }

        }


    }//GEN-LAST:event_buttonInactivarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        List<DetalleVenta> listVenta = detalleDao.MostrarVentasInactivas();
        TableVenta(listVenta);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TableVenta(List<DetalleVenta> list) {
        DefaultTableModel modelTable = new DefaultTableModel();

        String columnas[] = {
            "IdDetalle,", "Venta", "Pago", "Cliente", "apellido",
            "Prodcuto", "Cantidad", "PrecioUnitario", "MontoTotal", "Vendedor", "Estado", "FechaRegistro"};
        modelTable.setColumnIdentifiers(columnas);
        getEstado.put(true, "Concluida");
        getEstado.put(false, "Cancelada");
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            boolean estado = list.get(i).isActivo();
            String tipoEstado = getEstado.get(estado);
            String numeroVenta = String.format("%05d", list.get(i).getIdVenta());
            modelTable.addRow(new Object[]{
                list.get(i).getIdDetalle(),
                numeroVenta,
                list.get(i).getMetodoPago(),
                list.get(i).getCliente(),
                list.get(i).getApellido(),
                list.get(i).getProducto(),
                list.get(i).getCantida(),
                list.get(i).getPrecioUnitario(),
                list.get(i).getMontoTotal(),
                list.get(i).getEmpleado(),
                tipoEstado,
                list.get(i).getFechaRegistro()
            });
        }
        table.setModel(modelTable);
        table.removeColumn(table.getColumnModel().getColumn(0));
        table.removeColumn(table.getColumnModel().getColumn(0));
    }

    public void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(vistaVenta.MAXIMIZED_BOTH);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    public void message(String message, String title) {
        JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(vistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInactivar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonPdf;
    private javax.swing.JButton buttonReporte;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtNumeroDeVenta;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
