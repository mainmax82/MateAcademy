package Mate.Book.TwiceAsOld;

import java.util.Scanner;

public class TwiceAsOld {

    public static void main(String[] args) {
        int fatherAge = 0;
        int sonAge = 0;
        int years = -1;
        System.out.println("Let`s know in how many years the father will be twice " +
                "as old than his son or was twice as old!");

        while (true) {
            System.out.println("Enter father`s age from 20 to 100  years old :");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input < 20 || input > 100) {
                System.out.println("wrong input");


            } else if (input >= 20 && input <= 100) {
                fatherAge = input;
               // System.out.println(fatherAge);
                break;

            }
        }
        while (true) {
            System.out.println("Enter son`s age from 1 to 80  years old :");
            System.out.println("The son should be at least 20 ,but no more than 40 years younger than his father  ");
            Scanner scanner1 = new Scanner(System.in);
            int input1 = scanner1.nextInt();
            if (input1 < 1 || input1 > 80 || input1 >= fatherAge - 19 || input1 <= fatherAge - 40) {
                System.out.println("wrong input");


            } else if (input1 >= 1 && input1 <= 80) {
                sonAge = input1;
               // System.out.println(sonAge);
                break;

            }
        }
        if (fatherAge == sonAge * 2) {
            System.out.println("The father now twice as old");
            return;
        }


//        public  void twiceOld ( int fatherAge, int sonAge){
        for (int i = 0; i < 60; i++) {
            years++;
            if (fatherAge >= 50) {
                int f = fatherAge - i;
                int s = sonAge - i;

                //System.out.print(f);
                //System.out.println(s);
                if (f == s * 2) {
                    System.out.println("The father was " + years + " years ago twice as old");
                }

            }
            if (fatherAge < 50) {
                int ff = fatherAge + i;
                int ss = sonAge + i;
                if (ff == ss * 2) {
                    //System.out.println(ff);
                    //System.out.println(ss);
                    System.out.println("The father will be in " + years + " years  twice as old");
                }
            }
        }
    }
}







