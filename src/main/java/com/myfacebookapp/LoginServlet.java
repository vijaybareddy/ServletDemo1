package com.myfacebookapp;

    import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    public class LoginServlet extends HttpServlet {
        private static final String VALID_USERNAME = "Bareddy@143";
        private static final String VALID_PASSWORD = "Vijay@143";

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");

            if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
                request.getRequestDispatcher("WelcomeServlet").forward(request, response);
            } else {
                response.setContentType("text/html");
                response.getWriter().println("Sorry, Username or Password Wrong");
            }
        }
    }
