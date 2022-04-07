package Operators.Ex1.Income;

public class Income {
    double income=0;
    double tax=0;

    public  void calcTax(double income) {
        if (income <= 1000) {
            tax = income * 0.02;
            System.out.println(tax);
        }
        if (income > 1000 && income <= 10000) {
            tax = (income - 1000) * 0.03 + 1000 * 0.02;
            System.out.println(tax);
        }
        if (income > 10000) {

            tax = (income - 10000) * 0.05+(income-(income-9000))*0.03+ 1000 * 0.02;
            System.out.println(tax);
        }
    }

    public static void main(String[] args) {
        Income income1=new Income();
        income1.calcTax(900);
        income1.calcTax(5000);
        income1.calcTax(20000);
    }

}

