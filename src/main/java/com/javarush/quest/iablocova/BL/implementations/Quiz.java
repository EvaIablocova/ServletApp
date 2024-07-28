package com.javarush.quest.iablocova.BL.implementations;

import com.javarush.quest.iablocova.BL.interfaces.IQuiz;
import lombok.Getter;

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

}
