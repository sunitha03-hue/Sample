import java.util.Scanner;

public class ContinueEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        for(i=0;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
