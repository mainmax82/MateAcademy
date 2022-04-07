package CountDivisor;

import java.util.Random;

public class CountDivisor {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(100);
        System.out.print("The num " +x+ " has the following divisors --> " );
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i+ ", ");


            }
        }

    }
}
