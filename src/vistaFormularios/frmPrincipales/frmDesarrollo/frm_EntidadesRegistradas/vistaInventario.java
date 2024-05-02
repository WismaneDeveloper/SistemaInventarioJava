package vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas;

import Reporte.ReporteBajas;
import Reporte.ReporteMarcas;
import Reporte.ReporteProductos;
import capaEntidades.Auditoria;
import capaEntidades.BajasProducto;
import capaEntidades.Producto;
import capaEntidades.categoria;
import capaEntidades.general;
import capaEntidades.marca;
import capaEntidades.modeloTransferencia;
import capaEntidades.planMantenimiento;
import entidadesDAO.BajasProductoDAO;
import entidadesDAO.PlanMantenimientoDAO;
import entidadesDAO.ProductoDAO;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.categoriaDAO;
import entidadesDAO.marcaDAO;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.accesoUsuarios;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.ventanas.ventanaRangoVencimiento;
import vistaFormularios.frmPrincipales.frmDesarrollo.registrarPlanMantenimiento;

public class vistaInventario extends javax.swing.JFrame {

    HashMap<Boolean, String> getEstado;
    ProductoDAO dao = new ProductoDAO();
    modeloTransferencia modelo = general.transferencia;
    BajasProducto baja = new BajasProducto();
    BajasProductoDAO bajaDAO = new BajasProductoDAO();
    List<Producto> list = dao.productosGuardados();

