/*
 * handle the customer details
 * maintain customerdetails first customer register under this company
 */
package abc_company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import static java.util.logging.Level.parse;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Phone
 */
public class CustomerDetails extends javax.swing.JFrame {
    Connection con = null;
  
    public CustomerDetails() {
        initComponents();
        con = DBconnection.connect();
         generateCustomerid();
         tableload();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_cstno = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        btnAdd = new java.awt.Button();
        updatebtn = new java.awt.Button();
        deletebtn = new java.awt.Button();
        txtname = new javax.swing.JTextField();
        btnReset = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbtnmale = new javax.swing.JRadioButton();
        rbtnfemale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cstdetailsTable = new javax.swing.JTable();
        txtcstSearch = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        report = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Customer No");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Address");

        lb_cstno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setLabel("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatebtn.setLabel("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletebtn.setLabel("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReset.setLabel("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Email ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contact No ");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Gender");

        rbtnmale.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(rbtnmale);
        rbtnmale.setText("Male");

        rbtnfemale.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(rbtnfemale);
        rbtnfemale.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_cstno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnmale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnfemale)))))
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_cstno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtnmale)
                    .addComponent(rbtnfemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel10.setText("CUSTOMER DETAILS");

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        cstdetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CustomerNo", "Name", "Gender", "Address", "Email", "ContactNo"
            }
        ));
        cstdetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cstdetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cstdetailsTable);

        txtcstSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcstSearchActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        report.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        report.setText("Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(txtcstSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(report)
                .addGap(209, 209, 209))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcstSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(report)
                .addGap(45, 45, 45))
        );

        jButton5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(222, 222, 222)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    //reset form function
    public void reset()
    {
        txtname.setText("");
        buttonGroup1.clearSelection();
        txtaddress.setText("");
        txtemail.setText("");
        txtphone.setText("");
        generateCustomerid();
    }
    
     //list elements
    public ArrayList<Customer> ListUsers(String valToSearch)
    {
        ArrayList<Customer> userlist=new ArrayList<Customer>();
        Statement st;
        ResultSet rst;
        try
        {
            st=con.createStatement();
            String searchQuery="SELECT * FROM `customer` WHERE CONCAT(`CustomerID`, `Name`, `Gender`, `Address`, `Email`, `ContactNo`)LIKE'%"+valToSearch+"%'";
            rst=st.executeQuery(searchQuery);
            
            Customer dh;
            while(rst.next())
            {
                dh=new Customer(
                                    rst.getString("CustomerID"),
                                    rst.getString("Name"),
                                    rst.getString("Gender"),
                                    rst.getString("Address"),
                                    rst.getString("Email"),
                                    rst.getInt("ContactNo")
                                    
                        );
                userlist.add(dh);
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return userlist;
    }
    
    //search list
    public void findUsers()
    {
        ArrayList<Customer> users=ListUsers(txtcstSearch.getText());
        DefaultTableModel model= new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"CustomerID","Name","Gender","Address","Enail", "ContactNumber"});
        Object[] row=new Object[6];
        for(int i=0 ; i<users.size(); i++)
        {
            row[0]=users.get(i).getCustomerid();
            row[1]=users.get(i).getName();
            row[2]=users.get(i).getGender();
            row[3]=users.get(i).getAddress();
            row[4]=users.get(i).getEmail();
            row[5]=users.get(i).getContactno();
            model.addRow(row);
        }
        cstdetailsTable.setModel(model);
    }
    
    //table load function    
     public void tableload()
   {
       try 
       {
         String sql = "SELECT `CustomerID`, `Name`, `Gender`, `Address`, `Email`, `ContactNo`FROM `customer` WHERE `status`=1";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
         
         cstdetailsTable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         
       } 
       catch (Exception e) 
       {
           System.out.println(e);
       }
   }
     
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String pcustomerid=lb_cstno.getText();
        String pname=txtname.getText();
        rbtnmale.setActionCommand("Male");
        rbtnfemale.setActionCommand("Female");
        String pgender = buttonGroup1.getSelection().getActionCommand();
         String paddress=txtaddress.getText();
         String pemail=txtemail.getText();
         String pcontactNo=txtphone.getText();
        if(pname.trim().isEmpty()|| pgender.trim().isEmpty()|| paddress.trim().isEmpty() ||pemail.trim().isEmpty()||pcontactNo.trim().isEmpty())
        {
           
           JOptionPane.showMessageDialog(null, "Please fill all details!!");
        }
        //email address validation
        else if(!pemail.trim().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
         {
             JOptionPane.showMessageDialog(null, "Invalid email address!!");
         } 
        //phone number valiation
        else if(!pcontactNo.matches("^[0-9]{10}$"))
         {
             JOptionPane.showMessageDialog(null, "Invalid Phone number!!");
         } 
        else
        {
            if(Customer.insertValue(pcustomerid,pname,pgender,paddress,pemail,pcontactNo))
            {
                JOptionPane.showMessageDialog(null, "Successly Added customer Details!!");
                reset();
                tableload();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "UnsucessFully");
            }
        }
          
    }//GEN-LAST:event_btnAddActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update");

        if(x == 0)
        {
            String pcustomerid=lb_cstno.getText();
        String pname=txtname.getText();
        rbtnmale.setActionCommand("Male");
        rbtnfemale.setActionCommand("Female");
        String pgender = buttonGroup1.getSelection().getActionCommand();
         String paddress=txtaddress.getText();
         String pemail=txtemail.getText();
         String pcontactNo=txtphone.getText();
         
        if(pname.trim().isEmpty()|| pgender.trim().isEmpty()|| paddress.trim().isEmpty() ||pemail.trim().isEmpty()||pcontactNo.trim().isEmpty())
        {
           
           JOptionPane.showMessageDialog(null, "Please fill all details!!");
        }
        //email address validation
        else if(!pemail.trim().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))
         {
             JOptionPane.showMessageDialog(null, "Invalid email address!!");
         } 
        //phone number valiation
        else if(!pcontactNo.matches("^[0-9]{10}$"))
         {
             JOptionPane.showMessageDialog(null, "Invalid Phone number!!");
         } 
        else
        {
            try{
                    if(Customer.upDateValue(pcustomerid,pname,pgender,paddress,pemail,pcontactNo))
                    {
                        JOptionPane.showMessageDialog(null, "Successfully Updated!!");
                        reset();
                        tableload();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Try Again");
                    }
            
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
        }  
                
           
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       // delete function
                int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete");

        if(x == 0)
        {
            String pcustomerid=lb_cstno.getText();
        String pname=txtname.getText();
        rbtnmale.setActionCommand("Male");
        rbtnfemale.setActionCommand("Female");
        String pgender = buttonGroup1.getSelection().getActionCommand();
         String paddress=txtaddress.getText();
         String pemail=txtemail.getText();
         String pcontactNo=txtphone.getText();
         int status=0;
        if(pname.trim().isEmpty()|| pgender.trim().isEmpty()|| paddress.trim().isEmpty() ||pemail.trim().isEmpty()||pcontactNo.trim().isEmpty())
        {
           
           JOptionPane.showMessageDialog(null, "Please fill all details!!");
        }
        else
        {
            try{
                    if(Customer.deleteValue(pcustomerid,status))
                    {
                        JOptionPane.showMessageDialog(null, "Successfully Deleted!!");
                        reset();
                        tableload();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Try Again :|");
                    }
            
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
        }  
                
           
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void cstdetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cstdetailsTableMouseClicked
        int row=cstdetailsTable.getSelectedRow();
        //String customerNo=cstdetailsTable.getValueAt(row, 0).toString();
        String customerNo=cstdetailsTable.getValueAt(row, 0).toString();
        String Name=cstdetailsTable.getValueAt(row, 1).toString();
        String gender=cstdetailsTable.getValueAt(row, 2).toString();
        String address=cstdetailsTable.getValueAt(row, 3).toString();
        String email=cstdetailsTable.getValueAt(row, 4).toString();
        String contactno=cstdetailsTable.getValueAt(row, 5).toString();
        
        lb_cstno.setText(customerNo);
        txtname.setText(Name);
        if(gender.equals("Male"))
        {
            rbtnmale.setSelected(true);
        }
       else
        {
            rbtnfemale.setSelected(true);
        }
        txtaddress.setText(address);
        txtemail.setText(email);
        txtphone.setText(contactno);
        btnAdd.disable();
        updatebtn.enable();
        deletebtn.enable();
    }//GEN-LAST:event_cstdetailsTableMouseClicked

    private void txtcstSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcstSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcstSearchActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        findUsers();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);       //switch to next page
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);       //switch to next page
        new login().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
