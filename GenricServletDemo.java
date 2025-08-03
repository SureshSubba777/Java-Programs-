import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/gen")
public class GenricServletDemo extends GenericServlet{
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html></html>");
        out.print("<b>Gello Generic Servelet </b");
        out.print("</body></html>");
    }
}