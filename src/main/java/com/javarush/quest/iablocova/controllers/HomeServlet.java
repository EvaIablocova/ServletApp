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

@WebServlet(name = "homeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Home page!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("usersName");

        String path = "/homePage.jsp";

        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);

        request.setAttribute("message", "This is the message from servlet!");
        request.setAttribute("greeting", "Hello world!");
        requestDispatcher.forward(request, response); // forward - конец ответа

        //варианты обработать запрос:
        //1 - обработать самим
        //2 - redirect - за ресурсами нашего сервера (п: запрос в гугл)
        //3 - forward
        //4 - include - перенаправление в пределах нашего сервера, но по окончанию работы этого ресурса
        //управление вернется к ресурсу, который его вызвал
    }

    public void destroy() {
    }
}
