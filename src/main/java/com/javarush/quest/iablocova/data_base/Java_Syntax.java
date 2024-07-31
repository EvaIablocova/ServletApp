package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Answer;
import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Syntax {

    ArrayList<Question> arrayOfQuestions;

    public Java_Syntax(){
        arrayOfQuestions = new ArrayList<Question>();

        var answers = new ArrayList<Answer>();
        answers.add(new Answer(1,"class", true));
        answers.add(new Answer(2,"new", false));
        answers.add(new Answer(3,"public", false));
        arrayOfQuestions.add(new Question(1, "Какое ключевое слово используется для создания класса в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "double", false));
        answers.add(new Answer(2, "int", true));
        answers.add(new Answer(3, "float", false));
        arrayOfQuestions.add(new Question(2, "Какой тип данных используется для хранения целого числа в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "#", false));
        answers.add(new Answer(2, "//", true));
        answers.add(new Answer(3, "/*", false));
        arrayOfQuestions.add(new Question(3, "Какой символ используется для обозначения комментария на одну строку в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "start()", false));
        answers.add(new Answer(2, "main()", true));
        answers.add(new Answer(3, "init()", false));
        arrayOfQuestions.add(new Question(4, "Какой метод является точкой входа в программу на Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "ClassName object = new ClassName();", true));
        answers.add(new Answer(2, "ClassName object = ClassName();", false));
        answers.add(new Answer(3, "object = new ClassName();", false));
        arrayOfQuestions.add(new Question(5, "Что из нижеперечисленного является правильным способом создания объекта класса в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "=", false));
        answers.add(new Answer(2, "==", true));
        answers.add(new Answer(3, "===", false));
        arrayOfQuestions.add(new Question(6, "Какой оператор используется для сравнения двух значений в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "constant", false));
        answers.add(new Answer(2, "final", true));
        answers.add(new Answer(3, "const", false));
        arrayOfQuestions.add(new Question(7, "Какое ключевое слово используется для объявления константы в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "inherits", false));
        answers.add(new Answer(2, "implements", false));
        answers.add(new Answer(3, "extends", true));
        arrayOfQuestions.add(new Question(8, "Какое ключевое слово используется для наследования класса?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "int[] array = new int[5];", true));
        answers.add(new Answer(2, "array int[5];", false));
        answers.add(new Answer(3, "int array[] = new int[5];", false));
        arrayOfQuestions.add(new Question(9, "Что из нижеперечисленного является правильным синтаксисом для создания массива целых чисел в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, ";", true));
        answers.add(new Answer(2, ":", false));
        answers.add(new Answer(3, ",", false));
        arrayOfQuestions.add(new Question(10, "Какой символ используется для обозначения конца строки в Java?", answers));



    }


    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
