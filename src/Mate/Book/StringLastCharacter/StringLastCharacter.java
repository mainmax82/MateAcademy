package Mate.Book.StringLastCharacter;

public class StringLastCharacter {
        public static char getLastCharacter(String input) {
            char c=input.charAt(input.length()-1);
            System.out.println(c);
            return  c;
        }

    public static void main(String[] args) {
        getLastCharacter("thhjjkj");
    }
}
