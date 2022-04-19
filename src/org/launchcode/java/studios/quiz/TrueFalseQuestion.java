package org.launchcode.java.studios.quiz;

public class TrueFalseQuestion extends Question{

    private boolean answer;

    public TrueFalseQuestion(String question, boolean aAnswer) {
        super(question);
        answer = aAnswer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public static void printTFQuestion(TrueFalseQuestion aQuestion){

        System.out.println(aQuestion.getQuestion());
    }

    public static void printTFAnswer(TrueFalseQuestion aQuestion){
        System.out.println();
    }

    public static String gradeTFAnswer(TrueFalseQuestion aQuestion, String aResponse){
        String userResponse;
        userResponse = aResponse.toLowerCase();
        String rightAnswer = String.valueOf(aQuestion.getAnswer());
        rightAnswer.toLowerCase();
        if (userResponse.equals(rightAnswer)){
            return "Correct";
        }else {
            return "Incorrect";
        }

    }


}
