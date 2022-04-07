package Mate.Book.EmsAndEns;

public class EmsAndEns {
    public static boolean isEqually(String str) {
        boolean result;
        int m = 0;
        int n = 0;
        if (str == null)
            return false;
        String ss = str.toLowerCase();
        char[] chars = ss.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'm') {
                m++;
            }
            if (chars[i] == 'n') {
                n++;
            }
        }
        if (m == n)
            result = true;
        else result = false;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String str = "mmmnnn";
        String str1 = "Mmnn";
        String str2 = "MMsdfmNNsdn";
        String str3 = "MMmNn";
        String str4 = "sdff";
        isEqually(str);
        isEqually(str1);
        isEqually(str2);
        isEqually(str3);
        isEqually(str4);
    }


}
