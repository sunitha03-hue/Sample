import java.util.Scanner;

public class nestedforloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        for (i = 1; i <= 3; ++i) {
            for (j = 1; j <= 3; ++j) {
                System.out.println(i + " " + j);
            }
        }
    }
}