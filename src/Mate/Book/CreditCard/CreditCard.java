package Mate.Book.CreditCard;
class CreditCard {
    double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }


    //Write code below this line
    public void updateBalance( double sum) {
        if (balance + sum > 0) {
            balance = balance + sum;
        }
        return;
    }

    public static void main(String[] args) {
       CreditCard creditCard =  new CreditCard(599.68);
       creditCard.updateBalance(-1999.99);
        System.out.println(creditCard.balance);
    }
}
