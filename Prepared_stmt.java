import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_stmt {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world";
        Connection con = DriverManager.getConnection(url,"root","@#$123Sh");
        
        String query = "select * from student where id = ? and Name = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, 2);
        ps.setString(2, "Ram Thapa");

        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("Name");
            int age = rs.getInt("age");
            String  gender = rs.getString("gender");
            String email = rs.getString("email");

            System.out.println(id+","+name+","+age+", "+gender+","+email);

        }
        }
        catch(SQLException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
