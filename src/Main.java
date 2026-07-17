import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {



    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Название", 1990, "Марселина");
        Book book4 = new Book("Еще одна книга Марселины", 1999, "Марселина");
        Book book2 = new Book("Очередное название", 1990, "Хлеб");
        Book book3 = new Book("Названиеещеодно", 1990, "Азалия");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.findBook("Очередное название");
        library.printBooks();
        library.removeBook("Названиеещеодно");
        library.printBooks();
        int bookCount = library.getBookCount();
        System.out.println("Количество книг: " + bookCount);
        library.findBookByAuthor("Марселина");
    }
}
