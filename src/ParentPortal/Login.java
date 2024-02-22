
package ParentPortal;
import admin.logadmin;
import java.awt.Dimension;

public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
        Dimension size = this.getSize();
            System.out.println(size);
            
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        HIBBOLOGO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GO = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(865, 697));
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        login.setBackground(new java.awt.Color(44, 66, 86));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.setLayout(new java.awt.GridLayout(1, 3));

        jPanel3.setBackground(new java.awt.Color(44, 66, 86));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Ball-04.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 118, 118));
        jLabel2.setForeground(new java.awt.Color(255, 118, 118));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/leftup-04.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        login.add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(44, 66, 86));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(44, 66, 86));
        jTextField3.setText("What's your child's name?");
        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 230, 30));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(44, 66, 86));
        jTextField2.setText("Enter your secret code");
        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 230, 30));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(44, 66, 86));
        jTextField1.setText("Enter your name here !");
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, 30));

        HIBBOLOGO.setFont(new java.awt.Font("Londrina Solid", 0, 89)); // NOI18N
        HIBBOLOGO.setForeground(new java.awt.Color(238, 243, 247));
        HIBBOLOGO.setText("HIBOO");
        jPanel2.add(HIBBOLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(238, 243, 247));
        jLabel5.setFont(new java.awt.Font("Chewy", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 243, 247));
        jLabel5.setText("PArent PortAl");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Rouded TexteField-05.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Rouded TexteField-05.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Rouded TexteField-05.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Inter Semi Bold", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 243, 247));
        jLabel10.setText("Personal Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        GO.setBackground(new java.awt.Color(242, 118, 119));
        GO.setFont(new java.awt.Font("Inter Semi Bold", 0, 18)); // NOI18N
        GO.setForeground(new java.awt.Color(255, 255, 255));
        GO.setText("Login ");
        GO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOActionPerformed(evt);
            }
        });
        jPanel2.add(GO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 90, 40));

        jLabel11.setFont(new java.awt.Font("Inter Semi Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 243, 247));
        jLabel11.setText("Personal Question");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Inter Semi Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 243, 247));
        jLabel12.setText("Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Inter Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("I am an Admin");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, -1));

        login.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(44, 66, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Hibou-04.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 118, 118));
        jLabel3.setForeground(new java.awt.Color(255, 118, 118));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minerva/Ball-04.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        login.add(jPanel1);

        getContentPane().add(login);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOActionPerformed
        Home H = new Home();
        H.setVisible(true);
        H.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GOActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
            
    }//GEN-LAST:event_loginMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        logadmin t = new logadmin();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            Login l = new Login();
            l.setVisible(true);
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GO;
    private javax.swing.JLabel HIBBOLOGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
