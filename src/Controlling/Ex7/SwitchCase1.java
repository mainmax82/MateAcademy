package Controlling.Ex7;

import java.util.Random;

public class SwitchCase1 {
    public static void main(String[] args) {


        Random random = new Random();
        for (int i =0; i < 20 ;  i++){
            int dayOfWeek = random.nextInt(7) + 1;
            System.out.println(dayOfWeek);
            switch (dayOfWeek) {
                case 1:
                    System.out.println("SUNDAY");
                    break;
                case 2:
                    System.out.println("MONDAY");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                default:
                    System.out.println("Unknown day");
            }
        }

    }
}
