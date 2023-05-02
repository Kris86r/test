package com.kris.JavaBook.GUI.Serializable;

public class QuizCard {
    private String answer;
    private String question;

    public QuizCard(String a, String q) {
        answer = a;
        question = q;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
