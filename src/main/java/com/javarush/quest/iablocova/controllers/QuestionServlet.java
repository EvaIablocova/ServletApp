package com.javarush.quest.iablocova.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "questionServlet", value = "/question")
public class QuestionServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quizName = request.getParameter("quizName");
        request.setAttribute("quizName", quizName);


        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("usersName");


        //1 - логика получения вопроса
/*        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);*/
//        request.setAttribute("message", "This is the message from servlet!");
//        request.setAttribute("greeting", "Hello world!");
//        requestDispatcher.forward(request, response); // forward - конец ответа
        // 2 - устанавиливаем в атрибуты запроса
        //3 - отправляем этот запрос на отображение

        String path = "/question.jsp";

        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}
