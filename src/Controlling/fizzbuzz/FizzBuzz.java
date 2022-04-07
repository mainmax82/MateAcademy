package Controlling.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int startNumber = 35;
        int endNumber = 42;
        for (int i = startNumber; i <= endNumber; i++) {


            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
                continue;
            }
            if(i%5==0){
                System.out.println("fizz");
                continue;
            }
            else if(i%7==0){
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}

