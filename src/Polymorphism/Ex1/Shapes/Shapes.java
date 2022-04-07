package Polymorphism.Ex1.Shapes;

import java.util.Random;

import static Print.Print.print;
 class Circle extends Shape {
	@Override public void draw() { print("Circle.draw()"); }
	@Override public void erase() { print("Circle.erase()"); }
 }

 class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
 }
 // and:
         class Shape {
	public void draw() {}
	public void erase() {}
 }
 // and:

          class Square extends Shape {
	@Override public void draw() { print("Square.draw()"); }
	@Override public void erase() { print("Square.erase()"); }
 }
 // and:

         class Triangle extends Shape {
	@Override public void draw() { print("Triangle.draw()"); }
	@Override public void erase() { print("Triangle.erase()"); }
 }




public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        // fill up the array wth shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();
    }
}
