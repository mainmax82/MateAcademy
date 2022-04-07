package Interfaces.Ex3;

import Interfaces.Ex3.Ex5.Ex5;

public class Ex5Test implements Ex5 {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void c() {
        System.out.println("c");
    }

    public static void main(String[] args) {
        Ex5Test ex5Test=new Ex5Test();
        ex5Test.a();
        ex5Test.b();
        ex5Test.c();
    }
}
