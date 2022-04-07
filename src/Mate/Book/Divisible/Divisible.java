package Mate.Book.Divisible;

import java.lang.reflect.Array;

public class Divisible {
    static int[] numbers = {0, -11, 9, -3, 7, 22, -1, -22, 113, 741, 32};
    static int divider = 11;

    public int[] getDivisibleNumbers(int[] numbers, int divider) {
        int[] result = null;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0 && numbers[i]  > 0)
                count++;
        }
        result=new int[count];
        count=0;
        for(int i:numbers){
            if (i % divider == 0 && i>0) result[count++] = i;
        }
        for(int x: result){
            System.out.println(x);
        }

        return result;
    }


    public static void main(String[] args) {
        Divisible d = new Divisible();
        d.getDivisibleNumbers(numbers, divider);

    }
}
