package Initialization.Ex1.Ex2;

class Tester {
    String s1 = "Java";
    String s2;
    String s3;

    Tester() {
        s3 = "Python";
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println(tester.s1);
        System.out.println(tester.s2);
        System.out.println(tester.s3);
    }

}
