package Initialization.Ex1.Ex3;

public class Tester3 {
    Tester3(){
        System.out.println("Tester3");
    }
    Tester3(String  s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Tester3();
        new Tester3("String");
    }
}
