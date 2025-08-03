import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world", "root", "@#$123Sh");

            System.out.println("Connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}