package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    //CONSTRUCTOR
    public Course (String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    //GETTERS
    public String getTopic(){
        return topic;
    }
    public Teacher getInstructor() {
        return instructor;
    }
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return topic + " | taught by " + instructor.getFirstName() +":: \n" + enrolledStudents;
    }

//    public String printArrayList(ArrayList<Student> studentArrayList){
//        for (Student student : studentArrayList) {
//            //to string student.getName()
//
//        }
//    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared){
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) toBeCompared;
        if (theCourse.getTopic() == getTopic() && theCourse.getInstructor()==getInstructor()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

    public static void main(String[] args){
        //Instance Variables
        Teacher mrBudd = new Teacher("Kevin", "Budd", "Chemistry", 22);
        Student st1 = new Student("Kathy");
        Student st2 = new Student("George");
        Student st3 = new Student("Meriwether");
        Student st4 = new Student("Kayla");
        ArrayList<Student> chemistryStudentRoster = new ArrayList<Student>();
        chemistryStudentRoster.add(st1);
        chemistryStudentRoster.add(st2);
        chemistryStudentRoster.add(st3);
        chemistryStudentRoster.add(st4);
        Course chemistryAp = new Course("AP Chemistry", mrBudd, chemistryStudentRoster);

        //test toString method
        System.out.println("Test toString method: "+ chemistryAp.toString());

        //Instance Variables
        Teacher sisterEileen = new Teacher("Eileen", "Fuchs", "Chemistry", 33);
        Student st5 = new Student("Anna");
        Student st6 = new Student("Micah");
        Student st7 = new Student("Angie");
        Student st8 = new Student("Mark");
        ArrayList<Student> chemistry2StudentRoster = new ArrayList<Student>();
        chemistry2StudentRoster.add(st5);
        chemistry2StudentRoster.add(st6);
        chemistry2StudentRoster.add(st7);
        chemistry2StudentRoster.add(st8);
        Course chemistry2 = new Course("Advanced Chemistry", sisterEileen, chemistry2StudentRoster);

        // test equals method
        System.out.println(chemistryAp.equals(chemistry2));
    }

}
