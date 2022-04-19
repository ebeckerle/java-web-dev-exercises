package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class CheckboxQuestion extends Question{

    private ArrayList<String> answerOptions;
    private ArrayList<String> rightAnswers;

    public CheckboxQuestion(String question, ArrayList<String> aAnswerOptions, ArrayList<String> aRightAnswers) {
        super(question);
        answerOptions = aAnswerOptions;
        rightAnswers = aRightAnswers;
    }

    public ArrayList<String> getAnswerOptions(){
        return answerOptions;
    }

    public ArrayList<String> getRightAnswers(){
        return rightAnswers;
    }

    public static void printAnswerOptions(CheckboxQuestion aQuestion){
        ArrayList<String> answerOptions = new ArrayList<>();
        answerOptions = aQuestion.getAnswerOptions();

        for (String option :
             answerOptions) {
            System.out.println(option);
        }

    }

    public static String gradeCheckboxAnswer(CheckboxQuestion aQuestion, String aResponse){
        String totalGrade = "";
        ArrayList<String> grade = new ArrayList<>();

        String response = aResponse;

        ArrayList<String> rightAnswers = new ArrayList<>();
        rightAnswers = aQuestion.getRightAnswers();

        for (String answer:
             rightAnswers) {
            char answerCode = 'z';
            answerCode = answer.charAt(0);
            if (response.contains(""+ answerCode)){
                grade.add("Correct: "+answerCode);
            }else{
//                grade.add("Incorrect: "+answerCode);
            }
        }

        if (rightAnswers.size() == grade.size()){
            totalGrade =  "Correct";
        }
//        for (String gr:
//             grade) {
//            System.out.println(gr);
//        }
        return totalGrade;
    }
}
