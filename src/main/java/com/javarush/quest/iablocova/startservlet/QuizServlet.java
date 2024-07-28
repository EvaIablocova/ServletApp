package com.javarush.quest.iablocova.startservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "quizServlet", value = "/quizzes")
public class QuizServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Quizzes will be here!";
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        String name = request.getParameter("enteredName");
//
//        HttpSession session = request.getSession();
//        session.setAttribute("usersName", name);
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + name + "</h1>");
//        out.println("</body></html>");
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = "/quizzes.jsp";

        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}
