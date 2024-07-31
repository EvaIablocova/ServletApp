package com.javarush.quest.iablocova.BL.factory;

import com.javarush.quest.iablocova.BL.implementations.Quiz;
import com.javarush.quest.iablocova.data_base.*;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CreationFactory {

    ArrayList<Quiz> arrayOfQuizzes;

    /*Quiz JavaSyntaxQuiz;
    Quiz JavaCoreQuiz;
    Quiz JavaProfessionalQuiz;
    Quiz DataBaseQuiz;
    Quiz SpringQuiz;
*/
    public CreationFactory(){
        Quiz JavaSyntaxQuiz = new Quiz((new Java_Syntax()).getArrayOfQuestions(), "Java Syntax", "/imgs/Java_Syntax.png");
        Quiz JavaCoreQuiz = new Quiz((new Java_Core()).getArrayOfQuestions(), "Java Core", "/imgs/Java_Core.png");
        Quiz JavaProfessionalQuiz = new Quiz((new Java_Professional()).getArrayOfQuestions(), "Java Professional", "/imgs/Java_Professional.png");
        Quiz DataBaseQuiz = new Quiz((new Data_base()).getArrayOfQuestions(), "Data Base", "/imgs/Data_base.png");
        Quiz SpringQuiz = new Quiz((new Spring()).getArrayOfQuestions(), "Spring", "/imgs/Spring.png");

        arrayOfQuizzes = new ArrayList<>();
        arrayOfQuizzes.add(JavaSyntaxQuiz);
        arrayOfQuizzes.add(JavaCoreQuiz);
        arrayOfQuizzes.add(JavaProfessionalQuiz);
        arrayOfQuizzes.add(DataBaseQuiz);
        arrayOfQuizzes.add(SpringQuiz);
    }



}
