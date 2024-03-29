
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandi
 */
public final class inventory_page extends javax.swing.JFrame {

    /**
     * Creates new form inventory_page
     */
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String today;
    String expiry;
    
    public inventory_page() {
        initComponents();
        showtabledata();
        fillcombo();
        fillcategory();
        sku();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sku = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        vendorname = new javax.swing.JComboBox<>();
        remarks = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        expiry_date = new com.toedter.calendar.JDateChooser();
        search_product = new javax.swing.JTextField();
        search_vendor = new javax.swing.JTextField();
        search_category = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SKU");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vendor Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Remarks");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Category");

        sku.setEditable(false);
        sku.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        sku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skuActionPerformed(evt);
            }
        });

        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });

        vendorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendornameActionPerformed(evt);
            }
        });

        savebutton.setText("SAVE");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Expiry Date");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        expiry_date.setDateFormatString("dd-MM-yyyy");

        search_product.setText("Search...");
        search_product.setAutoscrolls(false);
        search_product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_productMouseClicked(evt);
            }
        });
        search_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_productActionPerformed(evt);
            }
        });
        search_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_productKeyReleased(evt);
            }
        });

        search_vendor.setText("Search...");
        search_vendor.setAutoscrolls(false);
        search_vendor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_vendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_vendorMouseClicked(evt);
            }
        });
        search_vendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_vendorActionPerformed(evt);
            }
        });
        search_vendor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_vendorKeyReleased(evt);
            }
        });

        search_category.setText("Search...");
        search_category.setAutoscrolls(false);
        search_category.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_categoryMouseClicked(evt);
            }
        });
        search_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_categoryActionPerformed(evt);
            }
        });
        search_category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_categoryKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Product name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search Vendor name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search Product category");

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(stock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                    .addComponent(productname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sku, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(expiry_date, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vendorname, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jButton4)
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_category, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_vendor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expiry_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(vendorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(savebutton)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton1)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_vendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed
void showtabledata()
      {
       
        try{
            conn=MySqlConnect.ConnectDB();
        String Sql="select sku as 'SKU', product_name as 'Product Name', product_category as 'Product Category', stock as 'Stock', expiry as 'Expiry Date', vendor_name as 'Vendor Name', remarks as 'Remarks' from inventory_page";
            pst=conn.prepareStatement(Sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
      }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        conn=MySqlConnect.ConnectDB();
        String Sql="UPDATE inventory_page SET product_name=?,product_category=?, stock=?,expiry=?,vendor_name=?, remarks=? WHERE sku=?";
        try{
            
            pst=conn.prepareStatement(Sql);
            pst.setString(1, productname.getText());
            pst.setString(2, category.getSelectedItem().toString());
            pst.setString(3, stock.getText());
            pst.setString(4, ((JTextField)expiry_date.getDateEditor().getUiComponent()).getText());
            pst.setString(5, vendorname.getSelectedItem().toString());
            pst.setString(6, remarks.getText());
            pst.setString(7, sku.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
            showtabledata();
            reset();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed
public void setdate()
{
    java.util.Date date = new java.util.Date();
    Date today=new Date();  
    today.getDate();
    String expiry = ((JTextField)expiry_date.getDateEditor().getUiComponent()).getText();
    
}
    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        conn = MySqlConnect.ConnectDB();
        String Sql = "INSERT INTO inventory_page VALUES(?,?,?,?,?,?,?) ";
        try {

            pst = conn.prepareStatement(Sql);
            pst = conn.prepareStatement(Sql);
            pst.setString(1, sku.getText());
            pst.setString(2, productname.getText());
            pst.setString(3, category.getSelectedItem().toString());
            pst.setString(4, stock.getText());
            pst.setString(5, ((JTextField)expiry_date.getDateEditor().getUiComponent()).getText());
            pst.setString(6, vendorname.getSelectedItem().toString());
            pst.setString(7, remarks.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " Saved Sccessfully ");
            showtabledata();
            reset();
            sku();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_savebuttonActionPerformed
    private void fillcombo(){
    try{
    String sql="select * from vendor_form";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    
    while(rs.next()){
    String vendor_name =rs.getString("vendor_name");
    vendorname.addItem(vendor_name);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    public void sku()
    {
        conn=MySqlConnect.ConnectDB();
        String Sql="SELECT MAX(sku) FROM inventory_page";
        try{
            pst=conn.prepareStatement(Sql);

       rs=pst.executeQuery();
           
            rs.next();
            rs.getString("MAX(sku)");
            if (rs.getString("MAX(sku)") == null) {
                sku.setText("I-0000001");    
            } else {
                long id = Long.parseLong(rs.getString("MAX(sku)").substring(2, rs.getString("MAX(sku)").length()));
                id++;
                sku.setText("I-" + String.format("%07d", id));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }      
    }
    private void fillcategory(){
    try{
    String sql="select * from product_category";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    
    while(rs.next()){
    String pcategory =rs.getString("productcategory");
    category.addItem(pcategory);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void reset(){
    sku.setText(null);
    productname.setText(null);
    stock.setText(null);
    remarks.setText(null);
    }
    
    private void vendornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendornameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        conn=MySqlConnect.ConnectDB();
        String Sql="DELETE FROM `inventory_page` WHERE sku=? ";
        try{
            
            pst=conn.prepareStatement(Sql);
            pst.setString(1,sku.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null," Deleted Successfully ");
            showtabledata();
            reset();
            sku();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void skuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex= jTable1.getSelectedRow();

        //display data
        sku.setText(model.getValueAt(rIndex,0).toString());
        productname.setText(model.getValueAt(rIndex,1).toString());
        category.setSelectedItem(model.getValueAt(rIndex,2).toString());
        stock.setText(model.getValueAt(rIndex,3).toString());
        expiry_date.setDateFormatString(model.getValueAt(rIndex,4).toString());
        vendorname.setSelectedItem(model.getValueAt(rIndex,5).toString());
        remarks.setText(model.getValueAt(rIndex,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void search_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_productActionPerformed

    private void search_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_productMouseClicked
        // TODO add your handling code here:
        search_product.setText("");
    }//GEN-LAST:event_search_productMouseClicked

    private void search_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_productKeyReleased
        // TODO add your handling code here:
        String tf=search_product.getText();
        try{
            String str1 = "SELECT * FROM inventory_page WHERE product_name LIKE '%"+tf+"%' ";
            pst=conn.prepareStatement(str1);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                if(pst!=null){
                    rs.close();
                    pst.close();
                }
            }catch(Exception e){
            }
        }
        //showtabledata();
    }//GEN-LAST:event_search_productKeyReleased

    private void search_vendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_vendorMouseClicked
        // TODO add your handling code here:
        search_vendor.setText("");
    }//GEN-LAST:event_search_vendorMouseClicked

    private void search_vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_vendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_vendorActionPerformed

    private void search_vendorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_vendorKeyReleased
        // TODO add your handling code here:
        String tf=search_vendor.getText();
        try{
            String str1 = "SELECT * FROM inventory_page WHERE vendor_name LIKE '%"+tf+"%' ";
            pst=conn.prepareStatement(str1);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                if(pst!=null){
                    rs.close();
                    pst.close();
                }
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_search_vendorKeyReleased

    private void search_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_categoryMouseClicked
        // TODO add your handling code here:
        search_category.setText("");
    }//GEN-LAST:event_search_categoryMouseClicked

    private void search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_categoryActionPerformed

    private void search_categoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_categoryKeyReleased
        // TODO add your handling code here:
        String tf=search_category.getText();
        try{
            String str1 = "SELECT * FROM inventory_page WHERE product_category LIKE '%"+tf+"%' ";
            pst=conn.prepareStatement(str1);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                if(pst!=null){
                    rs.close();
                    pst.close();
                }
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_search_categoryKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inventory_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category;
    private com.toedter.calendar.JDateChooser expiry_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField remarks;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField search_category;
    private javax.swing.JTextField search_product;
    private javax.swing.JTextField search_vendor;
    private javax.swing.JTextField sku;
    private javax.swing.JTextField stock;
    private javax.swing.JComboBox<String> vendorname;
    // End of variables declaration//GEN-END:variables
}
