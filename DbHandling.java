/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author Phone
 */
public class DbHandling {

//    static boolean upDateValue(int hallid, String phallname, String place) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
      String customerName;
      String nic;
      String startDate;
      String endDate;
      String hall;
      String place;
      String bookingid;
   
    public DbHandling(String bookingid,String customerName, String nic, String hall,String startDate, String endDate, String place) {
       
        this.customerName = customerName;
        this.nic = nic;
        this.hall = hall;
        this.startDate = startDate;
        this.endDate = endDate;
        this.place=place;
        this.bookingid=bookingid;
        
    }

    DbHandling(String bookingid,String customerName, String nic, String hall,String startDate, String endDate) {
        this.customerName = customerName;
        this.nic = nic;
        this.hall = hall;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingid=bookingid;
    }
   
    
    public String getCustomerName() {
        return customerName;
    }

    public String getNic() {
        return nic;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getHall() {
        return hall;
    }

    public String getPlace() {
        return place;
    }

    public String getBookingid() {
        return bookingid;
    }
    
      
//insert fuction      
    public static boolean insertValue(String bookingid,String customerName,String nic,String hall,String startDate,String endDate,String place)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="insert into booking(BookingID,CustomerName,NIC,Hall,StartDate,EndDate,Place)values(?,?,?,?,?,?,?)";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,bookingid);
          pst.setString(2,customerName);
          pst.setString(3,nic);
          pst.setString(4,hall);
          pst.setString(5,startDate );
          pst.setString(6,endDate );
          pst.setString(7, place);
          
           if(pst.executeUpdate()>0)
                            flag = true;
      }
     catch(Exception ex)
        {
            System.out.println(ex);
        }
      return flag;
      }
   
   
   public static void main(String[] args) {
        //Connection conn=null;
      
    }

  
//update function
   public static boolean upDateValue(String bookingid, String customerName,String nic,String hall,String startDate,String endDate,String place)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE booking SET CustomerName=?,NIC=?,Hall=?,StartDate=?,EndDate=?,Place=? WHERE BookingID=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,customerName);
          pst.setString(2,nic);
          pst.setString(3,hall);
          pst.setString(4,startDate);
          pst.setString(5,endDate);
          pst.setString(6, place);
          pst.setString(7, bookingid);
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
//delete function
 public static boolean deleteValue(String bookingid, int status)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE booking SET status=? WHERE BookingID=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setInt(1,status);
          pst.setString(2, bookingid);
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

