package Mate.Book.Test;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = "national aeronautics space administration";
        String stringToUpperCase = s.toUpperCase();
        System.out.println(stringToUpperCase);
        char[] chars = stringToUpperCase.toCharArray();
        stringBuilder.append(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append(chars[i + 1]);
            }

        }
        System.out.println(stringBuilder);
    }
}
