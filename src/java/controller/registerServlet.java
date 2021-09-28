
package controller;

import dao.diadao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.diabetes;

public class registerServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
           PrintWriter out = response.getWriter();
           try {
                      int user_id;
                      String first_name,last_name,password,email,phone;
                      user_id=Integer.parseInt(request.getParameter("txtid"));
                      first_name=request.getParameter("txtFname");
                      last_name=request.getParameter("txtLname");
                      password=request.getParameter("txtPass");
                      email=request.getParameter("txtEmail");
                      phone=request.getParameter("txtPhone");
                      diabetes d=new diabetes();
                      d.setUser_id(user_id);
                      d.setFirst_name(first_name);
                      d.setLast_name(last_name);
                      d.setPassword(password);   
                      d.setEmail(email); 
                      d.setPhone(phone);
                      diadao dd=new diadao();
                      if(dd.Register(d)>0){
                                 out.println("<script type=\"text/javascript\">");
                                 out.println("alert('Registered Successfully!!');");
                                 out.println("location='login.jsp';");
                                 out.println("</script>");
                      }
           }catch(Exception e){
                     out.println(e);
           }
    }
}
