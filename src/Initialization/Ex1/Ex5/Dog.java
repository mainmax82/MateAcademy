package Initialization.Ex1.Ex5;

public class Dog {
    void bark(int i) {
        System.out.println("bark");
    }

    void bark(char c) {
        System.out.println("Whoof");
    }

    void bark(float f) {
        System.out.println("awf, awf");
    }
    void bark(String s,int b){
        System.out.println("RRRRR");
    }
    void bark(int b,String s){
        System.out.println("RAF");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(5);
        dog.bark('c');
        dog.bark(4.5f);
        dog.bark(6,"ttttt");
        dog.bark("tttttt",5);
        }
    }

