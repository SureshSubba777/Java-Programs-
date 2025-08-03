import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/interface")
public class ServletInterfaceDemo implements Servlet{
    ServletConfig config = null;
    public void init(ServletConfig config){
        this.config = config;
        System.out.println("Servlet is initialize");
    }
    public void service(ServletRequest req, ServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b> Hello simple servlet");
        out.print("</body></html>");
    }
    public void destroy(){
        System.out.println("Servelet is destroy");
    }
    public ServletConfig getServletConfig(){return config;}
    public String getServletInfo(){
        return "Implementing Servlet Interface";
    }
}
