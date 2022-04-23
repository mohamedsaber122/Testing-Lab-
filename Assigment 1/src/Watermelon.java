import java.util.Scanner;

import static java.lang.System.out;

public class Watermelon
{

    public static boolean watermelonw(int b) {
        if ( b <= 0)
            throw new IllegalArgumentException("weight is postive!!");
        if (b % 2==0 && b != 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int b;
        Scanner input = new Scanner(System.in);
        b = input.nextInt();
        watermelonw(b);
    }
}