import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: " );
       // c = input.;
        char c = in.next().charAt(0);
        //int c = in.nextInt();
        if (c == 'a') {
            System.out.println("Vowel");}
                else if (c == 'e') {
                System.out.println("Vowel");
            }
        else {
            System.out.println("Not a vowel");
        }
    }
}
