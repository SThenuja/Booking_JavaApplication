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
public class HallDetailsDbHandling {
    String hallName;
    String hallPlace;
    String hallId;
    public HallDetailsDbHandling(String phallName , String phallPlace, String phallId)
    {
       
        this.hallName=phallName;
        this.hallPlace=phallPlace;
        this.hallId=phallId;
    }

    public String getHallName() {
        return hallName;
    }

    public String getHallPlace() {
        return hallPlace;
    }
    public String getHallId()
    {
        return hallId;
    }
    public static boolean insertValue(String hallName, String place)
    {
        boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="insert into hall(hall_Name,hall_Place)values(?,?)";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,hallName);
          pst.setString(2,place);
           if(pst.executeUpdate()>0)
                            flag = true;
      }
     catch(Exception ex)
        {
            System.out.println(ex);
        }
      return flag;
    }
    
    //Update
     public static boolean upDateValue(int hallid, String hallname,String place)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE hall SET hall_Name=?,hall_Place=? WHERE hall_No=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setString(1,hallname);
          pst.setString(2,place);
          pst.setInt(3,hallid);
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
     public static boolean deleteValue(int bk_id, int status)
      {
      boolean flag=false;
      try
      {
          Connection con=DBconnection.connect();
          String query="UPDATE hall SET status=? WHERE BookingID=?";
          PreparedStatement pst=con.prepareStatement(query);
          pst.setInt(1,status);
          pst.setInt(2, bk_id);
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
