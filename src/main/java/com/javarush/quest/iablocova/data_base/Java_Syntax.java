package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Syntax {

    ArrayList<Question> arrayOfQuestions;

    public Java_Syntax(){
        arrayOfQuestions = new ArrayList<Question>();

        HashMap<String, Boolean> answers;
        answers = new HashMap<>();
        answers.put("1", true);
        answers.put("2", false);
        answers.put("3", false);
        arrayOfQuestions.add(new Question("Размер boolean типа равен ... бит", answers));

        answers = new HashMap<>();
        answers.put("8", true);
        answers.put("4", false);
        answers.put("5", false);
        arrayOfQuestions.add(new Question("Размер byte типа равен ... бит", answers));
    }


    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
