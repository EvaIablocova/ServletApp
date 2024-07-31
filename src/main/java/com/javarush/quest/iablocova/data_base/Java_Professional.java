package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Answer;
import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Professional {
    ArrayList<Question> arrayOfQuestions;

    public Java_Professional(){
        arrayOfQuestions = new ArrayList<Question>();

        var answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Программное обеспечение для создания графического интерфейса пользователя", false));
        answers.add(new Answer(2, "Платформа для выполнения Java-программ", true));
        answers.add(new Answer(3, "Система для управления базами данных", false));
        arrayOfQuestions.add(new Question(1, "Что такое Java Virtual Machine (JVM)?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "final", true));
        answers.add(new Answer(2, "immutable", false));
        answers.add(new Answer(3, "constant", false));
        arrayOfQuestions.add(new Question(2, "Какое ключевое слово используется для создания неизменяемого класса в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Возможность иметь поля", false));
        answers.add(new Answer(2, "Возможность иметь статические методы и методы по умолчанию", true));
        answers.add(new Answer(3, "Возможность наследовать несколько классов", false));
        arrayOfQuestions.add(new Question(3, "Что из нижеперечисленного является характеристикой интерфейса в Java 8?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "synchronized", true));
        answers.add(new Answer(2, "locked", false));
        answers.add(new Answer(3, "threadsafe", false));
        arrayOfQuestions.add(new Question(4, "Какое ключевое слово используется для синхронизации методов в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Последовательная структура, использующая массивы", false));
        answers.add(new Answer(2, "Хранит данные в виде пар 'ключ-значение' и не поддерживает порядок элементов", true));
        answers.add(new Answer(3, "Обеспечивает сортировку элементов по возрастанию ключей", false));
        arrayOfQuestions.add(new Question(5, "Какой из перечисленных вариантов правильно описывает структуру HashMap в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Механизм для создания методов и классов с общими типами", true));
        answers.add(new Answer(2, "Способ создания неизменяемых объектов", false));
        answers.add(new Answer(3, "Тип данных для представления больших чисел", false));
        arrayOfQuestions.add(new Question(6, "Что такое Generics в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "NullPointerException", true));
        answers.add(new Answer(2, "IndexOutOfBoundsException", false));
        answers.add(new Answer(3, "IllegalArgumentException", false));
        arrayOfQuestions.add(new Question(7, "Какое исключение выбрасывается, когда попытка вызвать метод на объекте, не указывающем на какую-либо область памяти?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Механизм для выполнения асинхронных операций", false));
        answers.add(new Answer(2, "API для обработки последовательностей данных", true));
        answers.add(new Answer(3, "Механизм для управления потоками ввода-вывода", false));
        arrayOfQuestions.add(new Question(8, "Что такое Stream API в Java 8?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Runnable", false));
        answers.add(new Answer(2, "Comparable", false));
        answers.add(new Answer(3, "Cloneable", true));
        arrayOfQuestions.add(new Question(9, "Какой из следующих интерфейсов не является функциональным интерфейсом в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "finally", true));
        answers.add(new Answer(2, "end", false));
        answers.add(new Answer(3, "exit", false));
        arrayOfQuestions.add(new Question(10, "Какое ключевое слово используется для создания блоков кода, которые обязательно выполняются после try-catch?", answers));

    }
    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
