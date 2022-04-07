package Strings;

public class Ex9 {
    public static  String knights="Then,when you have found  the shrubbery,you must" +
            " cut down the mightiest tree int the forest with aherring";

    public static void main(String[] args) {
        System.out.println(knights.replaceAll("[aeoui]","_"));
    }

}
