package code;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import settings.Key;
import settings.conexionBD;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {
    
    //Para acciones en la base de datos
    conexionBD conexion=null;
    PreparedStatement cmd;
    ResultSet result;
    
    //Para mover la ventana
    int xMouse,yMouse;
    
    //Acciones necesarias
    public String unuser="";
    private Inicio i;
    
    public Login() {
        initComponents();
        txtNick.setText(""); txtNick.setForeground(black);
        txtNick.grabFocus();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        conexion=new conexionBD();
        setImageIn(lblLogo,"/sources/logo.png");
        setImageIn(nyan,"/sources/inventory.gif");
        getRootPane().putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
        Font font = lblRegistro.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblRegistro.setFont(font.deriveFont(attributes));
        
        
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

        bg = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        nyan = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblBarraMov = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/close_322px.png"))); // NOI18N
        btnSalir.setText(" Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        txtPassword.setForeground(java.awt.Color.gray);
        txtPassword.setText("••••••••••");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("Nickname");

        txtNick.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        txtNick.setForeground(java.awt.Color.gray);
        txtNick.setText("Escriba su nickname.");
        txtNick.setBorder(null);
        txtNick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNickMousePressed(evt);
            }
        });
        txtNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickActionPerformed(evt);
            }
        });
        txtNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNickKeyPressed(evt);
            }
        });

        lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });

        lblRegistro.setBackground(new java.awt.Color(102, 102, 102));
        lblRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 51, 153));
        lblRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/hug_32px.png"))); // NOI18N
        lblRegistro.setText("¿No tienes un usuario? Click aquí.");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/logIn_32px.png"))); // NOI18N
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        btnIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblBarraMov.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblBarraMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarraMov.setText("Iniciar sesión");
        lblBarraMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMovMouseDragged(evt);
            }
        });
        lblBarraMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMovMousePressed(evt);
            }
        });

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/icons/see_24px.png"))); // NOI18N
        btnOcultar.setBorder(null);
        btnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(btnIniciar)
                                        .addGap(16, 16, 16)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNick, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(20, 20, 20))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(txtPassword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addComponent(nyan, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(lblBarraMov, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnIniciar, btnSalir});

        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(lblBarraMov, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btnOcultar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(nyan, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOcultar, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setImageIn(JLabel a,String route){
        ImageIcon img; Icon icono;
        img = new ImageIcon(getClass().getResource(route));
        icono=new ImageIcon(img.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
        a.setIcon(icono);
        this.repaint();
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       Object[] opciones={"Si","No"};
       ImageIcon Icono=new ImageIcon(getClass().getResource("/sources/icons/questionCube.png"));
       int respuesta=JOptionPane.showOptionDialog(rootPane, "¿Quiere cerrar el programa?","Finalizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Icono,opciones,opciones[0]);
       if(respuesta==0){
        System.exit(0);
       }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if(String.valueOf(txtPassword.getPassword()).equals("••••••••••")){
            txtPassword.setText("");
            txtPassword.setForeground(black);
        }
        if(txtNick.getText().isEmpty()){
            txtNick.setText("Escriba su nickname.");
            txtNick.setForeground(gray);

        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == 10){
            btnIniciar.grabFocus();
            btnIniciar.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtNickMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickMousePressed
        if(txtNick.getText().equals("Escriba su nickname.")){
            txtNick.setText("");
            txtNick.setForeground(black);
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()){
            txtPassword.setText("••••••••••");
            txtPassword.setForeground(gray);

        }
    }//GEN-LAST:event_txtNickMousePressed

    private void txtNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNickActionPerformed

    private void txtNickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyPressed
        if(evt.getKeyCode() == 10){
            txtPassword.grabFocus();
            if(String.valueOf(txtPassword.getPassword()).equals("••••••••••")){
                txtPassword.setText("");
                txtPassword.setForeground(black);
            }
            if(txtNick.getText().isEmpty()){
                txtNick.setText("Escriba su nickname.");
                txtNick.setForeground(gray);
            }
        }
    }//GEN-LAST:event_txtNickKeyPressed

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

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        this.dispose();
        registrarUsuario u=new registrarUsuario();
        u.setVisible(true);
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistroMouseEntered

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //Ingresar al sistema
        unuser=(txtNick.getText());
        i=new Inicio(unuser);
        i.user=unuser;
        if("Escriba su nickname.".equals(txtNick.getText()) | "••••••••••".equals(txtPassword.getText())){
            JOptionPane.showMessageDialog(rootPane, "Llene todos lo campos para continuar.");
            
        }else{
            try{
                String consulta="SELECT password,nombre,status,modBuscar,modInOut,modConsulta,modPerCod,modAlterUsuarios FROM usuarios NATURAL JOIN privilegios WHERE nickname LIKE ? ";
                cmd=(PreparedStatement)conexion.conectar.prepareStatement(consulta);
                cmd.setString(1, txtNick.getText());
                result=cmd.executeQuery();
                //Comparación con la base de datos
                if(result.next()){
                    if(result.getString(3).equals("S")){
                        //Crifrado
                        Key k=new Key();
                        //Si la contraseña coincide
                        if(result.getString(1).matches(k.getPassword(txtPassword.getText()))){
                            
                            if(result.getString(4).matches("S"))
                            i.m1=true;
                            if(result.getString(5).matches("S"))
                            i.m2=true;
                            if(result.getString(6).matches("S"))
                            i.m3=true;
                            if(result.getString(7).matches("S"))
                            i.m4=true;
                            if(result.getString(8).matches("S"))
                            i.m5=true;
                            i.habilitarModulos();
                            
                            this.dispose();
                            i.setVisible(true);
                            cmd.close();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "El usuario o la contraseña son incorrectos.");
                            txtNick.setText("");
                            txtPassword.setText("••••••••••"); txtPassword.setForeground(gray);
                            char echoChar = txtPassword.getEchoChar();
                            if (echoChar != 0) {}else{
                                txtPassword.setEchoChar('•');
                                ImageIcon mostrar=new ImageIcon(getClass().getResource("/sources/icons/see_24px.png"));
                                btnOcultar.setIcon(mostrar);
                            }
                            txtNick.grabFocus();
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El usuario no está activo en el sistema.");
                        txtNick.setText("");
                        txtPassword.setText("••••••••••"); txtPassword.setForeground(gray);
                        char echoChar = txtPassword.getEchoChar();
                        if (echoChar != 0) {}else{
                            txtPassword.setEchoChar('•');
                            ImageIcon mostrar=new ImageIcon(getClass().getResource("/sources/icons/see_24px.png"));
                            btnOcultar.setIcon(mostrar);
                        }
                        txtNick.grabFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "El usuario o la contraseña son incorrectos.");
                    txtNick.setText("");
                    txtPassword.setText("••••••••••"); txtPassword.setForeground(gray);
                    char echoChar = txtPassword.getEchoChar();
                    if (echoChar != 0) {}else{
                        txtPassword.setEchoChar('•');
                        ImageIcon mostrar=new ImageIcon(getClass().getResource("/sources/icons/see_24px.png"));
                        btnOcultar.setIcon(mostrar);
                    }
                    txtNick.grabFocus();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Error: 001");
            }
        }
        
    }//GEN-LAST:event_btnIniciarActionPerformed
        
    private void btnIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarKeyPressed

    private void lblBarraMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMovMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblBarraMovMouseDragged

    private void lblBarraMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMovMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_lblBarraMovMousePressed

    private void btnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarActionPerformed
        // TODO add your handling code here:
        char echoChar = txtPassword.getEchoChar();
        if (echoChar != 0) {
            txtPassword.setEchoChar((char) 0);
            ImageIcon ocultar=new ImageIcon(getClass().getResource("/sources/icons/noSee_24px.png"));
            btnOcultar.setIcon(ocultar);
            
        } else {
            txtPassword.setEchoChar('•');
            ImageIcon mostrar=new ImageIcon(getClass().getResource("/sources/icons/see_24px.png"));
            btnOcultar.setIcon(mostrar);
        }
    }//GEN-LAST:event_btnOcultarActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
        Nombres>
        
        Light: 
        FlatArcIJTheme
        FlatIntelliJLaf
        
        Dark: 
        FlatDarkPurpleIJTheme
        
        */
        
        /* Look and Feel */
        FlatArcIJTheme.setup();
        // create UI here...
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnOcultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBarraMov;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel nyan;
    private javax.swing.JTextField txtNick;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
