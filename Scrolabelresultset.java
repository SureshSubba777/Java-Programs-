import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Scrolabelresultset {
public static void main(String[] args) throws ClassNotFoundException{
    try{Class.forName("com.mysql.cj.jdbc.Driver");
    String  url = "jdbc:mysql://localhost:3306/world";

    Connection conn = DriverManager.getConnection(url, "root", "@#$123Sh");

    String sql = "SELECT * FROM student";

    Statement stat = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

    ResultSet rs = stat.executeQuery(sql);
    while(rs.next()){
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
    }//Scrollable row
    rs.first();
    System.out.println("First Record \n");
     System.out.println(rs.getInt(1)+" "+rs.getString(2));
     rs.next();
     System.out.println("Previous  record");
      System.out.println(rs.getInt(1)+" "+rs.getString(2));
//upadateable resultset
    rs.moveToInsertRow();
rs.updateString(2, "Rakesh lama");
rs.insertRow(); // <-- required to insert

rs.absolute(1);
rs.updateString(2, "Kushal lama");
rs.updateRow(); // <-- saves update

rs.absolute(4);
rs.deleteRow(); // <-- deletes row


    }
    catch(SQLException e){
        System.out.println("Error:"+e.getMessage());
    }
}    
}
