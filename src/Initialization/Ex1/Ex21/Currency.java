package Initialization.Ex1.Ex21;

import static Initialization.Ex1.Ex21.Money.*;

public class Currency {
    Money money;
    public Currency(Money money){
        this.money=money;
    }
    public  void describe() {
        switch (money) {
            case DOLLAR:
                System.out.println("USA");
                break;
            case HRYVNA:
                System.out.println("Ukraine");
                break;
            case POUND:
                System.out.println("UK");
                break;
            case RUBLE:
                System.out.println("Russia");
                break;
            case FRANK:
                System.out.println("Switzerland");
                break;
            case BITCOIN:
                System.out.println("Bitcoin is raising");
                break;
        }
    }

    public static void main(String[] args) {
        Currency dollar=new Currency(Money.DOLLAR);
        Currency bitcoin=new Currency(BITCOIN);
        dollar.describe();
        bitcoin.describe();
    }
}