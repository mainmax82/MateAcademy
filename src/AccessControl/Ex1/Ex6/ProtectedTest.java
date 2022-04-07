package AccessControl.Ex1.Ex6;


class Protect{
    protected String s="protected";
}
    public class ProtectedTest{
    static void showS(){
        Protect prootect=new Protect();
        System.out.println(prootect.s);
    }
        public static void main(String[] args) {
            showS();
        }
    }

