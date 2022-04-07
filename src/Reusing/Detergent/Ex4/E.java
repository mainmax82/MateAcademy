package Reusing.Detergent.Ex4;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

class A { A(){ println("A()");} }

class B extends A { B(){ println("B()");} }

class C extends B { C(){ println("C()");} }

class D extends C {
    D() { println("D()"); }
    public static D makeD() { return new D(); }
    public static void main(String[] args) {
        D d = new D();
        D d2 = makeD();
    }
}

public class E extends D {
    E() { println("E()"); }
    public static void main(String[] args) {
        E e = new E();
        // test D:
        D.main(args);
    }
}
