package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {

    private String title;
    private ArrayList<Question> questions;
    private HashMap<Question, String> questionsWithResponses;

    public Quiz(String aTitle, ArrayList<Question> aQuestions){
        title = aTitle;
        questions = aQuestions;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList<Question> getQuestions(){
        return questions;
    }

    public HashMap<Question, String> getQuestionsWithResponses(){
        return questionsWithResponses;
    }

    public void setQuestionsWithResponses(HashMap<Question, String> setOfQuestionsWithResponses){
        this.questionsWithResponses = setOfQuestionsWithResponses;
    }

    public static void printQuizTitle(Quiz aQuiz){
        System.out.println(aQuiz.getTitle());
    }

    public static void printQuizQuestions(Quiz aQuiz){

    }

    public static void printQuizAnswers(Quiz aQuiz){

    }

    public static int gradeQuiz(Quiz aQuiz){
        //setting up local variables to find and return the score (correct answers divided by total questions)
        int correctAnswers=0;
        int numberOfQuestions;
        numberOfQuestions = aQuiz.getQuestions().size();
        int grade = 0;

        //setting up local/reference variable arraylist of questions on the quiz to use in our for each loop
        ArrayList<Question> questions = new ArrayList<>();
        questions = aQuiz.getQuestions();

        //setting up local/reference variable Hashmap of questionsWithResponses
        HashMap<Question, String> questionsWithResponses = new HashMap<>();
        questionsWithResponses = aQuiz.getQuestionsWithResponses();

        for (Question eachQuestion :
             questions) {
            //if a True False Question correctly grade a truefalse question with method: gradeTFAnswer(TrueFalseQuestion aQuestion, String aResponse)
            if (eachQuestion.getClass() == TrueFalseQuestion.class){
                //set up reference variable user response as a standalone String
                String userResponse;
                userResponse = questionsWithResponses.get(eachQuestion);
                // instantiated a reference variable theQuestionGrade (a String), in order assign the return value of the gradeTFAnswer() method to a variable
                String theQuestionGrade;
                theQuestionGrade = TrueFalseQuestion.gradeTFAnswer((TrueFalseQuestion) eachQuestion, userResponse);
                if(theQuestionGrade.equals("Correct")){
                    correctAnswers++;
                }

            }

            //if a MultiChoice Question correctly grade a MultiChoice question with method: gradeMultichoiceAnswer(MultichoiceQuestion aQuestion, String aResponse)
            if (eachQuestion.getClass() == MultichoiceQuestion.class){
                //set up reference variable user response as a standalone String
                String userResponse;
                userResponse = questionsWithResponses.get(eachQuestion);
                // instantiated a reference variable theQuestionGrade (a String), in order assign the return value of the gradeTFAnswer() method to a variable
                String theQuestionGrade;
                theQuestionGrade = MultichoiceQuestion.gradeMultichoiceAnswer((MultichoiceQuestion) eachQuestion, userResponse);
                if(theQuestionGrade.equals("Correct")){
                    correctAnswers++;
                }

            }

            //if a Checkbox Question correctly grade a Checkbox question with method: gradeCheckboxAnswer(CheckboxQuestion aQuestion, String aResponse)
            if (eachQuestion.getClass() == CheckboxQuestion.class){
                //set up reference variable user response as a standalone String
                String userResponse;
                userResponse = questionsWithResponses.get(eachQuestion);
                // instantiated a reference variable theQuestionGrade (a String), in order assign the return value of the gradeCheckboxAnswer() method to a variable
                String theQuestionGrade;
                theQuestionGrade = CheckboxQuestion.gradeCheckboxAnswer((CheckboxQuestion) eachQuestion, userResponse);
                if(theQuestionGrade.equals("Correct")){
                    correctAnswers++;
                }

            }
        }

        grade = correctAnswers / numberOfQuestions;

        return grade;
    }
}
