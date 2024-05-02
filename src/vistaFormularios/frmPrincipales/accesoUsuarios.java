package vistaFormularios.frmPrincipales;

import capaEntidades.Auditoria;
import capaEntidades.general;
import capaEntidades.modeloTransferencia;
import capaEntidades.perfil_Y_usuario;
import entidadesDAO.auditoriaDAO;
import entidadesDAO.perfilUsuarioDao;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class accesoUsuarios extends javax.swing.JFrame {

    
    perfilUsuarioDao user;
    perfil_Y_usuario userProfile;
    /* Declaramos el perfil */
    private static int AdministratorID = 1;
    private static int userId = 2;
    auditoriaDAO auditoriaSave = new auditoriaDAO();
    Auditoria dataAuditoria = new Auditoria();

    boolean open;
    int intentos = 0;

    public accesoUsuarios() {
        initComponents();
        EnviarImagenLabel(labelUsuario, "src/Imagenes/UserLogin.png");
        user = new perfilUsuarioDao();
        userProfile = new perfil_Y_usuario();
        timeLABEL();
        setTitle("Ingreso de usuarios al sistema");
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonLogin = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkPassword = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        labelTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ButtonLogin.setBackground(new java.awt.Color(0, 51, 255));
        ButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setText("Iniciar Sesion");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el usuario");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese la contraseña");

        checkPassword.setForeground(new java.awt.Color(0, 0, 0));
        checkPassword.setText("Ver contraseña");
        checkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        labelTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("...");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("inicio de sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addComponent(checkPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPassword))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        // hacemos la conversion:
        String name = txtName.getText();
        String password = new String(txtPassword.getPassword());
        // verificamos la entra de los campos:
        if (name.trim().isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Por favor ingrese los datos en los campos requeridos!",
                    "Campos contraseña o nombre de usuario vacios", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // pasamos los datos al objeto 
            userProfile = user.login(name, password);
            // hacemos las validaciones 
            if (userProfile != null) {
                // si usuario es admnistrador acceso a todo el sistema
                if (userProfile.getiDPerfil() == AdministratorID) {
                    TranferirDatos();
                    new MenuPrincipal().setVisible(true);
                    this.dispose();
                    System.out.println("Id: " + userProfile.getiDUser());
                    // sino se inactiva alguna secciones
                } else if (userProfile.getiDPerfil() == userId) {
                    TranferirDatos();
                    new MenuPrincipal().setVisible(true);
                    this.dispose();
                    // validamos si la contraseña o usuarios son incorrectos
                } else {
                    // contamos los intentos de session
                    intentos++;
                    JOptionPane.showMessageDialog(rootPane,
                            "El ingreso es inválido. Has intentado iniciar sesión " + intentos + " veces.",
                            "Error: Usuario o contraseña incorrectos.", JOptionPane.ERROR_MESSAGE);

                    if (intentos >= 3) {
                        JOptionPane.showMessageDialog(rootPane, "Has alcanzado el límite de intentos. Por favor, espera 10 minutos.",
                                "Verifica tu usuario mientras tanto", JOptionPane.INFORMATION_MESSAGE);
                        // Desactiva el botón de inicio de sesión durante 10 minutos
                        ButtonLogin.setEnabled(false);

                        new java.util.Timer().schedule(
                                new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ButtonLogin.setEnabled(true);
                                intentos = 0; // Reinicia el conteo de intentos
                            }
                        },
                                600000
                        );
                    }
                }
            }
            // espero entiendas bayron. Sino me dices.
        }


    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void checkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPasswordActionPerformed
        // TODO add your handling code here:
        if (checkPassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPasswordActionPerformed

    private void EnviarImagenLabel(JLabel jbImagen, String CadenaDeTxt_RutaImagen) {
        ImageIcon image = new ImageIcon(CadenaDeTxt_RutaImagen);
        Icon Icon;
        Icon = new ImageIcon(
                image.getImage().getScaledInstance(jbImagen.getWidth(), jbImagen.getHeight(), Image.SCALE_DEFAULT));
        jbImagen.setIcon(Icon);
        this.repaint();
        System.out.println("Imagen ajustada con exito!");

    }

    private void timeLABEL() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        });
        timer.start();

    }

    private void TranferirDatos() {
        modeloTransferencia modelo = general.transferencia;
        modelo.setNameUsuario(txtName.getText());
        modelo.setIdUser( userProfile.getiDUser());
        modelo.setIdEmpleado(userProfile.getIdEmpleado());
        modelo.setEmpleado(userProfile.getNombre());
        modelo.setApellidos(userProfile.getApellido());
        recordtAcction();
    }

    private void recordtAcction() {

        String accionUser = "El usuario  Ingreso sus credenciales de inicio de sesion correctamenta: Ingreso al sistema.";
        int idUser = userProfile.getiDUser();
        dataAuditoria.setIdUser(idUser);
        dataAuditoria.setAccionUser(accionUser);
        auditoriaSave.RegistrarAccion(dataAuditoria);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JCheckBox checkPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
