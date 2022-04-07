package Mate.Book;

public class Book {
    String title;
    int numberOfPages;
    String author;
    double price;
    boolean isPopular;

    public static void main(String[] args) {


        Book[] books = new Book[4];
        books[0]=new Book();
        books[1]=new Book();
        books[2]=new Book();
        books[3]=new Book();
        books[0].price = 100;
        books[1].price = 100;
        books[0].isPopular = true;
        books[1].isPopular = true;
        books[2].isPopular = true;
        books[0].author = "Kathy Sierra ";
        books[0].numberOfPages = 300;
        books[1].numberOfPages = 345;
        books[2].numberOfPages = 1356;
        books[3].numberOfPages = 555;
        System.out.println(books[1].price);
        System.out.println(books[0].author);
}
}

