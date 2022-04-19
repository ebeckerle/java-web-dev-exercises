package org.launchcode.java.studios.quiz;

public class Question {

    private String question;

    public Question(String aQuestion) {
        question = aQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public static void printQuestion(Question aQuestion){
        System.out.println(aQuestion.getQuestion());
    }
}
