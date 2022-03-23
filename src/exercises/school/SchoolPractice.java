package exercises.school;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student elizabeth = new Student();

        //SET Name, Student ID,  for student elizabeth
        elizabeth.setName("Elizabeth");
        elizabeth.setStudentId(248610);
        elizabeth.setNumberOfCredits(1);
        elizabeth.setGpa(4.0);

        System.out.println(elizabeth.getGpa());

    }
}
