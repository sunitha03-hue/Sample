import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0,r;
        int n=in.nextInt();

        while (n>0) {
            r = n%10;
                    s=s+r;
                    n=n/10;
                    }
        System.out.println(s);
    }
}
