import java.util.Scanner;

public class BreakWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        while(i<=10)
        {
            if(i==5)
            {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
