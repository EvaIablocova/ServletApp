package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Answer;
import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Java_Core {
    ArrayList<Question> arrayOfQuestions;

    public Java_Core(){
        arrayOfQuestions = new ArrayList<Question>();

        var answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Структура данных, хранящая примитивные типы данных", false));
        answers.add(new Answer(2, "Экземпляр класса", true));
        answers.add(new Answer(3, "Тип данных, не поддерживающий наследование", false));
        arrayOfQuestions.add(new Question(1, "Что такое объект в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "implements", true));
        answers.add(new Answer(2, "extends", false));
        answers.add(new Answer(3, "inherits", false));
        arrayOfQuestions.add(new Question(2, "Какое ключевое слово используется для реализации интерфейса в классе?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Поле класса", false));
        answers.add(new Answer(2, "Константа, используемая для хранения данных", false));
        answers.add(new Answer(3, "Функция, принадлежащая классу", true));
        arrayOfQuestions.add(new Question(3, "Что такое метод в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Способность объекта наследовать свойства другого объекта", false));
        answers.add(new Answer(2, "Сокрытие данных класса и предоставление доступа через методы", true));
        answers.add(new Answer(3, "Процесс преобразования объектов в поток байтов", false));
        arrayOfQuestions.add(new Question(4, "Что такое инкапсуляция в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Throwable", false));
        answers.add(new Answer(2, "Error", false));
        answers.add(new Answer(3, "Exception", true));
        arrayOfQuestions.add(new Question(5, "Какой тип исключения используется для обработки ошибок, возникающих в процессе выполнения программы?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "super()", true));
        answers.add(new Answer(2, "this()", false));
        answers.add(new Answer(3, "parent()", false));
        arrayOfQuestions.add(new Question(6, "Какой оператор используется для вызова конструктора суперкласса?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Способность метода возвращать значения разных типов", false));
        answers.add(new Answer(2, "Способность объекта принимать множество форм", true));
        answers.add(new Answer(3, "Способность класса иметь несколько конструкторов", false));
        arrayOfQuestions.add(new Question(7, "Что из нижеперечисленного является признаком полиморфизма в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "static", false));
        answers.add(new Answer(2, "abstract", false));
        answers.add(new Answer(3, "final", true));
        arrayOfQuestions.add(new Question(8, "Какое ключевое слово используется для предотвращения наследования класса?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Создание методов с одинаковыми именами, но разными параметрами", true));
        answers.add(new Answer(2, "Переопределение метода суперкласса в подклассе", false));
        answers.add(new Answer(3, "Определение метода, который не может быть изменен", false));
        arrayOfQuestions.add(new Question(9, "Что такое перегрузка методов в Java?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "static", true));
        answers.add(new Answer(2, "final", false));
        answers.add(new Answer(3, "abstract", false));
        arrayOfQuestions.add(new Question(10, "Какое ключевое слово используется для объявления статического метода?", answers));

    }
    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
