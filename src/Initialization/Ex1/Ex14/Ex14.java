package Initialization.Ex1.Ex14;

public class Ex14 {
    static  String s="S";
    static  String ss;
    static {
        ss="SS";
    }
    static  void showString(){
        System.out.println(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        Ex14.showString();
    }
}
