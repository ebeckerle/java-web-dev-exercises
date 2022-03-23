package exercises.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;



    //GETTER's for the Instance Variables name, student ID, no. of Credits, & gpa
    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }

    //SETTER's for the Instance Variables name, student ID, no. of Credits, & gpa
    public void setName(String aName) {
        name = aName;
    }
    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

}