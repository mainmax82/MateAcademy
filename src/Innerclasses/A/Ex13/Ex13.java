package Innerclasses.A.Ex13;
interface  Ex13Interface{
    void say(String s);
}
public class Ex13 {
    Ex13Interface ex13Interface(){
        return  new Ex13Interface() {
            @Override
            public void say(String s) {
                System.out.println(s);
            }
        };
    }

    public static void main(String[] args) {
        Ex13 ex13=new Ex13();
        ex13.ex13Interface().say("Yes");
    }
}
