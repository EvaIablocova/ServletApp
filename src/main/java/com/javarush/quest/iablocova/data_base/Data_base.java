package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Answer;
import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data_base {
    ArrayList<Question> arrayOfQuestions;

    public Data_base(){
        arrayOfQuestions = new ArrayList<Question>();

        var answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Поле, которое может содержать дублирующиеся значения", false));
        answers.add(new Answer(2, "Уникальный идентификатор записи в таблице", true));
        answers.add(new Answer(3, "Поле, предназначенное для хранения больших данных", false));
        arrayOfQuestions.add(new Question(1, "Что такое первичный ключ в базе данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "HTML", false));
        answers.add(new Answer(2, "SQL", true));
        answers.add(new Answer(3, "XML", false));
        arrayOfQuestions.add(new Question(2, "Какой язык используется для управления и манипуляции данными в реляционных базах данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Поле, которое идентифицирует уникальную запись в другой таблице", true));
        answers.add(new Answer(2, "Поле, содержащее только числовые данные", false));
        answers.add(new Answer(3, "Специальный тип данных для хранения изображений", false));
        arrayOfQuestions.add(new Question(3, "Что такое внешний ключ в базе данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Удаление всех записей из таблицы", false));
        answers.add(new Answer(2, "Объединение строк из двух или более таблиц на основе связанных между ними столбцов", true));
        answers.add(new Answer(3, "Создание новой таблицы в базе данных", false));
        arrayOfQuestions.add(new Question(4, "Что означает операция JOIN в SQL?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Процесс увеличения дублирования данных", false));
        answers.add(new Answer(2, "Процесс минимизации избыточности данных и зависимостей", true));
        answers.add(new Answer(3, "Метод улучшения производительности запросов", false));
        arrayOfQuestions.add(new Question(5, "Что такое нормализация в контексте баз данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "FETCH", false));
        answers.add(new Answer(2, "GET", false));
        answers.add(new Answer(3, "SELECT", true));
        arrayOfQuestions.add(new Question(6, "Какое SQL-выражение используется для извлечения данных из базы данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "ADD", false));
        answers.add(new Answer(2, "INSERT INTO", true));
        answers.add(new Answer(3, "UPDATE", false));
        arrayOfQuestions.add(new Question(7, "Какое SQL-выражение используется для добавления новой записи в таблицу?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Процесс создания резервных копий данных", false));
        answers.add(new Answer(2, "Группа SQL-операций, которые выполняются как единое целое", true));
        answers.add(new Answer(3, "Метод увеличения скорости выполнения запросов", false));
        arrayOfQuestions.add(new Question(8, "Что такое транзакция в базе данных?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "ALTER", false));
        answers.add(new Answer(2, "UPDATE", true));
        answers.add(new Answer(3, "MODIFY", false));
        arrayOfQuestions.add(new Question(9, "Какое выражение SQL используется для изменения существующих данных в таблице?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Процесс удаления лишних данных из базы", false));
        answers.add(new Answer(2, "Процесс добавления избыточных данных для ускорения выполнения запросов", true));
        answers.add(new Answer(3, "Метод оптимизации структуры базы данных", false));
        arrayOfQuestions.add(new Question(10, "Что означает термин 'денормализация' в базах данных?", answers));

    }

    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
