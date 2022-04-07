package Controlling.Drinks;

public class Drinks {
    public static void main(String[] args) {
        int guestNumber=4;
        int drink = 0;
        for (int i=0; i <guestNumber; i++){
            drink=(i+1)+drink;
        }
        System.out.println("We have prepared "  + drink +  " drinks");
    }
}
