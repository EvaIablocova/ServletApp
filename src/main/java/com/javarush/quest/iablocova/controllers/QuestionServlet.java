package com.javarush.quest.iablocova.controllers;

import com.javarush.quest.iablocova.BL.implementations.Answer;
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
import java.util.*;

@WebServlet(name = "questionServlet", value = "/question")
public class QuestionServlet extends HttpServlet {

    public void init() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quizName = request.getParameter("quizName");
        HttpSession session = request.getSession();

        String action = request.getParameter("action");
        int QuestionId =0;
        switch (action) {
            case "getFirstQuestion":
                int QuizIdByName = getQuizIdByName(session, quizName);
                session.setAttribute ("currentQuizIndexInArrayOfQuizzes", QuizIdByName);
                session.setAttribute("QuestionId", (int)0);

                int len1 = getCurrentLengthOfQuiz(session, QuizIdByName);
                ArrayList<String> arrayOfAnswers = new ArrayList<>(len1);
                for (int i = 0; i < len1; i++) {
                    arrayOfAnswers.add("not selected yet"); // Добавляем элемент со значением 0
                }

                session.setAttribute("arrayOfAnswers", arrayOfAnswers);
                break;
            case "prev":
                QuestionId = prevQuestion(session);
                session.setAttribute("QuestionId", QuestionId);
                break;
            case "next":
                ArrayList<String> arrayOfAnswers1 = (ArrayList<String>) session.getAttribute("arrayOfAnswers");
                QuestionId = nextQuestion(session, arrayOfAnswers1.size());
                session.setAttribute("QuestionId", QuestionId);
                break;
            case "currentPage":
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
                break;
        }


        String path = null;
        int index = (int) session.getAttribute("QuestionId");

        if (index == -1){
            path = "/results.jsp";
        } else if (index == -2){
            path = "/quizzes.jsp";
        } else {
            String text = getCurrentTextOfQuestion(request, session);
            request.setAttribute("TextOfQuestion", text);

            ArrayList<Quiz> arrayOfQuizzes = (ArrayList<Quiz>)session.getAttribute("arrayOfQuizzes");
            Quiz curQuiz = arrayOfQuizzes.get((int)session.getAttribute("currentQuizIndexInArrayOfQuizzes"));
            ArrayList <Question> arrayOfQuestions = curQuiz.getArrayOfQuestions();
            List<Answer> optionsOfAnswer = arrayOfQuestions.get(index).getOptionsOfAnswer();

                request.setAttribute("Option1", (optionsOfAnswer.get(0)).getTextOfAnswer());
                request.setAttribute("Option2", (optionsOfAnswer.get(1)).getTextOfAnswer());
                request.setAttribute("Option3", (optionsOfAnswer.get(2)).getTextOfAnswer());


            path = "/question.jsp";
        }

        ServletContext servletContext = request.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    private int getCurrentLengthOfQuiz(HttpSession session, int QuizIdByName){
        ArrayList<Quiz> arrayOfQuizzes = (ArrayList<Quiz>) session.getAttribute("arrayOfQuizzes");
        Quiz curQuiz = arrayOfQuizzes.get(QuizIdByName);
        int lengthOfQuiz = curQuiz.getArrayOfQuestions().size();
        return lengthOfQuiz;
    }
    private String getCurrentTextOfQuestion(HttpServletRequest request, HttpSession session) throws ServletException, IOException{
        int currentQuizIndexInArrayOfQuizzes = (int) session.getAttribute("currentQuizIndexInArrayOfQuizzes");

        var arrayOfQuizzes = (ArrayList<Quiz>) session.getAttribute("arrayOfQuizzes");

        Quiz currentQuiz = arrayOfQuizzes.get(currentQuizIndexInArrayOfQuizzes);

        int QuestionId = (int) session.getAttribute("QuestionId");
        ArrayList <Question> arrayOfQuestions = currentQuiz.getArrayOfQuestions();
        Question currentQuestion = arrayOfQuestions.get(QuestionId);
        String textOfQuestion = currentQuestion.getQuestion();

        return textOfQuestion;
    }

    private int prevQuestion(HttpSession session) throws ServletException, IOException{
        int QuestionId = (int)session.getAttribute("QuestionId");

        if(QuestionId > 0){
            QuestionId--;
        }
        else {
            QuestionId = -2;
        }

        return QuestionId;
    }
    private int nextQuestion(HttpSession session, int length) throws ServletException, IOException{

//        ArrayList<Integer> arrayOfAnswers = (ArrayList<Integer>) session.getAttribute("arrayOfAnswers");
        int QuestionId = (int)session.getAttribute("QuestionId");

         if(QuestionId < length-1){
             QuestionId++;
         }
         else {
             QuestionId = -1;
         }

        return QuestionId;
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
        HttpSession session = request.getSession();
        ArrayList<String> arrayOfAnswers = (ArrayList<String>)session.getAttribute("arrayOfAnswers");

        String option = request.getParameter("option");
        int QuestionId = (int) session.getAttribute("QuestionId");

        int currentQuizIndexInArrayOfQuizzes = (int) session.getAttribute ("currentQuizIndexInArrayOfQuizzes");

        ArrayList<Quiz> arrayOfQuizzes = (ArrayList<Quiz>)session.getAttribute("arrayOfQuizzes");

        var currentQuiz = arrayOfQuizzes.get(currentQuizIndexInArrayOfQuizzes);
        var currentArrayOfQuestions = currentQuiz.getArrayOfQuestions();
        Question currentQuestion = currentArrayOfQuestions.get(QuestionId);

        var optionsOfAnswer = currentQuestion.getOptionsOfAnswer();

        switch (option) {
            case "option1":
                arrayOfAnswers.set(QuestionId, (optionsOfAnswer.get(0).getTextOfAnswer()));
                break;
            case "option2":
                arrayOfAnswers.set(QuestionId, (optionsOfAnswer.get(1).getTextOfAnswer()));
                    break;
                case "option3":
                    arrayOfAnswers.set(QuestionId, (optionsOfAnswer.get(2).getTextOfAnswer()));
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
                break;
        }

        request.setAttribute("action", "currentPage");
        doGet(request, response);
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
