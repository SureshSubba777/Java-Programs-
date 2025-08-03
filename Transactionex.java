
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactionex {
 public static void main(String[] args) throws ClassNotFoundException{
    Connection con = null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String  url = "jdbc:mysql://localhost:3306/world?allowMultiQueries=true";
     con = DriverManager.getConnection(url, "root", "@#$123Sh");
    con.setAutoCommit(false);
   String s = "INSERT INTO student(name, age, gender, email) VALUES('Ram Lama', 22, 'male', 'ramlama@mail.com');" +
           "INSERT INTO student(name, age, gender, email) VALUES('Sabina Lama', 21, 'female', 'sabinalama@mail.com');";

    Statement stmt = con.createStatement();
    stmt.execute(s);
    con.commit();
    con.setAutoCommit(true);
    stmt.close();
    
    }
    catch(SQLException e){
        e.printStackTrace();
        try {
            if (con != null) {
                con.rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
 }   
}
