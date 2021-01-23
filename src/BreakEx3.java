import java.util.Scanner;

public class BreakEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        aa:
        for (i = 0; i <= 3; i++) {
            bb:
            for (j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
