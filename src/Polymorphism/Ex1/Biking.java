package Polymorphism.Ex1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.getJCRefType;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

class Cycle {
    private String name = "CycleTest";
    private int wheels=0;
    public  int wheels(){
        return  wheels;
    }
    public static void travel(Cycle c) {
        println("CycleTest.ride() " + c);
    }
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private  int wheels=1;
    public  int wheels(){
        return  wheels;
    }
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private  int wheels=2;
    public  int wheels(){
        return wheels;
    }
    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private  int wheels=3;
    public  int wheels(){
        return wheels;
    }
    public String toString() {
        return this.name;
    }
}

public class Biking {
    public static void ride(Cycle c) {
        c.travel(c);
        System.out.println("Quantity of wheels " +c.wheels());
    }
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

