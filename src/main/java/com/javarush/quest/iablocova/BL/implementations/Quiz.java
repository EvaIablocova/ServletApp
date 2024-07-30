package com.javarush.quest.iablocova.BL.implementations;

import com.javarush.quest.iablocova.BL.interfaces.IQuiz;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Getter
public class Quiz implements IQuiz {

    String nameOfQuiz;

    ArrayList <Question> arrayOfQuestions;

    public Quiz (){
        nameOfQuiz = new String();
        arrayOfQuestions = new ArrayList <Question>();
    }

    public Quiz (ArrayList <Question> arrayOfQuestionsFromDb, String nameFromDb){
        nameOfQuiz = nameFromDb;
        arrayOfQuestions = arrayOfQuestionsFromDb;
    }

//    public String getTextOfQuestionById (int id, int currentQuizIndexInArrayOfQuizzes){
//
//
//        return new String();
//    }

    private int getQuizIdByName (HttpSession session, String quizName) throws ServletException, IOException {

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

}
