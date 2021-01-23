import java.util.Scanner;

public class nestedforlooptriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        for (i = 1; i <= 3; i++) {
         //  System.out.println(" ");
            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }
    }

