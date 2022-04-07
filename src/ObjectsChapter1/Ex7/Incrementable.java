package ObjectsChapter1.Ex7;

public class Incrementable {
    static  int i=50;
    static void increment(){
        Incrementable.i++;
    }


    public static void main(String[] args) {
        System.out.println(i);
        Incrementable.increment();
        System.out.println(i);
    }
}
