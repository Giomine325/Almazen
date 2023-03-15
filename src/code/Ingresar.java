package code;

import static java.awt.Color.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import settings.conexionBD;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ingresar extends javax.swing.JFrame {
    
    //Para acciones en la base de datos
    conexionBD conexion=null;
    PreparedStatement cmd;
    ResultSet result;

    public Ingresar() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(this);
        conexion=new conexionBD();
        setImageIn(lblLogo,"src/sources/logo.png");
        setImageIn(nyan,"src/sources/inventory.gif");
        getRootPane().putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    }

    //Logo del JFrame
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon_32px.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nyan = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/exit_32px.png"))); // NOI18N
        btnSalir.setText(" Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 382, 153, -1));

        txtPassword.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        txtPassword.setForeground(java.awt.Color.gray);
        txtPassword.setText("**********");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 450, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        txtUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        txtUsuario.setForeground(java.awt.Color.gray);
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 450, 30));

        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 6, 301, 143));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("¿No tienes usuario? Click aquí.");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));
        jPanel1.add(nyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 6, 380, 420));

        btnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/logIn_32px.png"))); // NOI18N
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 382, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 450, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 450, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        if(txtUsuario.isFocusOwner()){
            txtUsuario.setText("");
            txtUsuario.setForeground(black);
        }else{
            
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // Redirecciona a una pagina de GitHub
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI url= new java.net.URI("https://github.com/Giomine325/Almazen");
                    desktop.browse(url);
                }catch(URISyntaxException | IOException ex){}
            }
        }
    }//GEN-LAST:event_lblLogoMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       Object[] opciones={"Si","No"};
       ImageIcon Icono=new ImageIcon("src/sources/icons/questionCube.png");
       int respuesta=JOptionPane.showOptionDialog(rootPane, "¿Quiere cerrar el programa?","Finalizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Icono,opciones,opciones[0]);
       if(respuesta==0){
        System.exit(0);
       }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        registrarUsuario u=new registrarUsuario();
        u.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       /*
        Object[] opciones={"Si","No"};
       ImageIcon Icono=new ImageIcon("src/sources/icons/questionCube.png");
       int respuesta=JOptionPane.showOptionDialog(rootPane, "¿Quiere cerrar el programa?","Finalizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Icono,opciones,opciones[0]);
       if(respuesta==0){
        System.exit(0);
       }
       */
    }//GEN-LAST:event_formWindowClosing

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //Ingresar al sistema
        if(txtUsuario.getText().isEmpty() | txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Llene todos lo campos para continuar.");
        }else{
            try{
                String consulta="SELECT password FROM usuarios WHERE nickname LIKE ?";
                cmd=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
                cmd.setString(1, txtUsuario.getText());
                result=cmd.executeQuery();
                
                if(result.next()){
                    //Crifrar contraseña
                    
                    
                    
                    //Comparación con la base de datos
                    if(result.getString(1).matches(txtPassword.getText())){
                        Inicio i=new Inicio();
                        i.setVisible(true);
                        this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Verifica la contraseña.");
                        }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "El usuario no existe.");
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Error en consulta.");
            }
        }
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(black);
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("**********");
            txtPassword.setForeground(gray);

        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if(String.valueOf(txtPassword.getPassword()).equals("**********")){
            txtPassword.setText("");
            txtPassword.setForeground(black);
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(gray);

        }
    }//GEN-LAST:event_txtPasswordMousePressed

    public void setImageIn(JLabel a,String route){
        ImageIcon img; Icon icono;
        img=new ImageIcon(route);
        icono=new ImageIcon(img.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
        a.setIcon(icono);
        this.repaint();
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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
                
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel nyan;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
