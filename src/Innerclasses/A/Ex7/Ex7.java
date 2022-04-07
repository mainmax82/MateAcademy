package Innerclasses.A.Ex7;
interface Ex7Interface{
    void display();
}
public class Ex7 {
    public Ex7Interface ex7Interface(){
        class Ex7Inner implements Ex7Interface{
            @Override
            public void display() {
                System.out.println("Ex7");
            }
        }
        return new Ex7Inner();
    }

    public static void main(String[] args) {
        Ex7 ex7=new Ex7();
        ex7.ex7Interface().display();
    }
}
