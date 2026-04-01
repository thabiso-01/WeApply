package controller;

import dao.InstitutionDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/institutions")
public class InstitutionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        InstitutionDAO dao = new InstitutionDAO();

        request.setAttribute(
            "institutions",
            dao.getAllInstitutions()
        );

        RequestDispatcher rd =
            request.getRequestDispatcher("views/institutions.jsp");

        rd.forward(request,response);
    }
}