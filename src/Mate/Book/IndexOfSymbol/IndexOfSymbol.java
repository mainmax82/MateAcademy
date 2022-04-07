package Mate.Book.IndexOfSymbol;

public class IndexOfSymbol {
    public static int getIndex(String value) {
        // WRITE YOUR CODE BELOW THIS LINE
        return value.indexOf('a');
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static void main(String[] args) {
        System.out.println(  getIndex(""));
        System.out.println( getIndex("coffe"));
        System.out.println(getIndex("mate"));
    }
}
