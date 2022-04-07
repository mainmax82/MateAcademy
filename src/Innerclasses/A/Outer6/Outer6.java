package Innerclasses.A.Outer6;

import Innerclasses.A.A;

public class Outer6 {
     protected class Inner6 implements A{
        public Inner6(){}
        @Override
        public void show() {
            System.out.println("Inner6");
        }
    }
}
