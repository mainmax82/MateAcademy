package Innerclasses.A.Ex9;
interface  Ex9Interface {
    void display();
}
public class Ex9 {
    public void show(int i){
        class Ex9Inner implements Ex9Interface{
            @Override
            public void display() {
                System.out.println("display");

            }

        }
        Ex9Inner ex9Inner=new Ex9Inner();
        ex9Inner.display();
    }

    public static void main(String[] args) {
        Ex9 ex9=new Ex9();
        ex9.show(7);
    }
}
