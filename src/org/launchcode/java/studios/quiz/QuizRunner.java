package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        //create 3 question for my history trivia quiz
        TrueFalseQuestion question1 = new TrueFalseQuestion("'Yellow Journalism' was one of the causes of the Spanish American War- True or False?", true);

        ArrayList<String> question2AnswerOptions = new ArrayList<>();
        question2AnswerOptions.add("The Assassination of Archduke Franz Ferdinand");
        question2AnswerOptions.add("The Bombing of Pearl Harbor");
        question2AnswerOptions.add("Hitler's Invasion of Poland");
        MultichoiceQuestion question2 = new MultichoiceQuestion("What was the instigating event to the United States joining to fight on the Allies side in World War II?", question2AnswerOptions, "The Bombing of Pearl Harbor");

        ArrayList<String> question3AnswerOptions = new ArrayList<>();
        question3AnswerOptions.add("A. Ice Cream Cones");
        question3AnswerOptions.add("B. Meet me in St. Louis, the musical");
        question3AnswerOptions.add("C. One of the largest urban parks in the United States, Forest Park");
        question3AnswerOptions.add("D. Thin crust pizza with provel cheese cut into squares");
        ArrayList<String> question3RightAnswers = new ArrayList<>();
        question3RightAnswers.add("A. Ice Cream Cones");
        question3RightAnswers.add("B. Meet me in St. Louis, the musical");
        question3RightAnswers.add("C. One of the largest urban parks in the United States, Forest Park");
        CheckboxQuestion question3 = new CheckboxQuestion("At the 1904 World's Fair in Saint Louis many novel things were introduced, popularized or built, which of the following came about due to fair? Select all that apply.", question3AnswerOptions, question3RightAnswers);

        ArrayList<Question> arrayListOfQuestions = new ArrayList<>();
        arrayListOfQuestions.add(question1);
        arrayListOfQuestions.add(question2);
        arrayListOfQuestions.add(question3);

        Quiz historyQuiz = new Quiz("A Short History Quiz", arrayListOfQuestions);




        //interact with user
        System.out.println("Welcome to ");
        Quiz.printQuizTitle(historyQuiz);

        System.out.println("\n 1st Question:\n");
        Question.printQuestion(question1);
        Scanner input1 = new Scanner(System.in);
        String response1;
        response1 = input1.nextLine();
        String gradeQuestion1;
        gradeQuestion1 = TrueFalseQuestion.gradeTFAnswer(question1, response1);
        System.out.println("Grade question 1: "+gradeQuestion1);

        System.out.println("\n 2nd Question:\n");
        Question.printQuestion(question2);
        System.out.println("\n");
        MultichoiceQuestion.printAnswerOptions(question2);
        Scanner input2 = new Scanner(System.in);
        String response2;
        response2 = input2.nextLine();
        String gradeQuestion2;
        gradeQuestion2 = MultichoiceQuestion.gradeMultichoiceAnswer(question2, response2);
        System.out.println("Grade question 2: "+gradeQuestion2);

        System.out.println("\n 3rd Question:\n");
        Question.printQuestion(question3);
        System.out.println("\n");
        CheckboxQuestion.printAnswerOptions(question3);
        Scanner input3 = new Scanner(System.in);
        String response3;
        response3 = input3.nextLine();
        String gradeQuestion3;
        gradeQuestion3 = CheckboxQuestion.gradeCheckboxAnswer(question3, response3);
        System.out.println("Grade question 3: "+gradeQuestion3);

        HashMap<Question, String> historyQuizSetOfQuestionsWithResponses = new HashMap<>();
        historyQuizSetOfQuestionsWithResponses.put(question1, response1);
        historyQuizSetOfQuestionsWithResponses.put(question2, response2);
        historyQuizSetOfQuestionsWithResponses.put(question3, response3);

        historyQuiz.setQuestionsWithResponses(historyQuizSetOfQuestionsWithResponses);

        System.out.println("Your Score: "+ Quiz.gradeQuiz(historyQuiz)*100 + "%");


    }
}
