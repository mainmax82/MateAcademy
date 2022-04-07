package Reusing.Detergent.Ex8;

public class Derive  extends Base{
    public Derive(){
        super('e');
        System.out.println("Non argument constructor");
    }
    public  Derive(int i){
        super('d');
        System.out.println("constructor with argument");
    }

    public static void main(String[] args) {
        Derive d=new Derive();
        Derive d1=new Derive(6);
    }
}
