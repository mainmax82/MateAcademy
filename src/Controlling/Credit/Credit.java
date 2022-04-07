package Controlling.Credit;

public class Credit {
    public static void main(String[] args) {
        int resultYears =-1;

        int expectedLimit=2500;
        int amount=2000;
        double percent=0.05;
        while ( amount < expectedLimit) {
            amount=(int)(amount+  amount*percent);
            resultYears++;
        }
        System.out.println("Credit period is maximum " + resultYears +  " years! ");
    }
}
