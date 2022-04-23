  import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static boolean problem(int t, int x[], int y[], int z[]) {
        if (t <= 0)
            throw new IllegalArgumentException("t must be positive integer");
        int sumX = 0, sumY = 0, sumZ = 0;
        while (t > 0) {
            sumX += x[t - 1];
            sumY += y[t - 1];
            sumZ += z[t - 1];
            t--;
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0)
            return true;
        else
            return false;

    }


}

