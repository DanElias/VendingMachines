/*
Name: Team 3
Date: 27 -04 -18
This class is the meenu interface
*/

package gui;

import logic.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {// Creates new form Menu
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        tech_button = new javax.swing.JButton();
        food_button = new javax.swing.JButton();
        refill_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Blade Runner Movie Font", 1, 20)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("TECH");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 70, 30));

        title.setFont(new java.awt.Font("Blade Runner Movie Font", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Food");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 70, 30));

        tech_button.setBackground(new java.awt.Color(255, 255, 255));
        tech_button.setFont(new java.awt.Font("TESLA", 1, 28)); // NOI18N
        tech_button.setForeground(new java.awt.Color(255, 255, 255));
        tech_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/button_tech.png"))); // NOI18N
        tech_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tech_button.setIconTextGap(0);
        tech_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tech_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(tech_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 340, 220));

        food_button.setBackground(new java.awt.Color(255, 255, 255));
        food_button.setFont(new java.awt.Font("TESLA", 1, 28)); // NOI18N
        food_button.setForeground(new java.awt.Color(255, 255, 255));
        food_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/button_food.png"))); // NOI18N
        food_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        food_button.setIconTextGap(0);
        food_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                food_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(food_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 340, 220));

        refill_button.setBackground(new java.awt.Color(86, 60, 182));
        refill_button.setFont(new java.awt.Font("Blade Runner Movie Font", 1, 24)); // NOI18N
        refill_button.setForeground(new java.awt.Color(255, 255, 255));
        refill_button.setText("Add Product-Money");
        refill_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refill_button.setIconTextGap(0);
        refill_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refill_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(refill_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 350, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/background_menu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void food_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_food_buttonMouseClicked
        String filename=""; 
        filename="machine2.txt"; 
        Food food = new Food(filename);  // constructor that loads the last state the machine was in
        food.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_food_buttonMouseClicked
// 
    private void tech_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tech_buttonMouseClicked
        String filename="";
        filename="machine3.txt";
        Tech tech = new Tech(filename);  // constructor that loads the last state the machine was in
        tech.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tech_buttonMouseClicked

    private void refill_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refill_buttonMouseClicked
        String filename1=""; 
        filename1="machine2.txt";
        String filename2=""; 
        filename2="machine3.txt";
        Add add = new Add(filename1, filename2);  // constructor that loads the last state the machines were in
        add.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_refill_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton food_button;
    private javax.swing.JButton refill_button;
    private javax.swing.JButton tech_button;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}