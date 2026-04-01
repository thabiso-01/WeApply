package com.weapply.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/login")
public class AdminLoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display admin login page
        request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Placeholder for authentication logic
        if (authenticate(username, password)) {
            response.sendRedirect("adminDashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid credentials");
            request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
        }
    }

    private boolean authenticate(String username, String password) {
        // Implement your authentication logic here
        return "admin".equals(username) && "secret".equals(password);
    }
}