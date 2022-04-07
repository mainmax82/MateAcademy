package Mate.Book.CountOddPositions;

public class CountOddPositions {
    public static int countOddPositionChars(String[] array) {
            int count = 0;
            if (array==null || array.length==0)
                return 0;
            for (int i = 0; i < array.length; i++) {
                StringBuilder sb = new StringBuilder();
                if (i % 2 == 0) {
                    sb.append(array[i]);

                }
                String s = sb.toString();
                count+=s.length();

            }
            System.out.println(count);
            return count;
    }

    public static void main(String[] args) {
        String[] array = {"Hello", "world", "from", "array"};
        String[] array1=null;
        countOddPositionChars(array);
        countOddPositionChars(array1);
    }
}
