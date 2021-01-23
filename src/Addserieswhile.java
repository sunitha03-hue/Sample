import java.util.Scanner;

public class Addserieswhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        int i = 1;
        while (i <= 5) {
            s = s + i;
            i++;
        }
        System.out.println(s);
    }
}