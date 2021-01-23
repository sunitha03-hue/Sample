class Studen {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Studen(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Studen(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Studen(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    /* getters and setters omitted */

}
public class Student10 {
    public static void main(String[] args) {

        Studen S1 = new Studen("ABC", 1, 5, 9);
        Studen S2 = new Studen("DEF", 2);
        Studen S3 = new Studen("GHI");
        System.out.println(S3.studentInfo());
    }
}
