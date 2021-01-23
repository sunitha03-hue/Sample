import java.util.Scanner;

public class BreakEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        for(i=0;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
