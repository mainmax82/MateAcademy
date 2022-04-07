package Controlling.Ex6;

public class IfElse3 {
    static int test(int testval,int begin, int end) {
        if (end < begin) {
            System.out.println("The beginning should be less than ending");
            return 0;
        }
        if (testval >= begin && testval <= end) return +1;
        else return -1;
    }

//    static int test(int testval, int begin, int end) {
//        if (end < begin) {
//            System.out.println("end cannot be < begin");
//            return 0;
//        }
//        if ((testval > (begin - 1)) && (testval < (end + 1)))
//            return +1;
//        if ((testval < begin) || (testval > end))
//            return -1;
//        System.out.println("exceptional case");
//        return 13;
//    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 4));
        System.out.println(test(5, 4, 10));
        System.out.println(test(5, 5, 6));
        System.out.println(test(10, 5, 7));
        System.out.println(test(5, 5, 5));
        System.out.println(test(-5, -5, -3));
    }
}