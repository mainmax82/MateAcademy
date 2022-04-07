package AccessControl.Ex1.Ex5;

public class TestAccess {
    public static void main(String[] args) {
        Access access=new Access();
        System.out.println(access.a);
        System.out.println(access.s);
        access.showS();
        access.showA();
    }
}
