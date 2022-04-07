package Mate.Book.GetEvenNumbers;

public class GetEvenNumbers {
    static int[] b;
    static int count = 0;

    public static int[] getEvenNumbers(int[] a) {

        for (int i = 0; i < a.length; i++) {

            if ( a[i]!=0 && a[i] % 2 == 0) {
                count++;
                b = new int[count];
                b[count-1]=a[i];
                System.out.println(b[count-1]);
            }


        }
        return b;
    }


    public static void main(String[] args) {
        int[] d = {0,0,0,4,12,5,8};
        getEvenNumbers(d);


    }


}


