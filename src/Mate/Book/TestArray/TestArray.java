package Mate.Book.TestArray;

public class TestArray {

    public static void main(String[] args) {

        int[]a=new int[4];
        int[] array = {2, 3, 4, 5, 6, 8};
        for(int i=0;i<array.length;i++){


            if(i%2==0){
                int count=0;
                count++;
                a[count]=array[i];

            }
        }
        for(int j:a)
            System.out.println(j);
    }
}
