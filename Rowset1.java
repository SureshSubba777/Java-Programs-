import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Rowset1  {
    public static void main(String[] args) throws ClassNotFoundException{
        String url ="jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "@#$123Sh";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);

            rowSet.setCommand("SELECT * FROM student");
            rowSet.execute();
            System.out.println("id\tname\t");
            while(rowSet.next()){
                System.out.println(rowSet.getInt("id")+"\t"+rowSet.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