//report generating
    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        try{
            String report = "C:\\Users\\Thenuja\\Desktop\\OOP_assignment\\ABC_company\\src\\abc_company\\customer_report.jrxml";
            JasperReport jr=JasperCompileManager.compileReport(report);
            JasperPrint j=JasperFillManager.fillReport(jr,null,con);
            JasperViewer.viewReport(j);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_reportActionPerformed

    //auto increment customer id
    public void generateCustomerid()
    {
            try
             {
                  String query="Select count('CustomerID')as countNo from customer";
                  PreparedStatement pst=con.prepareStatement(query);
                   ResultSet rs=pst.executeQuery();
                  String prefix="CST_";
                   while(rs.next())
                   {
                        int num = rs.getInt("countNo");
                        int inc=num+1;
                        String id=prefix+inc;
                        lb_cstno.setText(id);
                        lb_cstno.setVisible(true);

                    }

            }

            catch(Exception a)
            {
                    System.out.println(a);
            }
    }
    
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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAdd;
    private java.awt.Button btnReset;
    private javax.swing.JButton btn_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable cstdetailsTable;
    private java.awt.Button deletebtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_cstno;
    private javax.swing.JRadioButton rbtnfemale;
    private javax.swing.JRadioButton rbtnmale;
    private javax.swing.JButton report;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcstSearch;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private java.awt.Button updatebtn;
    // End of variables declaration//GEN-END:variables
}
