package abc_company;
//import jar file for db connection
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.TableModel;


public class DBconnection {
    
    public static Connection connect()
    {
        Connection conn=null;
        try
        {
            //connect with jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abccompany", "root", "");
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return conn;
    }

    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
