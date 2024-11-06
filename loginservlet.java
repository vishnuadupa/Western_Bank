package com.bank;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "password123".equals(password)) {
            response.sendRedirect("home.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid credentials!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
