import java.util.Scanner;

public class ChoiceVowel {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=in.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}
