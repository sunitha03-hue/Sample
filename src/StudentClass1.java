import java.util.Scanner;
public class StudentClass1 {
    int id;
    String name;
}
class TestStudent2{
    public static void main(String args[])
    {
        StudentClass1 s1=new StudentClass1();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+" "+s1.name);
    }

}
