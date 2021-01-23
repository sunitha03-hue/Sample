import java.util.Scanner;

public class ContinueWhileEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        while(i<=10)
        {
            if(i==5)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
