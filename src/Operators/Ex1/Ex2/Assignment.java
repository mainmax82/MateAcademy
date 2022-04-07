package Operators.Ex1.Ex2;

public class Assignment {
    public static void main(String[] args) {
      FloatTest floatTest=new FloatTest();
      FloatTest floatTest1=new FloatTest();
      floatTest.f=9.24f;
      floatTest1.f=10.25f;
        System.out.println(floatTest.f );
        System.out.println(floatTest1.f);
        floatTest=floatTest1;
        System.out.println(floatTest.f);
        System.out.println(floatTest1.f);
        floatTest.f=11.34f;
        System.out.println(floatTest.f);
        System.out.println(floatTest1.f);
    }
}
