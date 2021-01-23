import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        int ch = in.nextInt();
        int a, b, c=0;
        a = in.nextInt();
        b = in.nextInt();

        switch (ch) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
                c = a * b;
                break;
            default:
                System.out.println("Enter correct choice: ");
        }
        System.out.println("The answer is:" + c);
    }
}
