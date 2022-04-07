package RTTI.ToyTest.Shapes;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }



    abstract public String toString();

}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public  static  void rotate(Shape s){
        if(!(s instanceof Circle))
            System.out.println(s + " rotate");


    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            shape.draw();

        }
        Rhomboid r = new Rhomboid();
        // Upcast:
        Shape s = (Shape) r;
        s.draw();
        // check type before downcast:
        if (s instanceof Circle)
            ((Circle) s).draw();
        else if (!(s instanceof Circle))
            System.out.println("(Shape)r is not a Circle");
        for(Shape ss:shapeList)
        rotate(ss);
    }

}
