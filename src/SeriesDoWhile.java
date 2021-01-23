import java.util.Scanner;

public class SeriesDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        int i = 1;
        do{
            s=s+i;
            System.out.println(s);
            i++;
        }
        while (i <= 10);

        }
    }

