package school;

public class Student {
    private double GPA = 4.0;
    private int numberOfCredits = 1;
    private String gradeLevel;

    public double getGPA() {
        return GPA;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public Student(double GPA, int numberOfCredits) {
        this.GPA = GPA;
        this.numberOfCredits = numberOfCredits;
    }



    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


}
