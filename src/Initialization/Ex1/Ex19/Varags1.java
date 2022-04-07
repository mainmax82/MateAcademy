package Initialization.Ex1.Ex19;

public class Varags1 {
    static  void f(String...args){
        for(String s: args)
            System.out.print(s+" ");
    }


    public static void main(String[] args) {
        String[] animals=new String[2];
        animals[0]="Bobot";
        animals[1]="Das Hound";
        f("Vova","Carl","Fritz");
        f(new String[]{"Mus", "Paska"});
        f(animals);
    }
}
