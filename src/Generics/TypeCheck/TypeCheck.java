package Generics.TypeCheck;

import java.util.ArrayList;

public class TypeCheck {
    public static void main(String[] args) {
        Class c1=new ArrayList<String>().getClass();
        Class c2=new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }


}
