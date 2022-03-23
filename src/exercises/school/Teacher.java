package exercises.school;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getlastName() {
        return this.lastName;
    }
    public String getSubject() {
        return this.subject;
    }
    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

    //Setters
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }
    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
