package com.javarush.quest.iablocova.BL.implementations;

import com.javarush.quest.iablocova.BL.interfaces.IQuestion;

import java.util.HashMap;

public class Question implements IQuestion {

    String question;

    /**
     * 1 param - option
     * 2 param - true - right answer; false - wrong answer
     */
    HashMap<String, Boolean> optionsOfAnswer;

    public Question(){
        question = new String();
        optionsOfAnswer = new HashMap<String, Boolean>();
    }

    public Question(String questionFromDb, HashMap<String, Boolean> optionsOfAnswerFromDb){
        question = questionFromDb;
        optionsOfAnswer = optionsOfAnswerFromDb;
    }
}
