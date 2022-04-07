package Innerclasses.A.InheritInner;
class  WithInner{
    class Inner{
        private String s;
        public Inner(String s){
            System.out.println("inner()"+s);
            this.s=s;
        }
    }
}
public class InheritInner {
    class SecondInner extends WithInner.Inner{


    public SecondInner(WithInner withInner){
        withInner.super("super");
        System.out.println("InheritInner.SecondOuter");

    }
    }

    public static void main(String[] args) {
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner();
        SecondInner si=ii.new SecondInner(wi);

    }
}
