import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PostJdbc")
public class JdbcegwithServlest extends HttpServlet{
    Connection con = null;
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        String url = "jdbc:mysql://localhost:3306/world";
        try {
            String name = req.getParameter("Name");
            String password = req.getParameter("password");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            con = DriverManager.getConnection(url, "root", "@#$123Sh");
            Statement st = con.createStatement();
            String sql = "select * from login where name = '"+name+"' and password = '"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            if(!rs.next()){
                out.println("<html><head><title>Login error</title></head>");
                out.println("<body><br><br> Unknown User<br><br>");
                out.println("<h3>Access Denied</h3></body></html>");
            }
            else{
                  out.println("<html><head><title>Login sucessful</title></head>");
                out.println("<body><br><br> You have been authenticated<br><br>");
                out.println("<h3>Access Granted</h3></body></html>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
