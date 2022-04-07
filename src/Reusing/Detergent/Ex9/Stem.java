package Reusing.Detergent.Ex9;

class Component1 {
    Component1(short s) {
        System.out.println("Component1");
    }
}
    class Component2 {
        Component2(int i) {
            System.out.println("Component2");
        }
    }
        class Component3{
            Component3(char c){
                System.out.println("Component3");
            }
        }

class Root{
    Component1 component1;
    Component2 component2;
    Component3 component3;
    Root(String c, int b){
        component1=new Component1((short)1);
        component2=new Component2(5);
        component3=new Component3('C');
        System.out.println("Root");
    }
}
public class Stem extends Root {
    Component1 comp1;
    Component2 comp2;
    Component3 comp3;
    Stem(int d,String s){
        super("r", 6);
        comp1=new Component1((short)7);
        comp2=new Component2(7);
        comp3=new Component3('Q');
        System.out.println("Stem");
    }

    public static void main(String[] args) {
        Stem stem=new Stem(4,"stem");
    }
}
