package com.javarush.quest.iablocova.BL.implementations;

import lombok.Getter;

@Getter
public class Answer {

    int number;
    String textOfAnswer;
    boolean fair;

    public Answer(){
        number =0;
        textOfAnswer = new String();
        fair = false;
    }

    public Answer(int numberFromDb, String textOfAnswerFromDb, boolean fairFromDb){
        number =numberFromDb;
        textOfAnswer = textOfAnswerFromDb;
        fair = fairFromDb;
    }

}
