package com.javarush.quest.iablocova.controllers;

import com.javarush.quest.iablocova.BL.implementations.Question;
import com.javarush.quest.iablocova.BL.implementations.Quiz;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "questionServlet", value = "/question")
public class QuestionServlet extends HttpServlet {

    public void init() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quizName = request.getParameter("quizName");
        HttpSession session = request.getSession();

        String action = request.getParameter("action");
        switch (action) {
            case "getFirstQuestion":
                int QuizIdByName = getQuizIdByName(session, quizName);
                session.setAttribute ("currentQuizIndexInArrayOfQuizzes", QuizIdByName);
                request.setAttribute("QuestionId", 0);
                break;
            case "prev":
                request = prevQuestion(request, response);
                break;
            case "next":
                request = nextQuestion(request, response);
                break;
            case "results":
                response.sendRedirect("ResultServlet");
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
                break;
        }


        String text = getCurrentTextOfQuestion(request, session);
        request.setAttribute("TextOfQuestion", text);

        String path = "/question.jsp";

        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    private String getCurrentTextOfQuestion(HttpServletRequest request, HttpSession session) throws ServletException, IOException{
        int currentQuizIndexInArrayOfQuizzes = (int) session.getAttribute("currentQuizIndexInArrayOfQuizzes");

        var arrayOfQuizzes = (ArrayList<Quiz>) session.getAttribute("arrayOfQuizzes");

        Quiz currentQuiz = arrayOfQuizzes.get(currentQuizIndexInArrayOfQuizzes);

        int QuestionId = (int) request.getAttribute("QuestionId");
        ArrayList <Question> arrayOfQuestions = currentQuiz.getArrayOfQuestions();
        Question currentQuestion = arrayOfQuestions.get(QuestionId);
        String textOfQuestion = currentQuestion.getQuestion();

        return textOfQuestion;
    }

    private HttpServletRequest prevQuestion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int QuestionId = (int) request.getAttribute("QuestionId");
        QuestionId--;
        request.setAttribute("QuestionId", QuestionId);

        return request;
    }
    private HttpServletRequest nextQuestion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int QuestionId = (int) request.getAttribute("QuestionId");
        QuestionId++;
        request.setAttribute("QuestionId", QuestionId);

        return request;
    }

    private int getQuizIdByName (HttpSession session, String quizName) throws ServletException, IOException{

        int index=0;
        ArrayList<Quiz> arrayOfQuizzes = (ArrayList<Quiz>) session.getAttribute("arrayOfQuizzes");

        for (int i = 0; i < arrayOfQuizzes.size(); i++) {
            String name = (arrayOfQuizzes.get(i)).getNameOfQuiz();
            if (name.equals(quizName)) {
                index = i;
                 break;
            }
        }

        return index;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "yes":
                yesAnswer(request, response);
                break;
            case "no":
                noAnswer(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
                break;
        }
    }

    private HttpServletRequest yesAnswer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int QuestionId = (int) request.getAttribute("QuestionId");
        QuestionId++;
        request.setAttribute("QuestionId", QuestionId);

        return request;
    }

    private HttpServletRequest noAnswer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int QuestionId = (int) request.getAttribute("QuestionId");
        QuestionId++;
        request.setAttribute("QuestionId", QuestionId);

        return request;
    }


    public void destroy() {
    }
}
