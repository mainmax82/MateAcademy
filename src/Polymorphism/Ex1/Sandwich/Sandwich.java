package Polymorphism.Ex1.Sandwich;

import Polymorphism.Ex1.Sandwich.FastFood.FastFood;

import static Print.Print.print;

class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Pickle {
    Pickle() { print("Pickle()"); }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()"); }
}

public class Sandwich extends PortableLunch implements FastFood {
    @Override
    public void prepare() {
        System.out.println("Prepare fast");
    }
    public  void taste(){
        System.out.println("Taste Awfully");
    }

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lunch l = new Lunch();
    public Sandwich() { print("Sandwich()"); }
    public static void main(String[] args) {
       Sandwich sandwich= new Sandwich();
       sandwich.prepare();
       sandwich.taste();
    }
}