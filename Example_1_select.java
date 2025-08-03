import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example_1_select {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";
            Connection conn = DriverManager.getConnection(url, "root", "@#$123Sh");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Name FROM student");

            while(rs.next()){
                String  name = rs.getString("Name");
                System.out.println("Name: "+name);
            }
            conn.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("JDBC Driver not found: "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
