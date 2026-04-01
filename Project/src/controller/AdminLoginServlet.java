package controller;

import util.DBConnection;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {

 protected void doPost(HttpServletRequest req,
                       HttpServletResponse res)
                       throws ServletException, IOException {

     String user = req.getParameter("username");
     String pass = req.getParameter("password");

     try{
         Connection con = DBConnection.getConnection();

         PreparedStatement ps =
           con.prepareStatement(
             "SELECT * FROM admin WHERE username=? AND password=?");

         ps.setString(1,user);
         ps.setString(2,pass);

         ResultSet rs = ps.executeQuery();

         if(rs.next())
             res.sendRedirect("admin/dashboard.jsp");
         else
             res.sendRedirect("admin/login.jsp");

     }catch(Exception e){
         e.printStackTrace();
     }
 }
}