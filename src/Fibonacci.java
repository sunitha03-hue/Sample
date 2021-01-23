import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int c;
        for (i = 0; i <= 5; i++) {
        //    System.out.println(a);
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            }
    }
}
