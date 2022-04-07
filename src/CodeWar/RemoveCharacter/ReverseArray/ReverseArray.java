package CodeWar.RemoveCharacter.ReverseArray;

public class ReverseArray {
    static int[] reverseArray(int a) {
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a--;
        }

        for (int j : array)
            System.out.print(j+ " ,");
        return array;
    }



    public static void main(String[] args) {
        reverseArray(8);
    }

}
