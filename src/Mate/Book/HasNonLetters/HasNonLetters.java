package Mate.Book.HasNonLetters;

import java.net.SocketTimeoutException;

public class HasNonLetters {
    public static boolean hasNoneLetters(String blacklist, String phrase) {
        String str = blacklist.toLowerCase();
        String str1 = phrase.toLowerCase();
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]) {
                    return false;
                }

            }

        }
        return true;
    }



        public static void main(String[] args) {
            System.out.println(hasNoneLetters("AAAAA", "BBBBBa"));
            System.out.println(hasNoneLetters("abcdef", "gh"));
            System.out.println(hasNoneLetters("abc", "a"));
            System.out.println(hasNoneLetters("abc", "d"));

    }
}
