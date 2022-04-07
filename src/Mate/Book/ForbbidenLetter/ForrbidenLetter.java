package Mate.Book.ForbbidenLetter;

public class ForrbidenLetter {
    public static char[] removeLetter(String input) {
        char[] chars;
        if (input == null) {
            return new char[0];
        }
        String result = input.toLowerCase();
        chars = result.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'r') {
                chars[i] = '!';
            }
            sb.append(chars[i]);
        }
        for (char c:chars){
            System.out.print(c);

        }
        return chars;
    }

    public static void main(String[] args) {
        removeLetter("Remove Letters");
        removeLetter(null);
    }

}
