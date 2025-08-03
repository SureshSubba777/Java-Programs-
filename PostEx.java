import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PostTest")
public class PostEx extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String fn = req.getParameter("Firstname");
        String ln = req.getParameter("Lastname");

        out.print("<html><head><title>Servlet Test</title></head>");
        out.print("<body><h1> First Name: "+fn+"<br>");
        out.print("Lastname: "+ln+"</h1></body></head>");
    }
}
