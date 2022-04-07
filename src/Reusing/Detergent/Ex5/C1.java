package Reusing.Detergent.Ex5;

 class A1 {
     public A1(int i) {
         System.out.println("A1");
     }
 }
    class B1 extends A1 {
        public B1(int i) {
            super(i);
            System.out.println("B1");
        }
    }
        public class C1 extends A1{
            public C1(){
                super(12);
                B1 b1=new B1(4);
                System.out.println("C1");
            }
            public static void main(String[] args) {


                C1 c1=new C1();
            }
        }


