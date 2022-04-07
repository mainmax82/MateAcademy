package Mate.Book.StringCheck;

public class Test {
    public static boolean isWerewolf(String target) {
        boolean result=false;
        String reverseString = new StringBuilder(target).reverse().toString();
        if (target.equals(reverseString)) {
            result = true;
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        isWerewolf("rotator");
        isWerewolf("racecar");
        isWerewolf("home");
        isWerewolf("evacaniseebeesinacave");
        isWerewolf("rOtaTor");
    }
}
