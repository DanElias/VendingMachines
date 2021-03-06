/*
Name: Team 3
Date: 01 - 05 -18
This class is the interface of the tech machine.
*/

package gui;

import java.util.ArrayList;
import logic.*;

public class Tech extends javax.swing.JFrame {
    
    private User user;
    private ArrayList<Product> products= new ArrayList<Product>();
    private ArrayList<Integer> coins= new ArrayList<Integer>();
    private ArrayList<Integer> coins_introduced= new ArrayList<Integer>();
    private Machine2 machine2;
    private ObjectWriter machine_writer2=new ObjectWriter();
    private int total_introduced;
    private int number;
    private int original_money=0;
    

    public Tech() {// Creates new form Food
        initComponents();
        setLocationRelativeTo(null);
        initialSettings();
        this.products=products;
        this.coins=coins;
        user=new User("Customer", 20);
        this.machine2=new Machine2(user, coins, products);
        this.total_introduced=0;
        this.original_money=user.getMoney();
        this.coins_introduced.add(0);// 1st position= $5 coins introduced
        this.coins_introduced.add(0);// 2nd position= $10 coins introduced
        this.coins_introduced.add(0);// 3rd position= $20 coins introduced
        
    }
    
    public Tech(String filename) {// Creates new form Food
        initComponents();
        setLocationRelativeTo(null);
        initialSettings();
        ObjectReader reader2=new ObjectReader();
        this.machine2=reader2.read2(filename);
        
        this.products=machine2.getProducts();
        this.coins=machine2.getCoins();
        //this.user= new User("Customer", 20); // Sale null, como si no se guardara el user a la hora de serializar.
       this.user=machine2.getUser();
        //this.original_money=120;
        System.out.println(original_money);
        original_money=user.getMoney();
        this.coins_introduced.add(0);// 1st position= $5 coins introduced
        this.coins_introduced.add(0);// 2nd position= $10 coins introduced
        this.coins_introduced.add(0);// 3rd position= $20 coins introduced
        this.total_introduced=0;
        System.out.println(machine2.getCoins());
        System.out.println(machine2.getProducts());
        System.out.println(machine2.getUser());
    }
    
    public void initialSettings(){ //Sets intital button setting (visibility)
        p1.setOpaque(false);
        p1.setContentAreaFilled(false);
        p1.setBorderPainted(false);
        
        p2.setOpaque(false);
        p2.setContentAreaFilled(false);
        p2.setBorderPainted(false);
        
        p3.setOpaque(false);
        p3.setContentAreaFilled(false);
        p3.setBorderPainted(false);
        
        p4.setOpaque(false);
        p4.setContentAreaFilled(false);
        p4.setBorderPainted(false);
        
        p5.setOpaque(false);
        p5.setContentAreaFilled(false);
        p5.setBorderPainted(false);
        
        p6.setOpaque(false);
        p6.setContentAreaFilled(false);
        p6.setBorderPainted(false);
        
        p7.setOpaque(false);
        p7.setContentAreaFilled(false);
        p7.setBorderPainted(false);
        
        p8.setOpaque(false);
        p8.setContentAreaFilled(false);
        p8.setBorderPainted(false);
        
        p9.setOpaque(false);
        p9.setContentAreaFilled(false);
        p9.setBorderPainted(false);
        
        available_label.setVisible(false);
        cost_label.setVisible(false);
        introduce_money_label.setVisible(false);
        myfunds_label.setVisible(false);
        coin5_image.setVisible(false);
        coin10_image.setVisible(false);
        coin20_image.setVisible(false);
        totalIntroduced_label.setVisible(false);
        change_label.setVisible(false);
        line1.setVisible(false);
        line.setVisible(false);
        sold_label.setVisible(false);
        plus5.setVisible(false);
        minus5.setVisible(false);
        plus10.setVisible(false);
        minus10.setVisible(false);
        plus20.setVisible(false);
        minus20.setVisible(false);
        buy_button.setVisible(false);
        work_button.setVisible(false);
        coins5change.setVisible(false);
        coins10change.setVisible(false);
        coins20change.setVisible(false);
        food_button.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        food_button = new javax.swing.JButton();
        coins20change = new javax.swing.JLabel();
        coins10change = new javax.swing.JLabel();
        coins5change = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        product_label = new javax.swing.JLabel();
        description_label = new javax.swing.JLabel();
        available_label = new javax.swing.JLabel();
        cost_label = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        introduce_money_label = new javax.swing.JLabel();
        myfunds_label = new javax.swing.JLabel();
        coin5_image = new javax.swing.JLabel();
        coin10_image = new javax.swing.JLabel();
        coin20_image = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        totalIntroduced_label = new javax.swing.JLabel();
        change_label = new javax.swing.JLabel();
        sold_label = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        buy_button = new javax.swing.JButton();
        work_button = new javax.swing.JButton();
        plus5 = new javax.swing.JButton();
        minus5 = new javax.swing.JButton();
        plus10 = new javax.swing.JButton();
        minus10 = new javax.swing.JButton();
        plus20 = new javax.swing.JButton();
        minus20 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        food_button.setBackground(new java.awt.Color(51, 77, 157));
        food_button.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        food_button.setForeground(new java.awt.Color(255, 255, 255));
        food_button.setText("Buy another thing");
        food_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                food_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(food_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 200, 30));

