package Innerclasses.A.Ex7Base;

public class Ex7Base {
    private String s="String";
    private void showS(){
        System.out.println(s);
    }
    class Ex7Inner{
        private String ss="Ex7";
        public void changeS(){
            s="Not String";
            showS();

        }
    }
    public Ex7Inner makeEx7Inner(){
        return  new Ex7Inner();
    }

    public static void main(String[] args) {
        Ex7Base ex7Base=new Ex7Base();
        ex7Base.makeEx7Inner().changeS();
        System.out.println(ex7Base.makeEx7Inner().ss);
        Ex7Base.Ex7Inner inner=ex7Base.new Ex7Inner();
        System.out.println(inner.ss);
    }
}
