package Operators.Ex1.TheBiggestNumber;

public class TheBiggestNumber {
    public static void main(String[] args) {
        double a = -5;
        double b = -1;
        double myNumber;
//        double sum=(a+b);
//        double div=(a/b);
//        double mult=(a*b);
//        double sub=(a-b);
        if ((a + b) > (a / b) && (a + b) > (a - b) && (a + b) > (a * b)) {
            myNumber = (a + b);
            System.out.println(myNumber);
        }
        if ((a / b) > (a + b) && (a / b) >= (a * b) && (a / b) >(a - b)) {
            myNumber = (a / b);
            System.out.println(myNumber);
        }
        if ((a * b) > (a + b) && (a * b) >= (a / b) && (a * b) > (a - b)) {
            myNumber=(a*b);
            System.out.println(myNumber);

        }
        if((a-b)>(a+b)&&(a-b)>(a/b)&&(a-b)>(a*b)){
            myNumber=(a-b);
            System.out.println(myNumber);
        }


    }
}



