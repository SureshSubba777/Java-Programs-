import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL_DMLopex {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";

            Connection conn = DriverManager.getConnection(url,"root","@#$123Sh");
            
            //writing a statement 
            Statement stmt = conn.createStatement();

           String str = "CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(30), email VARCHAR(100));";

            stmt.executeUpdate(str);

            String insert = "INSERT INTO user (name, email) VALUES" +
            "('Suresh Subba', 'suresh@example.com')," +
            "('Rita Tamang', 'rita.tamang@example.com')," +
            "('Bimal Gurung', 'bimal.g@example.com')," +
            "('Sangita Rai', 'sangita.rai@example.com')," +
            "('Kiran Thapa', 'kiran.t@example.com')," +
            "('Meena Lama', 'meena.l@example.com')," +
            "('Rajiv Karki', 'rajiv.k@example.com')," +
            "('Anju Shrestha', 'anju.s@example.com')," +
            "('Niraj Basnet', 'niraj.b@example.com')," +
            "('Laxmi Magar', 'laxmi.m@example.com')";
            stmt.executeUpdate(insert);

            String select = "SELECT * FROM user";

            ResultSet rs = stmt.executeQuery(select);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                 String email = rs.getString("email");
                 System.out.println("Id: "+id+",\tName: "+name+"\t Email: "+email);
            }
            conn.close();            
        }

        catch(ClassNotFoundException e){
            System.out.println("no such class found");
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
