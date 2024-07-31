package com.javarush.quest.iablocova.data_base;

import com.javarush.quest.iablocova.BL.implementations.Answer;
import com.javarush.quest.iablocova.BL.implementations.Question;

import java.util.ArrayList;
import java.util.HashMap;

public class Spring {
    ArrayList<Question> arrayOfQuestions;

    public Spring(){
        arrayOfQuestions = new ArrayList<Question>();

        var answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Фреймворк для создания графических интерфейсов", false));
        answers.add(new Answer(2, "Фреймворк для разработки корпоративных приложений на Java", true));
        answers.add(new Answer(3, "Система управления базами данных", false));
        arrayOfQuestions.add(new Question(1, "Что такое Spring Framework?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Он управляет созданием объектов и их зависимостей", true));
        answers.add(new Answer(2, "Он используется только для управления базами данных", false));
        answers.add(new Answer(3, "Он управляет подключением внешних библиотек", false));
        arrayOfQuestions.add(new Question(2, "Какое из перечисленных утверждений о Spring IoC (Inversion of Control) контейнере верное?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "spring-config.xml", false));
        answers.add(new Answer(2, "applicationContext.xml", true));
        answers.add(new Answer(3, "web.xml", false));
        arrayOfQuestions.add(new Question(3, "Какой файл конфигурации по умолчанию используется в Spring для настройки приложения?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Метод для управления сессиями", false));
        answers.add(new Answer(2, "Объект, который управляется Spring IoC контейнером", true));
        answers.add(new Answer(3, "Класс для работы с базами данных", false));
        arrayOfQuestions.add(new Question(4, "Что такое Spring Bean?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "@Inject", false));
        answers.add(new Answer(2, "@Autowired", true));
        answers.add(new Answer(3, "@Resource", false));
        arrayOfQuestions.add(new Question(5, "Какое из следующих ключевых слов используется для автоматического связывания компонентов в Spring?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Инструмент для автоматического создания документации", false));
        answers.add(new Answer(2, "Набор инструментов для упрощения настройки и запуска приложений Spring", true));
        answers.add(new Answer(3, "Библиотека для работы с многопоточностью", false));
        arrayOfQuestions.add(new Question(6, "Что такое Spring Boot?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Парадигма программирования, которая позволяет разделить функциональные возможности программы на отдельные части", true));
        answers.add(new Answer(2, "Способ работы с многопоточностью в Spring", false));
        answers.add(new Answer(3, "Подход к управлению транзакциями в Spring", false));
        arrayOfQuestions.add(new Question(7, "Что такое Spring AOP (Aspect-Oriented Programming)?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "@Controller", false));
        answers.add(new Answer(2, "@Service", true));
        answers.add(new Answer(3, "@Repository", false));
        arrayOfQuestions.add(new Question(8, "Какое из следующих аннотаций используется для указания, что класс является компонентом сервиса в Spring?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Расширение для работы с JSON в Spring", false));
        answers.add(new Answer(2, "Подмодуль Spring, упрощающий доступ к данным с использованием JPA (Java Persistence API)", true));
        answers.add(new Answer(3, "Библиотека для управления кэшированием данных", false));
        arrayOfQuestions.add(new Question(9, "Что такое Spring Data JPA?", answers));

        answers = new ArrayList<Answer>();
        answers.add(new Answer(1, "Аннотация для включения логирования в приложении", false));
        answers.add(new Answer(2, "Аннотация, которая указывает, что метод или класс должны быть выполнены в рамках транзакции", true));
        answers.add(new Answer(3, "Аннотация для автоматического связывания компонентов", false));
        arrayOfQuestions.add(new Question(10, "Какое из следующих утверждений описывает аннотацию @Transactional в Spring?", answers));

    }

    public ArrayList<Question> getArrayOfQuestions() {
        return arrayOfQuestions;
    }
}
