package ObjectsChapter1.Ex9;

public class Wrapper {
    public static void main(String[] args) {
        int i = 5;
        Integer integer = new Integer(i);
        System.out.println(integer);

        double d = 567.67788d;
        Double aDouble=new Double(d);
        System.out.println( aDouble);

        char c = 'x';
        Character ch = new Character(c);
        System.out.println(ch);

        long l = 56788990;
        Long along=l;
        System.out.println(along);

    }
}
