import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