        coins20change.setFont(new java.awt.Font("Blue Highway", 1, 16)); // NOI18N
        coins20change.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(coins20change, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 90, 30));

        coins10change.setFont(new java.awt.Font("Blue Highway", 1, 16)); // NOI18N
        coins10change.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(coins10change, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 90, 30));

        coins5change.setFont(new java.awt.Font("Blue Highway", 1, 16)); // NOI18N
        coins5change.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(coins5change, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 100, 30));

        title.setFont(new java.awt.Font("Blade Runner Movie Font", 1, 32)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/title2.gif"))); // NOI18N
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 840, 30));

        product_label.setFont(new java.awt.Font("Blue Highway", 1, 24)); // NOI18N
        product_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(product_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 280, 30));

        description_label.setFont(new java.awt.Font("Blue Highway", 1, 14)); // NOI18N
        description_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(description_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 270, 30));

        available_label.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        available_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(available_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 130, 30));

        cost_label.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        cost_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cost_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 130, 30));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/line.png"))); // NOI18N
        getContentPane().add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        introduce_money_label.setFont(new java.awt.Font("Blue Highway", 1, 18)); // NOI18N
        introduce_money_label.setForeground(new java.awt.Color(255, 255, 255));
        introduce_money_label.setText("Introduce money");
        getContentPane().add(introduce_money_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 170, 30));

        myfunds_label.setFont(new java.awt.Font("Blue Highway", 1, 16)); // NOI18N
        myfunds_label.setForeground(new java.awt.Color(255, 255, 255));
        myfunds_label.setText("Your funds:");
        getContentPane().add(myfunds_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 170, -1));

        coin5_image.setFont(new java.awt.Font("Blue Highway", 1, 22)); // NOI18N
        coin5_image.setForeground(new java.awt.Color(255, 255, 255));
        coin5_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/coin5.png"))); // NOI18N
        getContentPane().add(coin5_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, 60));

        coin10_image.setFont(new java.awt.Font("Blue Highway", 1, 22)); // NOI18N
        coin10_image.setForeground(new java.awt.Color(255, 255, 255));
        coin10_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/coin10.png"))); // NOI18N
        getContentPane().add(coin10_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, 60));

        coin20_image.setFont(new java.awt.Font("Blue Highway", 1, 22)); // NOI18N
        coin20_image.setForeground(new java.awt.Color(255, 255, 255));
        coin20_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/coin20.png"))); // NOI18N
        getContentPane().add(coin20_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, 60));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/line.png"))); // NOI18N
        getContentPane().add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        totalIntroduced_label.setFont(new java.awt.Font("Blue Highway", 1, 18)); // NOI18N
        totalIntroduced_label.setForeground(new java.awt.Color(255, 255, 255));
        totalIntroduced_label.setText("Total money introduced: 0");
        getContentPane().add(totalIntroduced_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 330, 30));

        change_label.setFont(new java.awt.Font("Blue Highway", 1, 18)); // NOI18N
        change_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(change_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 170, 30));

        sold_label.setFont(new java.awt.Font("Blue Highway", 1, 17)); // NOI18N
        sold_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sold_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 350, 20));

        menu_button.setBackground(new java.awt.Color(51, 77, 157));
        menu_button.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        menu_button.setForeground(new java.awt.Color(255, 255, 255));
        menu_button.setText("MENU");
        menu_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(menu_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        buy_button.setBackground(new java.awt.Color(51, 77, 157));
        buy_button.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        buy_button.setForeground(new java.awt.Color(255, 255, 255));
        buy_button.setText("Buy");
        buy_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(buy_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 70, 30));

        work_button.setBackground(new java.awt.Color(51, 77, 157));
        work_button.setFont(new java.awt.Font("Blue Highway", 1, 19)); // NOI18N
        work_button.setForeground(new java.awt.Color(255, 255, 255));
        work_button.setText("Work");
        work_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                work_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(work_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, -1, 30));

        plus5.setBackground(new java.awt.Color(51, 77, 157));
        plus5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plus5.setForeground(new java.awt.Color(255, 255, 255));
        plus5.setText("+");
        plus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus5MouseClicked(evt);
            }
        });
        getContentPane().add(plus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 40, 30));

        minus5.setBackground(new java.awt.Color(51, 77, 157));
        minus5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        minus5.setForeground(new java.awt.Color(255, 255, 255));
        minus5.setText("-");
        minus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus5MouseClicked(evt);
            }
        });
        getContentPane().add(minus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 40, 30));

        plus10.setBackground(new java.awt.Color(51, 77, 157));
        plus10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plus10.setForeground(new java.awt.Color(255, 255, 255));
        plus10.setText("+");
        plus10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus10MouseClicked(evt);
            }
        });
        getContentPane().add(plus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 40, 30));

        minus10.setBackground(new java.awt.Color(51, 77, 157));
        minus10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        minus10.setForeground(new java.awt.Color(255, 255, 255));
        minus10.setText("-");
        minus10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus10MouseClicked(evt);
            }
        });
        getContentPane().add(minus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 40, 30));

        plus20.setBackground(new java.awt.Color(51, 77, 157));
        plus20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plus20.setForeground(new java.awt.Color(255, 255, 255));
        plus20.setText("+");
        plus20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus20MouseClicked(evt);
            }
        });
        getContentPane().add(plus20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 40, 30));

        minus20.setBackground(new java.awt.Color(51, 77, 157));
        minus20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        minus20.setForeground(new java.awt.Color(255, 255, 255));
        minus20.setText("-");
        minus20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus20MouseClicked(evt);
            }
        });
        getContentPane().add(minus20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 40, 30));

        p1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 143, 130, 130));

        p2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, 130));

        p3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3MouseClicked(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 130, 130));

        p4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4MouseClicked(evt);
            }
        });
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 130, 130));

        p5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, 130));

        p6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6MouseClicked(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 130, 130));

        p7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7MouseClicked(evt);
            }
        });
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 130));

        p8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8MouseClicked(evt);
            }
        });
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 130, 130));

        p9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9MouseClicked(evt);
            }
        });
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 130, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/background2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMachine(Machine2 machine2){
        this.machine2=machine2;
    }
    
    public Machine2 getMachine(){
        return this.machine2;
    }
    
    /*
    Displays products information depending on the button clicked.
    It also checks its availability calling the method in the logic package
    If its available, then the purchase buttons appear.
    */
    public void displayProductInformation(int number){
        product_label.setText("Product "+(number+1)+": "+products.get(number).getName());
        description_label.setText(products.get(number).getDescription());
        line.setVisible(true);
        
        if(machine2.validateAvailability(number)==true){
            available_label.setVisible(true);
            available_label.setText("Available");
            cost_label.setVisible(true);
            cost_label.setText("Cost: $"+products.get(number).getCost());
            introduce_money_label.setVisible(true);
            myfunds_label.setVisible(true);
            coin5_image.setVisible(true);
            coin10_image.setVisible(true);
            coin20_image.setVisible(true);
            totalIntroduced_label.setVisible(true);
            change_label.setVisible(true);
            line1.setVisible(true);
            sold_label.setVisible(true);
            plus5.setVisible(true);
            minus5.setVisible(true);
            plus10.setVisible(true);
            minus10.setVisible(true);
            plus20.setVisible(true);
            minus20.setVisible(true);
            work_button.setVisible(true);  
            coins5change.setVisible(false);
            coins10change.setVisible(false);
            coins20change.setVisible(false);
        }
        else{
            available_label.setVisible(true);
            available_label.setText("Unavailable");
        }
    } 
    
    public void checkPossibleBuy(){//Checks if with the money inside the machine, the user can buy another product
        myfunds_label.setText("Your funds: "+user.getMoney());//displays user funds.
        if(user.getMoney()<products.get(number).getCost()){
            sold_label.setText("Insufficient funds. Make another selection");
        }
        if(machine2.validateMoneyIntroduced(number, total_introduced)==false){// validate if with the number intorduced you could buy the other product selected
            buy_button.setVisible(false);
            sold_label.setText("Introduce more money");
            
        }
        else{
            buy_button.setVisible(true);
            sold_label.setText("You can buy this!");
        }
    }
    
    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked
        number=0;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p1MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        number=1;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p2MouseClicked

    private void p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseClicked
        number=2;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p3MouseClicked

    private void p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseClicked
        number=3;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p4MouseClicked

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
        number=4;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p5MouseClicked

    private void p6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseClicked
        number=5;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p6MouseClicked

    private void p7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseClicked
        number=6;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p7MouseClicked

    private void p8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseClicked
        number=7;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p8MouseClicked

    private void p9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseClicked
        number=8;
        displayProductInformation(number);
        checkPossibleBuy();
    }//GEN-LAST:event_p9MouseClicked

    private void menu_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_buttonMouseClicked
        Menu menu = new Menu(); // Opens the frame to inctroduce Player names.
         menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menu_buttonMouseClicked
    /*
    Updates the quantity of money introduced by the user, validates it does not go below 0
    */
    private void minus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus5MouseClicked
       sold_label.setText("");
       if(total_introduced-5>=0){
           total_introduced=total_introduced-5;
           user.setMoney(user.getMoney()+5);
           myfunds_label.setText("Your funds: "+user.getMoney());
           coins_introduced.set(0, coins_introduced.get(0)-1);
       }
       totalIntroduced_label.setText("Total money introduced: "+total_introduced);
       if(machine2.validateMoneyIntroduced(number, total_introduced)==false){
            buy_button.setVisible(false);
            sold_label.setText("Introduce more money");
        }
       else{
            buy_button.setVisible(true);
           sold_label.setText("You can buy this!");
       }
       
    }//GEN-LAST:event_minus5MouseClicked
    /*
    Updates the quantity of money introduced by the user. It also validates if the user can buy the product
    */
    private void plus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus5MouseClicked
        if(user.getMoney()<=0){
            sold_label.setText("You don´t have any more money");
        }
        if(original_money>=user.getMoney()&& user.getMoney()-5>=0){
            total_introduced=total_introduced+5;
            totalIntroduced_label.setText("Total money introduced: "+total_introduced);
            user.setMoney(user.getMoney()-5);
            myfunds_label.setText("Your funds: "+user.getMoney());
            coins_introduced.set(0, coins_introduced.get(0)+1);
            if(machine2.validateMoneyIntroduced(number, total_introduced)==true){
                buy_button.setVisible(true);
                sold_label.setText("You can buy this!");
            }
        }
        else{
            sold_label.setText("You don't have any 5 coins");
        }
    
    }//GEN-LAST:event_plus5MouseClicked
    /*
    It adds $100 to the user's money.
    */
    private void work_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_work_buttonMouseClicked

        user.setMoney(user.getMoney()+100+total_introduced);
        total_introduced=0;
        original_money=user.getMoney();
        myfunds_label.setText("Your funds: "+user.getMoney());
        sold_label.setText("");
        coins_introduced.set(0,0);
        coins_introduced.set(1,0);
        coins_introduced.set(2,0);
        if(user.getMoney()>=total_introduced+5){
            if(user.getMoney()>=products.get(number).getCost()){
                totalIntroduced_label.setText("Total money introduced: "+total_introduced);
                if(machine2.validateMoneyIntroduced(number, total_introduced)==true){
                    buy_button.setVisible(true);
                }
        }
            else{
                sold_label.setText("Insufficient funds. Make another selection");
            }
        }
    }//GEN-LAST:event_work_buttonMouseClicked

    private void plus10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus10MouseClicked
        if(user.getMoney()<=0){
            sold_label.setText("You don´t have any more money");
        }
        if(original_money>=user.getMoney()&& user.getMoney()-10>=0){
            total_introduced=total_introduced+10;
            totalIntroduced_label.setText("Total money introduced: "+total_introduced);
            user.setMoney(user.getMoney()-10);
            myfunds_label.setText("Your funds: "+user.getMoney());
            coins_introduced.set(1, coins_introduced.get(1)+1);
            if(machine2.validateMoneyIntroduced(number, total_introduced)==true){
                buy_button.setVisible(true);
                sold_label.setText("You can buy this!");
            }
        }
        else{
            sold_label.setText("You don't have any 10 coins");
        }
    }//GEN-LAST:event_plus10MouseClicked

    private void plus20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus20MouseClicked
        if(user.getMoney()<=0){
            sold_label.setText("You don´t have any more money");
        }
        if(original_money>=user.getMoney()&& user.getMoney()-20>=0){
            total_introduced=total_introduced+20;
            totalIntroduced_label.setText("Total money introduced: "+total_introduced);
            user.setMoney(user.getMoney()-20);
            myfunds_label.setText("Your funds: "+user.getMoney());
            coins_introduced.set(2, coins_introduced.get(2)+1);
            if(machine2.validateMoneyIntroduced(number, total_introduced)==true){
                buy_button.setVisible(true);
                sold_label.setText("You can buy this!");
            }
        }
        else{
            sold_label.setText("You don't have any 20 coins");
        }
    }//GEN-LAST:event_plus20MouseClicked

    private void minus10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus10MouseClicked
       sold_label.setText("");
       if(total_introduced-10>=0){
           total_introduced=total_introduced-10;
           user.setMoney(user.getMoney()+10);
           myfunds_label.setText("Your funds: "+user.getMoney());
           coins_introduced.set(1, coins_introduced.get(1)-1);
       }
       totalIntroduced_label.setText("Total money introduced: "+total_introduced);
       if(machine2.validateMoneyIntroduced(number, total_introduced)==false){
            buy_button.setVisible(false);
            sold_label.setText("Introduce more money");
        }
       else{
            buy_button.setVisible(true);
           sold_label.setText("You can buy this!");
       }
    }//GEN-LAST:event_minus10MouseClicked

    private void minus20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus20MouseClicked
        sold_label.setText("");
       if(total_introduced-20>=0){
           total_introduced=total_introduced-20;
           user.setMoney(user.getMoney()+20);
           myfunds_label.setText("Your funds: "+user.getMoney());
           coins_introduced.set(2, coins_introduced.get(2)-1);
       }
       totalIntroduced_label.setText("Total money introduced: "+total_introduced);
       if(machine2.validateMoneyIntroduced(number, total_introduced)==false){
            buy_button.setVisible(false);
            sold_label.setText("Introduce more money");
        }
       else{
            buy_button.setVisible(true);
           sold_label.setText("You can buy this!");
       }
    }//GEN-LAST:event_minus20MouseClicked
    /*
    It gets the the user's change, each of the coins that have to be returned and saves the state of the machine.
    */
    private void buy_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy_buttonMouseClicked
        machine2.addIntroducedCoins(coins_introduced);
        ArrayList<Integer> change=machine2.getChange(number, total_introduced);
        introduce_money_label.setText("Your change:");
        myfunds_label.setText("Total change:"+change.get(0));
        plus5.setVisible(false);
        plus10.setVisible(false);
        plus20.setVisible(false);
        minus5.setVisible(false);
        minus10.setVisible(false);
        minus20.setVisible(false);
        coins5change.setVisible(true);
        coins10change.setVisible(true);
        coins20change.setVisible(true);
        if(change.get(1)==1){
            coins5change.setText(""+change.get(1)+" coin");
        }
        else{
            coins5change.setText(""+change.get(1)+" coins");
        }
        if(change.get(2)==1){
            coins10change.setText(""+change.get(2)+" coin");
        }
        else{
            coins10change.setText(""+change.get(2)+" coins");
        }
        if(change.get(3)==1){
            coins5change.setText(""+change.get(3)+" coin");
        }
        else{
            coins20change.setText(""+change.get(3)+" coins");
        }
        
        machine2.reduceAvailability(number);
        System.out.println(products.get(number).getAvailable());
        totalIntroduced_label.setText("SOLD!");
        sold_label.setVisible(false);
        buy_button.setVisible(false);
        work_button.setVisible(false);
        food_button.setVisible(true);
        
        machine2.setProducts(products);
        machine2.setUser(user);
        machine2.setCoins(coins);
        
        String filename=""; // saves the state of the machine
        filename="machine3.txt";
        machine_writer2.writer2(machine2, filename);
        
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
    }//GEN-LAST:event_buy_buttonMouseClicked

    private void food_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_food_buttonMouseClicked
       
        Menu menu = new Menu(); // Opens the frame to inctroduce Player names.
        menu.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_food_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel available_label;
    private javax.swing.JLabel background;
    private javax.swing.JButton buy_button;
    private javax.swing.JLabel change_label;
    private javax.swing.JLabel coin10_image;
    private javax.swing.JLabel coin20_image;
    private javax.swing.JLabel coin5_image;
    private javax.swing.JLabel coins10change;
    private javax.swing.JLabel coins20change;
    private javax.swing.JLabel coins5change;
    private javax.swing.JLabel cost_label;
    private javax.swing.JLabel description_label;
    private javax.swing.JButton food_button;
    private javax.swing.JLabel introduce_money_label;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JButton menu_button;
    private javax.swing.JButton minus10;
    private javax.swing.JButton minus20;
    private javax.swing.JButton minus5;
    private javax.swing.JLabel myfunds_label;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JButton plus10;
    private javax.swing.JButton plus20;
    private javax.swing.JButton plus5;
    private javax.swing.JLabel product_label;
    private javax.swing.JLabel sold_label;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalIntroduced_label;
    private javax.swing.JButton work_button;
    // End of variables declaration//GEN-END:variables
}
