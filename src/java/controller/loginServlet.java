
package controller;

import dao.diadao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           PrintWriter out = response.getWriter();
           String username,password;
           username = request.getParameter("txtid");
           password = request.getParameter("txtPass");
           diadao rd = new diadao();
            try {
                      if (username == null || password == null) {
                                  out.print("username or passwpord are null please check.");
                      }else {
                                 if(rd.checklogin(username, password)){
                                             //response.sendRedirect("index.html"); 
                                             response.setContentType("text/html");  
                                             out.println("<script type=\"text/javascript\">");  
                                             out.println("alert('Login Successfully!!');");  
                                             out.println("location='index.html';");
                                             out.println("</script>");
                                 }else {
                                             out.println("<script type=\"text/javascript\">");
                                             out.println("alert('Wrong Credentials! Please enter correct credentials.');");
                                             out.println("location='login.jsp';");
                                             out.println("</script>");
                                 }
                      } 
           } catch (Exception e){
                      out.println(e);
           }
    }
}



