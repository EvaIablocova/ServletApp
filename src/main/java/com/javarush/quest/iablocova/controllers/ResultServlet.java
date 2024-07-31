package com.javarush.quest.iablocova.controllers;

import java.io.IOException;
import java.util.ArrayList;

import com.javarush.quest.iablocova.BL.implementations.Quiz;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "ResultServlet", value = "/results")
public class ResultServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("QuestionId", (int)0);
        //ArrayList<Integer> arrayOfAnswers = (ArrayList<Integer>)session.getAttribute("arrayOfAnswers");

        // array of questions -- request scope
        // array of right answers -- request scope

        ArrayList<String> arrayOfAnswers = (ArrayList<String>)session.getAttribute("arrayOfAnswers");
        var arrayOfQuestions = (((ArrayList<Quiz>)session.getAttribute("arrayOfQuizzes")).get((int)session.getAttribute("currentQuizIndexInArrayOfQuizzes"))).getArrayOfQuestions();
        int countRightQuestions = 0;
        for (var question: arrayOfQuestions){
            if (question.getRightAnswer() == arrayOfAnswers.get(question.getNumber() - 1)){
                countRightQuestions ++;
            }
        }

        session.setAttribute("countRightQuestions", (int)countRightQuestions);

        String path = "/results.jsp";

        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

}

    