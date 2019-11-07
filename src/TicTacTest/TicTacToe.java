
package TicTacTest;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pasindu
 */
public class TicTacToe extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;  


    public TicTacToe() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    
    private void gameScore(){
        jblplayerx.setText(String.valueOf(xCount));
        jblplayero.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }
    }
    
    private void winningGame(){
        
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        //horizontal X
        
        if(b1=="X" && b2=="X" && b3=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton2.setBackground(Color.cyan);
            jButton3.setBackground(Color.cyan);
            
        }
        
        if(b4=="X" && b5=="X" && b6=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            
        }
        
        if(b7=="X" && b8=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton7.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        //horizontal O
        
        if(b1=="O" && b2=="O" && b3=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton2.setBackground(Color.cyan);
            jButton3.setBackground(Color.cyan);
            
        }
        
        if(b4=="O" && b5=="O" && b6=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            
        }
        
        if(b7=="O" && b8=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton7.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        //vertical X
        
        if(b1=="X" && b4=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton4.setBackground(Color.cyan);
            jButton7.setBackground(Color.cyan);
            
        }
        
        if(b2=="X" && b5=="X" && b8=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            
        }
        
        if(b3=="X" && b6=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        //vertical O
        
        if(b1=="O" && b4=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton4.setBackground(Color.cyan);
            jButton7.setBackground(Color.cyan);
            
        }
        
        if(b2=="O" && b5=="O" && b8=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            
        }
        
        if(b3=="O" && b6=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        //diagonal x
                
        if(b1=="X" && b5=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        if(b3=="X" && b5=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this, "Player X win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton7.setBackground(Color.cyan);
            
        }
        
        
        //diagonal O
        
        if(b1=="O" && b5=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
        }
        
        if(b3=="O" && b5=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this, "Player O win" , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton7.setBackground(Color.cyan);
            
        }
                
    }


    @SuppressWarnings("unchecked")
    
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jblplayerx = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jblplayero = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btnreset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jblplayerx.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblplayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayerx.setText("0");
        jblplayerx.setAlignmentX(0.5F);
        jblplayerx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jblplayerx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jblplayero.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jblplayero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayero.setText("0");
        jblplayero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jblplayero, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel16.setLayout(new java.awt.BorderLayout());

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel16.add(btnreset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel17.setLayout(new java.awt.BorderLayout());

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel17.add(btnexit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.blue);
        }else{
            jButton1.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jButton3.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.blue);
        }else{
            jButton3.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
                
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm If You Want to Exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.blue);
        }else{
            jButton2.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jButton4.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.blue);
        }else{
            jButton4.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        jButton5.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.blue);
        }else{
            jButton5.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jButton6.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.blue);
        }else{
            jButton6.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jButton7.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.blue);
        }else{
            jButton7.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        jButton8.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.blue);
        }else{
            jButton8.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        jButton9.setText(startGame);
                
        if(startGame.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.blue);
        }else{
            jButton9.setForeground(Color.red);
        }
        
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblplayero;
    private javax.swing.JLabel jblplayerx;
    // End of variables declaration//GEN-END:variables
}
