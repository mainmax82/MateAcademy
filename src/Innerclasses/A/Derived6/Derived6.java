package Innerclasses.A.Derived6;

import Innerclasses.A.A;
import Innerclasses.A.Outer6.Outer6;

public class Derived6 extends Outer6 {
     A makeInner6(){
        return new Inner6();
    }

    public static void main(String[] args) {
        Derived6 derived6=new Derived6();
        derived6.makeInner6().show();
    }
}
