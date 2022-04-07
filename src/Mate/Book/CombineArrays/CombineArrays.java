package Mate.Book.CombineArrays;

public class CombineArrays {

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        int[] a = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            a[i] = firstArray[i];
        }
            for (int b =0;b<secondArray.length;b++) {
                a[firstArray.length+b] = secondArray[b];

            }

        for(int j:a)
            System.out.println(j);
        return a;
    }

    public static void main(String[] args) {
        int[] c={1,2,3,4};
        int[] b ={5,6,6};
        //int []c=new int[0];
        getCombinedArray(c,b);
    }
}
