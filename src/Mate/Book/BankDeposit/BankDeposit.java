package Mate.Book.BankDeposit;

public class BankDeposit {
    public static int calculateProfit(double amount, double percent, int period) {
        //Write code below this line
        int profit=0;
        double deposit=amount;

        for(int i=0;i<period;i++){
            amount+=amount*percent;
           // grossSum+=amount;
          //  System.out.println(grossSum);
            System.out.println(amount);

        }
        profit=(int)(amount-deposit);
        System.out.println(profit);
        return profit;

        //Write code above this line
    }

    public static void main(String[] args) {
        calculateProfit(1000.000000,0.0550000,7);
    }
}
