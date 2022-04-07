package Mate.Book.CenturyFromYear;

public class CenturyFromYear {

        public static int getCentury(int year){
            int century=0;
            if(year/100==year%100+year/100){
                century=year/100;
               // System.out.println(century);
            }
            else century=year/100+1;
            System.out.println(century);
            return  century;
    }

    public static void main(String[] args) {
        getCentury(1705);
        getCentury(1900);
        getCentury(1601);
        getCentury(2000);
    }
}
