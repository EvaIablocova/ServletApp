package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Professional {
    ArrayList<Question> arrayOfQuestions;

    public Java_Professional(){
        arrayOfQuestions = new ArrayList<Question>();

        HashMap<String, Boolean> answers;
        answers = new HashMap<>();
        answers.put("1", true);
        answers.put("2", false);
        answers.put("3", false);
        arrayOfQuestions.add(new Question("Java_Professional 1", answers));

        answers = new HashMap<>();
        answers.put("8", true);
        answers.put("4", false);
        answers.put("5", false);
        arrayOfQuestions.add(new Question("Java_Professional 2", answers));
    }
    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
