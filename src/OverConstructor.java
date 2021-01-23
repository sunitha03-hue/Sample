class Student9{

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student9(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student9(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    /* getters and setters omitted */
void display()
{
    System.out.println(name  +  "  " + studentId + "  " + numberOfCredits + " " + gpa);
}
}

public class OverConstructor {
    public static void main(String args[]) {
        Student9 firstobj = new Student9("Jenay", 56, 89, 90);
        Student9 secondobj = new Student9("Shivani", 45);
        firstobj.display();
        secondobj.display();
    }
}
