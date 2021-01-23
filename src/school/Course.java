package school;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Course {

    ArrayList<String> courseName = new ArrayList<String>();
    private int score;
    private String grade;
    Student st;
    Teacher te;

    public ArrayList<String> getCourseName() {
        return courseName;
    }

    public void setCourseName(ArrayList<String> courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        String s=" ";

        if (st.getNumberOfCredits() >= 90) {
            s="Senior";
        } else if (st.getNumberOfCredits() < 90 && st.getNumberOfCredits() >= 60) {
            s="Junior";
        } else if (st.getNumberOfCredits() < 60 && st.getNumberOfCredits() >= 30) {
            s="Sophomore";
        } else if (st.getNumberOfCredits() < 30) {
            s="Freshman";
        }
        return s;

    }
    public void addGrade(int courseCredits, double grade) {
        double gpa = grade/courseCredits;
        System.out.println(gpa);
        int score=(int)gpa*courseCredits;
        System.out.println(score);

    }



    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Course(ArrayList<String> courseName, int score, String grade, Student st, Teacher te){
        this.courseName=courseName;
        this.score=score;
        this.grade=grade;
        this.st= st;
        this.te=te;
    }
    void display() {
        System.out.println(te.getFirstname() + te.getLastname() + te.getSubject() + te.getYear());
        for (String cname : courseName) {
            System.out.println(cname);

        }

        System.out.println(grade + " " + score + " " + st.getGPA() + " " + st.getNumberOfCredits());
    }

    public static void main(String[] args)
    {
        ArrayList<String> courseware = new ArrayList<String>();
        courseware.add("English");
        courseware.add("Tamil");
        courseware.add("Math");
        Student st1 = new Student(9.0, 30);
        Teacher tch1 = new Teacher("Sunitha", "Iyadurai", "Science", 2000);
        Course cr = new Course(courseware, 30, "c", st1, tch1);
cr.display();
    cr.addGrade(st1.getNumberOfCredits(), cr.getScore());
    String s=cr.getGrade();
System.out.println(s);
    }

}
