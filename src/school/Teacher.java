package school;

public class Teacher {
    private String firstname;
    private String lastname;
    private String subject;
    private int year ;

    public Teacher(String firstname, String lastname, String subject, int year)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.subject=subject;
        this.year=year;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
