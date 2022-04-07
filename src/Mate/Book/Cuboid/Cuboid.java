package Mate.Book.Cuboid;

public class Cuboid {
        public static int findDifference(int[] a, int[] b) {
            int result=0;
            int aVolume=0;
            int bVolume=0;
            for(int i=0; i<a.length;i++){
                aVolume=a[i];
            }
            for(int i=0; i< b.length;i++){
                bVolume*=b[i];
            }
            result=aVolume-bVolume;
            System.out.println(result);
            return result;
        }


    public static void main(String[] args) {
        int[]a ={2,2,2};
        int []b={2,4,1};
        findDifference(a,b);
    }
}
