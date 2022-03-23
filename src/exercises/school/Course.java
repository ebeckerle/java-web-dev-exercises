package exercises.school;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Course {

    private HashMap <String, Double> allStudentsClassGpa = new HashMap<>();
    private ArrayList <String> classRoster = new ArrayList<>();
    private double averageGpaForClass;
    private Scanner teacherInput;

    //Simple Get & Set for Class Roster
    public ArrayList<String> getClassRoster(){
        return classRoster;
    }
    public void setClassRoster(ArrayList<String> aClassRoster){
        this.classRoster = aClassRoster;
    }

    //ask teacher for student names to set a class roster;
    public ArrayList<String> compileClassRoster(){
        String newStudent;
        ArrayList <String> classRoster = new ArrayList<>();
        Scanner teacherInput = new Scanner(System.in);
        System.out.println("Please enter each student (ENTER to finish):");

        // Get student names
        do {
            newStudent = teacherInput.nextLine();

            if (!newStudent.equals("")) {
                classRoster.add(newStudent);
            }

        } while(!newStudent.equals(""));

        System.out.println("Your Class Roster is Complete.");

        return classRoster;
    }

    //    Input GPAs for the course for each Student
    public HashMap <String, Double> promptForGpas(ArrayList <String> aClassRoster){
        HashMap <String, Double> studentGpaHashMap = new HashMap<>();
        ArrayList<String> classRoster = new ArrayList<>();
        classRoster = aClassRoster;
        Scanner teacherInput = new Scanner(System.in);

        for (String student : classRoster) {
            System.out.println("Please enter a gpa for " + student +":");
            double gpa;
            gpa = teacherInput.nextDouble();
            studentGpaHashMap.put(student, gpa);
        }
        return studentGpaHashMap;
    }


    //Calculate Average GPA for the Course
    public double calcAverageGpaForClass(HashMap <String, Double> aAllStudentsClassGpa) {
        //using a loop to calculate the average GPA for the class
        double averageGpaForClass = 0;
        double sumOfGpas = 0;
        int totalStudents = 0;
        HashMap <String, Double> allStudentsClassGpa = new HashMap<>();
        allStudentsClassGpa = aAllStudentsClassGpa;

        for (Map.Entry<String, Double> student : allStudentsClassGpa.entrySet()) {
            sumOfGpas += student.getValue();
            totalStudents++;
        }
        averageGpaForClass = sumOfGpas / totalStudents;
        return averageGpaForClass;
    }
}
