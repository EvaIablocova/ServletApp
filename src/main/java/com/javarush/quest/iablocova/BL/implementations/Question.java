package com.javarush.quest.iablocova.BL.implementations;

import com.javarush.quest.iablocova.BL.interfaces.IQuestion;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;


import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
public class Question implements IQuestion {

    int number;

    String question;

    /**
     * 1 param - option
     * 2 param - true - right answer; false - wrong answer
     */

    ArrayList<Answer> optionsOfAnswer;

    public Question(){
        number = 0;
        question = new String();
        optionsOfAnswer = new ArrayList<Answer>();
    }

    public Question(int numberFromDb, String questionFromDb, ArrayList<Answer> optionsOfAnswerFromDb){
        number = numberFromDb;
        question = questionFromDb;
        optionsOfAnswer = optionsOfAnswerFromDb;
    }

    public String getRightAnswer (Question curQuestion){
        String rightAnswer = null;
//        ArrayList<Quiz> arrayOfQuizzes = (ArrayList<Quiz>) session.getAttribute("arrayOfQuizzes");
//        Quiz currentQuiz = arrayOfQuizzes.get(currentQuizIndexInArrayOfQuizzes);
//        var curArrayOfQuestions = currentQuiz.getArrayOfQuestions();
//        Question curQuestion = curArrayOfQuestions.get(QuestionId);
        var curOptionsOfAnswer = curQuestion.getOptionsOfAnswer();

        for (var answer: curOptionsOfAnswer){
            if (answer.isFair()){
                rightAnswer = answer.getTextOfAnswer();
            }
        }

        return rightAnswer;
    }
}