    public vistaInventario() {
        initComponents();
        getEstado = new HashMap<>();
        setTitle("Te encuentras en inventario");
        Table(list);
        verificationCloseWindows();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonActived = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        buttonInactived = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuProducto = new javax.swing.JMenu();
        menuMarca = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuCategorys = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuItemProductos = new javax.swing.JMenuItem();
        menuItemProductosBajas = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuItemMarcas = new javax.swing.JMenuItem();
        menuItemCategorias = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuRango = new javax.swing.JMenu();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        menuInactivos = new javax.swing.JMenu();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        menuItemPlan = new javax.swing.JMenuItem();
        menuItemVerPlanes = new javax.swing.JMenuItem();
        menuInatives = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("buscar por");

        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Codigo", "Nombre", "Marca", "Categoria", "Proveedor" }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("Buscar...");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonActived.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonActived.setForeground(new java.awt.Color(0, 0, 0));
        buttonActived.setText("Activar");
        buttonActived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActivedActionPerformed(evt);
            }
        });

        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonClose.setForeground(new java.awt.Color(0, 0, 0));
        buttonClose.setText("Salir");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        buttonInactived.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInactived.setForeground(new java.awt.Color(0, 0, 0));
        buttonInactived.setText("Inactivar");
        buttonInactived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInactivedActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese  el motivo de baja");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("cantidad de baja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboSearch, javax.swing.GroupLayout.Alignment.LEADING, 0, 192, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(txtCantidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonInactived, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(buttonActived, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonActived, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonInactived, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(txtCantidad))))))
                .addContainerGap())
            .addComponent(jSeparator3)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuProducto.setText("Productos");
        MenuProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuProductoMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuProducto);

        menuMarca.setText("Marcas");
        menuMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMarcaMouseClicked(evt);
            }
        });
        menuMarca.add(jSeparator5);

        jMenuBar1.add(menuMarca);

        menuCategorys.setText("Categorias");
        menuCategorys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCategorysMouseClicked(evt);
            }
        });
        menuCategorys.add(jSeparator4);

        jMenuBar1.add(menuCategorys);

        jMenu7.setText("Reportes");
        jMenu7.add(jSeparator6);

        menuItemProductos.setText("Productos");
        menuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProductosActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemProductos);

        menuItemProductosBajas.setText("Productos de baja");
        menuItemProductosBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemProductosBajasMouseClicked(evt);
            }
        });
        menuItemProductosBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProductosBajasActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemProductosBajas);
        jMenu7.add(jSeparator7);

        menuItemMarcas.setText("Marcas");
        menuItemMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMarcasActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemMarcas);

        menuItemCategorias.setText("Categorias");
        jMenu7.add(menuItemCategorias);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Productos mas vendidos");
        jMenu8.add(jSeparator8);

        jMenuBar1.add(jMenu8);

        menuRango.setText("Consultar rango de vencimiento ");
        menuRango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRangoMouseClicked(evt);
            }
        });
        menuRango.add(jSeparator9);

        jMenuBar1.add(menuRango);

        jMenu10.setText("Ver acciones del usuario");
        jMenu10.add(jSeparator10);

        jMenuBar1.add(jMenu10);

        menuInactivos.setText("Productos de baja");
        menuInactivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInactivosMouseClicked(evt);
            }
        });
        menuInactivos.add(jSeparator11);

        jMenuBar1.add(menuInactivos);

        jMenu4.setText("Plan de mantenimiento");

        menuItemPlan.setText("Registrar");
        menuItemPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPlanActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemPlan);

        menuItemVerPlanes.setText("Ver planes");
        menuItemVerPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerPlanesActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemVerPlanes);

        jMenuBar1.add(jMenu4);

        menuInatives.setText("Productos inactivos");
        menuInatives.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInativesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInatives);

        setJMenuBar(jMenuBar1);

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

    private void menuInactivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInactivosMouseClicked
        // TODO add your handling code here:
        List<BajasProducto> list = bajaDAO.mostrarBajas();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay ningun producto de baja", "Sin resultados...", JOptionPane.INFORMATION_MESSAGE);
        } else {
            tableBajas(list);
        }
    }//GEN-LAST:event_menuInactivosMouseClicked

    private void buttonInactivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInactivedActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().isEmpty() || txtSearch.getText().isEmpty() || txtMotivo.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
            message("Por favor seleccione el producto directamente desde la tabla. Oh verifque si los campos requeridos estan vacios.", "No se pudo inactivar el producto.");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de inactivar el producto?", "Inactivar producto...", JOptionPane.YES_NO_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                boolean inactived = dao.inactivarProducto(Integer.parseInt(txtId.getText()));
                if (inactived) {
                    baja.setIdActivo(Integer.parseInt(txtId.getText()));
                    baja.setMotivo(txtMotivo.getText());
                    baja.setCantidadBaja(Integer.parseInt(txtCantidad.getText()));
                    baja.setResponsable(modelo.getIdUser());
                    bajaDAO.registrarBaja(baja);
                    recordAcction(modelo, "El usuario inactivo un producto.");
                    message("Producto inactivado con exito.", "producto inactivado");
                    txtId.setText("");
                    txtSearch.setText("");
                    txtMotivo.setText("");
                    txtCantidad.setText("");
                    List<Producto> lista = dao.productosGuardados();
                    Table(lista);
                } else {
                    message("No se pudo inactivar el proveedor.Por favor asegurese de seleccionarlo en la tabla."
                            + "", "ERROR...");
                }
            } else {
                txtId.setText("");
                txtSearch.setText("");
            }
        }
    }//GEN-LAST:event_buttonInactivedActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int fila = table.rowAtPoint(evt.getPoint());
        txtId.setText(table.getModel().getValueAt(fila, 0).toString().trim().toUpperCase());
        txtSearch.setText(table.getModel().getValueAt(fila, 1).toString().trim());
    }//GEN-LAST:event_tableMouseClicked

    private void buttonActivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActivedActionPerformed
        // TODO add your handling code here:     
        if (txtId.getText().isEmpty() || txtSearch.getText().isEmpty()) {
            message("Por favor seleccione el producto directamente desde la tabla.", "No se pudo activar el producto.");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de activar el producto?", "activar producto...", JOptionPane.YES_NO_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                boolean actived = dao.activarProducto(Integer.parseInt(txtId.getText()));
                if (actived) {
                    int idProduct = Integer.parseInt(txtId.getText());
                    bajaDAO.eliminarProducto(idProduct);
                    recordAcction(modelo, "El usuario Activo un producto");
                    message("Producto activado con exito.", "producto inactivado");
                    txtId.setText("");
                    txtSearch.setText("");
                    txtMotivo.setText("");
                    txtCantidad.setText("");
                    List<Producto> lista = dao.productosInactivos();
                    Table(lista);
                } else {
                    message("No se pudo inactivar el producto.Por favor asegurese de seleccionarlo en la tabla."
                            + "", "ERROR...");
                }
            } else {
                txtId.setText("");
                txtSearch.setText("");
                txtMotivo.setText("");
                txtCantidad.setText("");
            }
        }
    }//GEN-LAST:event_buttonActivedActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        List<Producto> list = dao.productosGuardados();
        Table(list);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSearchActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearch.getText().isEmpty() || comboSearch.getSelectedIndex() == 0) {
            message("Seleccione o ingrese el tipo de dato por favor", "campo requerido o seleccion vacia.");
        } else {
            List<Producto> list = dao.busquedaProducto(comboSearch.getSelectedItem().toString(), txtSearch.getText());
            if (!list.isEmpty()) {
                Table(list);
            } else {

                message("No se encontro ningun producto " + txtSearch.getText() + " con el tipo de dato ingresado", "Busqueda rin resultado...");
                txtSearch.setText("");
                comboSearch.setSelectedIndex(0);
            }

        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void menuMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMarcaMouseClicked
        // TODO add your handling code here:
        marcaDAO dao = new marcaDAO();
        List<marca> listMarca = dao.obtenerMarcas();
        if (!listMarca.isEmpty()) {
            tableMarca(listMarca);
        } else {
            message("No hay ninguna marca registrada.", " sin resultados...");
        }
    }//GEN-LAST:event_menuMarcaMouseClicked

    private void menuCategorysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCategorysMouseClicked
        // TODO add your handling code here:
        categoriaDAO dao = new categoriaDAO();
        List<categoria> listCategorys = dao.obtenerCategorias();
        if (!listCategorys.isEmpty()) {
            tableCategory(listCategorys);
        } else {
            message("No hay ninguna categoria registrada para mostrar.", "sin resultados...");
        }

    }//GEN-LAST:event_menuCategorysMouseClicked

    private void menuRangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRangoMouseClicked
        // TODO add your handling code here:
        new ventanaRangoVencimiento().setVisible(true);
    }//GEN-LAST:event_menuRangoMouseClicked

    private void menuInativesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInativesMouseClicked
        // TODO add your handling code here:
        List<Producto> list = dao.productosInactivos();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay ningun producto de baja", "Sin resultados...", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Table(list);
        }
    }//GEN-LAST:event_menuInativesMouseClicked

    private void menuItemProductosBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemProductosBajasMouseClicked
        // TODO add your handling code here:
        ReporteBajas.reporte();
    }//GEN-LAST:event_menuItemProductosBajasMouseClicked

    private void menuItemProductosBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProductosBajasActionPerformed
        // TODO add your handling code here:
        ReporteBajas.reporte();
    }//GEN-LAST:event_menuItemProductosBajasActionPerformed

    private void menuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProductosActionPerformed
        // TODO add your handling code here:
        ReporteProductos.reporte();
    }//GEN-LAST:event_menuItemProductosActionPerformed

    private void menuItemMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMarcasActionPerformed
        // TODO add your handling code here:
        ReporteMarcas.reporte();
    }//GEN-LAST:event_menuItemMarcasActionPerformed

    private void menuItemPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPlanActionPerformed
        // TODO add your handling code here:
        new registrarPlanMantenimiento().setVisible(true);
    }//GEN-LAST:event_menuItemPlanActionPerformed

    private void MenuProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProductoMouseClicked
        // TODO add your handling code here:
        Table(list);
    }//GEN-LAST:event_MenuProductoMouseClicked

    private void menuItemVerPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerPlanesActionPerformed
        // TODO add your handling code here:
        PlanMantenimientoDAO dao = new PlanMantenimientoDAO();
        List<planMantenimiento> list = dao.mostrarPlanes();
        if (!list.isEmpty()) {
            tablePlan(list);
        } else {
            JOptionPane.showMessageDialog(rootPane, "No ha se registado ningun plan de mantenimiento.", "Sin resultados...", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_menuItemVerPlanesActionPerformed

    private void Table(List<Producto> list) {

        DefaultTableModel modelTable = new DefaultTableModel();
        String columns[] = {"Id1", "Codigo",
            "Nombre", "Descripcion", "Marca", "Categoria", "Stock",
            "Precio", "Vencimiento", "Registro", "Proveedor", "Estado"};
        modelTable.setColumnIdentifiers(columns);
        // mapear Estado; 1:true, 0: false; 
        getEstado.put(true, "Activo");
        getEstado.put(false, "Inactivo");

        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            boolean value = list.get(i).isActivo();
            // obtenemos el tipo de estado mapeado 
            String typeEstado = getEstado.get(value);
            modelTable.addRow(new Object[]{
                list.get(i).getId(), //0
                list.get(i).getCodigo(),//4 1
                list.get(i).getNombre(),//5 2
                list.get(i).getDescripcion(),//6 3
                list.get(i).getMarca(),//7 4
                list.get(i).getCategoria(),//8 5
                list.get(i).getStock(),//9 6
                list.get(i).getPrecio(), // 10  7
                list.get(i).getFechaVencimiento(),//11 8
                list.get(i).getFechaRegistro(),//12 9
                list.get(i).getProveedor(),//13 10
                // añadimos el estado mapeado: 
                typeEstado

            });

        }
        table.setModel(modelTable);
        // Ajustar el ancho de las columnas después de establecer el modelo
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component c = table.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

                //  We've exceeded the maximum width, no need to check other rows
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }

        table.removeColumn(table.getColumnModel().getColumn(0));

    }

    public void message(String message, String title) {
        JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);
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

    private void tableMarca(List<marca> list) {
        DefaultTableModel modeloTable = new DefaultTableModel();
        String colum[] = {"Enumeracion", "Marca", "Registro", "Estado"};
        modeloTable.setColumnIdentifiers(colum);
        getEstado.put(false, "Inactivo");
        getEstado.put(true, "Activo");
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            boolean keyEstade = list.get(i).isActivo();
            String typeEstade = getEstado.get(keyEstade);
            modeloTable.addRow(new Object[]{
                list.get(i).getId(),
                list.get(i).getDescripcion(),
                list.get(i).getFechaRegistro(),
                typeEstade
            });
            table.setModel(modeloTable);
        }
    }

    private void tableCategory(List<categoria> list) {
        DefaultTableModel modeloTable = new DefaultTableModel();
        String colum[] = {"Enumeracion", "categoria", "Registro", "Estado"};
        modeloTable.setColumnIdentifiers(colum);
        getEstado.put(false, "Inactivo");
        getEstado.put(true, "Activo");
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            boolean keyEstade = list.get(i).isActivo();
            String typeEstade = getEstado.get(keyEstade);
            modeloTable.addRow(new Object[]{
                list.get(i).getId(),
                list.get(i).getDescripcion(),
                list.get(i).getFechaRegistro(),
                typeEstade
            });
            table.setModel(modeloTable);
        }
    }

    private void tableBajas(List<BajasProducto> Listbajas) {
        DefaultTableModel modelTable = new DefaultTableModel();
        String columns[] = {
            "IdActivo", "Motivo", "Cantidad de baja", "baja",
            "Codigo", "Nombre", "Marca", "Categoria", "Precio",
            "Registro", "Vencimiento", "Proveedor", "Usuario responsable"};
        modelTable.setColumnIdentifiers(columns);
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < Listbajas.size(); i++) {
            modelTable.addRow(new Object[]{
                Listbajas.get(i).getIdActivo(), 
                Listbajas.get(i).getMotivo(),
                Listbajas.get(i).getCantidadBaja(),
                Listbajas.get(i).getFechaBaja(), 
                Listbajas.get(i).getCodigo(),
                Listbajas.get(i).getProducto(),
                Listbajas.get(i).getMarca(),
                Listbajas.get(i).getCategoria(),
                Listbajas.get(i).getPrecio(),
                Listbajas.get(i).getFechaRegistro(),
                Listbajas.get(i).getFechaVencimiento(),
                Listbajas.get(i).getProveedor(),
                Listbajas.get(i).getNombreUsuario()
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

                //  We've exceeded the maximum width, no need to check other rows
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
        table.removeColumn(table.getColumnModel().getColumn(0));

    }

    private void tablePlan(List<planMantenimiento> list) {
        DefaultTableModel modelTable = new DefaultTableModel();
        String columns[] = {"Id", "Codigo", "Producto", "Marca", "Categoria", "Estimacion", "Descripcion", "Mantenimiento", "Fecha acabo"};
        modelTable.setColumnIdentifiers(columns);
        while (table.getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        for (int i = 0; i < list.size(); i++) {
            modelTable.addRow(new Object[]{
                list.get(i).getIdProducto(),
                list.get(i).getCodigo(),
                list.get(i).getProducto(),
                list.get(i).getMarca(),
                list.get(i).getCategoria(),
                list.get(i).getCosto(),
                list.get(i).getDescripcion(),
                list.get(i).getTipoMantenimiento(),
                list.get(i).getFechaMantenimiento()
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

                //  We've exceeded the maximum width, no need to check other rows
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }

        table.removeColumn(table.getColumnModel().getColumn(0));
    }

    public void verificationCloseWindows() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(vistaInventario.MAXIMIZED_BOTH);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JButton buttonActived;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonInactived;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu menuCategorys;
    private javax.swing.JMenu menuInactivos;
    private javax.swing.JMenu menuInatives;
    private javax.swing.JMenuItem menuItemCategorias;
    private javax.swing.JMenuItem menuItemMarcas;
    private javax.swing.JMenuItem menuItemPlan;
    private javax.swing.JMenuItem menuItemProductos;
    private javax.swing.JMenuItem menuItemProductosBajas;
    private javax.swing.JMenuItem menuItemVerPlanes;
    private javax.swing.JMenu menuMarca;
    private javax.swing.JMenu menuRango;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
