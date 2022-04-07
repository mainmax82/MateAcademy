package Mate.Book.LongestWord;

public class LongestWord {
    public static int findLongest(String sentence) {
        int max = Integer.MIN_VALUE;
        if (sentence==null||sentence.length()==0)
            return 0;
        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i].length());
            if (array[i].length() > max) {
                max = array[i].length();
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        String s="Привет дорогие друзья я за вами очень соскучился";
        String s1=null;
        String s2="";
        findLongest(s);
        findLongest(s1);
        findLongest(s2);

    }
}


