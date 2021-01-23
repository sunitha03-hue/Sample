import java.util.Scanner;
public class StudentClass2 {
    int id;
    String name;
}
class TestStudent{
    public static void main(String args[])
    {
        StudentClass2 s1=new StudentClass2();
        StudentClass2 s2=new StudentClass2();
        s1.id=101;
        s1.name="Sonoo";
        s2.id=102;
        s2.name="Monoo";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }

}