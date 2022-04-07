package GetLowestHighest;

import java.util.Random;

public class GetLowestHighest {
    public static void main(String[] args) {
        int digit = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String s = "";
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int x = random.nextInt(15);
            String blank = " ";
            s = s + x + blank;

        }
        System.out.println(s);
        String delimiter = " ";
        String[] strArray = s.split(delimiter);
       // System.out.println(strArray.length);
        for (String ss : strArray) {
            digit = Integer.parseInt(ss);
            if (digit > max) {
                max = digit;
            }
            if(digit<min){
                min=digit;
            }


        }
        System.out.println("The maximum digit is "+max);
        System.out.println("The minimum digit is "+min);
    }
}










