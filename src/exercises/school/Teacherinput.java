package exercises.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Teacherinput {

    private static Course chemistry = new Course();

    public static void main(String[] args) {

        //teacher inputs the student's names for the class roster
        ArrayList <String> chemistryClassRoster = new ArrayList<>();
        chemistryClassRoster = chemistry.compileClassRoster();
        System.out.println(chemistryClassRoster);

        //program lists students one by one for the teacher to input their GPAs
        HashMap <String, Double> chemistryClassesGpas = new HashMap<>();
        chemistryClassesGpas = chemistry.promptForGpas(chemistryClassRoster);
        System.out.println(chemistryClassesGpas);

        //calculate average GPA for the course
        double averageGpa = 0;
        averageGpa = chemistry.calcAverageGpaForClass(chemistryClassesGpas);
        System.out.println(averageGpa + " is the average GPA for the Chemistry Class.");
    }
}
