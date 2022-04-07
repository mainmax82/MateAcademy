package CodeWar.RemoveCharacter.FindOutlier;

public class FindOutlier {
    public static int findOutlier(int[] array) {
        int count = 0;
        int outLier = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;

            }
            if (count >= 2 && array[i]%2!=0) {
                outLier = array[i];

            }else if(count<=1 && array[i]%2==0){
                outLier=array[i];
            }

        }
        System.out.println(outLier);
        System.out.println(count);
        return outLier;
    }

        public static void main (String[]args){


            int[] a = {2, 4, 0, 100, 4, 11, 2602, 36};
            int[] b = {160, 3, 1719, 19, 11, 13, -21};
            findOutlier(a);
            findOutlier(b);
        }
    }

