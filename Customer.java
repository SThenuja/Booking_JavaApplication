/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_company;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Phone
 */
public class Customer {
    String customerid;
    String name;
    String gender;
    String address;
    String email;
    int contactno;

    public Customer(String customerid, String name, String gender, String address, String email, int contactno) {
        this.customerid = customerid;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.contactno = contactno;
    }

    public String getCustomerid() {
        return customerid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getContactno() {
        return contactno;
    }
    
    //insert fuction      
    public static boolean insertValue(String customerid,String name,String gender,String address,String email,String contactNo)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="insert into customer(CustomerID,Name,Gender,Address,Email,ContactNo)values(?,?,?,?,?,?)";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,customerid);
          pst.setString(2,name);
          pst.setString(3,gender);
          pst.setString(4,address);
          pst.setString(5,email );
          pst.setString(6,contactNo );
          
           if(pst.executeUpdate()>0)
                            flag = true;
      }
     catch(Exception ex)
        {
            System.out.println(ex);
        }
      return flag;
      }
    
  //update function
   public static boolean upDateValue(String customerid, String name,String gender,String address,String email,String contactNo)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE customer SET Name=?,Gender=?,Address=?,Email=?,ContactNo=? WHERE CustomerID=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,customerid);
          pst.setString(2,name);
          pst.setString(3,gender);
          pst.setString(4,address);
          pst.setString(5,email);
          pst.setString(6,contactNo);
          
           if(pst.executeUpdate()>0)
                            flag = true;
      }
     catch(Exception ex)
        {
            System.out.println(ex);
        }
      return flag;
      }
   
  //delete function
 public static boolean deleteValue(String customerid, int status)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE customer SET status=? WHERE CustomerID=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setInt(1,status);
          pst.setString(2, customerid);
          pst.executeUpdate();
           pst.executeUpdate();
                            flag = true;
      }
     catch(Exception ex)
        {
            System.out.println(ex);
        }
      return flag;
      } 
}
