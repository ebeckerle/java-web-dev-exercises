package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class MultichoiceQuestion extends Question{

    private ArrayList<String> answerOptions;
    private String rightAnswer;

    public MultichoiceQuestion (String question, ArrayList<String> aAnswerOptions, String aRightAnswer){
        super(question);
        answerOptions = aAnswerOptions;
        rightAnswer = aRightAnswer;
    }

    public ArrayList<String> getAnswerOptions(){
        return answerOptions;
    }

    public static void printAnswerOptions(MultichoiceQuestion aQuestion){
        ArrayList<String> answerOptions = new ArrayList<>();
        answerOptions = aQuestion.getAnswerOptions();
        for (String option : answerOptions){
            System.out.println(option);
        }
    }

    public static String gradeMultichoiceAnswer(MultichoiceQuestion aQuestion, String aResponse){
        String grade = "";
        String userResponse;
        userResponse = aResponse.toLowerCase();
        userResponse = userResponse.trim();
        ArrayList<String> answerOptions = new ArrayList<>();
        answerOptions = aQuestion.getAnswerOptions();
        for (String option : answerOptions){
            String answerOption;
            answerOption = option.toLowerCase();
            answerOption = answerOption.trim();
            if (answerOption.equals(userResponse)){
//                return "Correct";
                grade = "Correct";
                break;
            }else {
//                return "Incorrect";
                grade = "Incorrect: "+ userResponse + " : " + answerOption;
            }
        }
        return grade;
    }
}
