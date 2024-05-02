/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaFormularios.frmPrincipales;

import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.perfil_Y_usuario;
import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import vistaFormularios.frmPrincipales.frmDesarrollo.RegistroUsuarios;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaClientes;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaInventario;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaProveedores;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaVenta;
import vistaFormularios.frmPrincipales.frmDesarrollo.registrarProducto;
import vistaFormularios.frmPrincipales.frmDesarrollo.registrarVenta;
import vistaFormularios.frmPrincipales.frmDesarrollo.registroProveedores;

/**
 *
 * @author DELL
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    public MenuPrincipal() {
        
        initComponents();
        modeloTransferencia modelo = general.transferencia;
        setTitle("Menu principal");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(MenuPrincipal.DISPOSE_ON_CLOSE);
        this.setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        timeLABEL();
        
        labelNameUser.setText(modelo.getEmpleado());
        
        EnviarImagenLabel(jLabelEscenario, "src/Imagenes/Escenario.jpg");
        verificationCloseWindows();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNameUser = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelEscenario = new javax.swing.JLabel();
        menuInterfaz = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        menuItemProveedor = new javax.swing.JMenuItem();
        menuItemProductos = new javax.swing.JMenuItem();
        menuItemCompras = new javax.swing.JMenuItem();
        menuItemUser = new javax.swing.JMenuItem();
        menuItemVenta = new javax.swing.JMenuItem();
        menuVerRegistros = new javax.swing.JMenu();
        menuItemVistaProveedores = new javax.swing.JMenuItem();
        menuItemSeeClients = new javax.swing.JMenuItem();
        menuItemVentas = new javax.swing.JMenuItem();
        menuInventarios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido, un gusto verte de nuevo:");

        labelNameUser.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNameUser.setForeground(new java.awt.Color(255, 255, 255));
        labelNameUser.setText("...");

        labelTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(181, 181, 181)
                .addComponent(labelNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelNameUser)
                    .addComponent(labelTime))
                .addGap(21, 21, 21))
        );

        jLabelEscenario.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelEscenario.setText(".....");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEscenario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuInterfaz.setBackground(new java.awt.Color(0, 51, 255));
        menuInterfaz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuInterfaz.setForeground(new java.awt.Color(255, 255, 255));

        menuRegistros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRegistros.setForeground(new java.awt.Color(255, 255, 255));
        menuRegistros.setText("Registros");

        menuItemProveedor.setText("Proveedor/Cliente");
        menuItemProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProveedorActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemProveedor);

        menuItemProductos.setText("Productos");
        menuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProductosActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemProductos);

        menuItemCompras.setText("Compras");
        menuRegistros.add(menuItemCompras);

        menuItemUser.setText("Usuarios");
        menuRegistros.add(menuItemUser);

        menuItemVenta.setText("Venta");
        menuItemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVentaActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemVenta);

        menuInterfaz.add(menuRegistros);

        menuVerRegistros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        menuVerRegistros.setText("Vistas");

        menuItemVistaProveedores.setText("Proveedores");
        menuItemVistaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVistaProveedoresActionPerformed(evt);
            }
        });
        menuVerRegistros.add(menuItemVistaProveedores);

        menuItemSeeClients.setText("Clientes");
        menuItemSeeClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSeeClientsActionPerformed(evt);
            }
        });
        menuVerRegistros.add(menuItemSeeClients);

        menuItemVentas.setText("Ventas");
        menuItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVentasActionPerformed(evt);
            }
        });
        menuVerRegistros.add(menuItemVentas);

        menuInterfaz.add(menuVerRegistros);

        menuInventarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuInventarios.setForeground(new java.awt.Color(255, 255, 255));
        menuInventarios.setText("Inventario");
        menuInventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInventariosMouseClicked(evt);
            }
        });
        menuInterfaz.add(menuInventarios);

        setJMenuBar(menuInterfaz);

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

    private void menuItemProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProveedorActionPerformed
        // TODO add your handling code here:
        boolean open = true;
        registroProveedores frmProveedor = new registroProveedores();
        frmProveedor.setVisible(open);
        this.dispose();

    }//GEN-LAST:event_menuItemProveedorActionPerformed

    private void menuItemVistaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVistaProveedoresActionPerformed
        // TODO add your handling code here:
        boolean open = true;
        vistaProveedores ventanVista = new vistaProveedores();
        ventanVista.setVisible(open);
        this.dispose();
    }//GEN-LAST:event_menuItemVistaProveedoresActionPerformed

    private void menuItemSeeClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSeeClientsActionPerformed
        // TODO add your handling code here:
        new vistaClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemSeeClientsActionPerformed

    private void menuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProductosActionPerformed
        // TODO add your handling code here:
        new registrarProducto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemProductosActionPerformed

    private void menuInventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventariosMouseClicked
        // TODO add your handling code here: 
        new vistaInventario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInventariosMouseClicked

    private void menuItemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVentaActionPerformed
        // TODO add your handling code here:
        new registrarVenta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVentaActionPerformed

    private void menuItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVentasActionPerformed
        // TODO add your handling code here:
        new vistaVenta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVentasActionPerformed
    
    private void timeLABEL() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        });
        timer.start();
        
    }
    
    private void EnviarImagenLabel(JLabel jbImagen, String CadenaDeTxt_RutaImagen) {
        ImageIcon image = new ImageIcon(CadenaDeTxt_RutaImagen);
        Icon Icon;
        Icon = new ImageIcon(
                image.getImage().getScaledInstance(jbImagen.getWidth(), jbImagen.getHeight(), Image.SCALE_DEFAULT));
        jbImagen.setIcon(Icon);
        this.repaint();
        System.out.println("Imagen ajustada con exito!");
        
    }
    
    public void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new accesoUsuarios().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEscenario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelNameUser;
    private javax.swing.JLabel labelTime;
    private javax.swing.JMenuBar menuInterfaz;
    private javax.swing.JMenu menuInventarios;
    private javax.swing.JMenuItem menuItemCompras;
    private javax.swing.JMenuItem menuItemProductos;
    private javax.swing.JMenuItem menuItemProveedor;
    private javax.swing.JMenuItem menuItemSeeClients;
    private javax.swing.JMenuItem menuItemUser;
    private javax.swing.JMenuItem menuItemVenta;
    private javax.swing.JMenuItem menuItemVentas;
    private javax.swing.JMenuItem menuItemVistaProveedores;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuVerRegistros;
    // End of variables declaration//GEN-END:variables
}
