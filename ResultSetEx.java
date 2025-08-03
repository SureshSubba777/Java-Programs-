import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetEx {
    public static void main(String[] args) throws ClassNotFoundException{
       try{ Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world?allowMultiQueries=true";

        Connection conn = DriverManager.getConnection(url, "root", "@#$123Sh");
        int rsCount = 0;
       String queries = "SELECT id, Name FROM student; SELECT id, email, Namet5t FROM student WHERE gender = 'male';";

    
        Statement stmt = conn.createStatement();
        boolean result = stmt.execute(queries);
        do{
            if(result){
                ResultSet rs = stmt.getResultSet();
                rsCount++;
                System.out.println(rsCount);
                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("id")+"\t Name: "+rs.getString("Name"));
                }
            }
            System.out.println();
            result = stmt.getMoreResults();
    }while(result);
    stmt.close();
    conn.close();
    }
    catch (SQLException e){
        e.printStackTrace();
    }

}
}
