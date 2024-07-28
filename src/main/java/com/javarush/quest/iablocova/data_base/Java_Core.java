package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Core {
    ArrayList<Question> arrayOfQuestions;

    public Java_Core(){
        arrayOfQuestions = new ArrayList<Question>();

        HashMap<String, Boolean> answers;
        answers = new HashMap<>();
        answers.put("1", true);
        answers.put("2", false);
        arrayOfQuestions.add(new Question("Java_Core 1", answers));

        answers = new HashMap<>();
        answers.put("8", true);
        answers.put("4", false);
        arrayOfQuestions.add(new Question("Java_Core 2", answers));
    }
    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
