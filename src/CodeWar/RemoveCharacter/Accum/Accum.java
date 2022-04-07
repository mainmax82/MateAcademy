package CodeWar.RemoveCharacter.Accum;

public class Accum {
    // public static String accum(String s) {
//        if (s == null || s.length() == 0) {
//            return "";

    public static void main(String[] args) {


        String s = "abcd";
        String result = null;
        StringBuilder sb = new StringBuilder();
        char[] c = s.toLowerCase().toCharArray();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.append("-");
            sb.append(c[i]);
            length++;
            //System.out.println(length);
            for (int j = 1; j < length; j++) {
                // System.out.print(j);
                sb.append(c[length - 1]);
            }
        }
        sb.deleteCharAt(0);
        //result = sb.toString();
       // System.out.println(result);
       // System.out.println(sb.length());
        int y = 0;
        for (int q = 0; q < sb.length(); q++) {
            int z=0;
            while (y < sb.length()) {
                if (Character.isLowerCase(sb.charAt(y))) {
                    sb.setCharAt(y, Character.toUpperCase(sb.charAt(y)));
                }
               // System.out.print(y);
                y += (q + 2)+z;
                z++;


            }
        }
        result = sb.toString();
        System.out.println(result);
    }
}







