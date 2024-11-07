import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        for(int i=0; i<3; i++){
            System.out.println("Enter the details for book " + (i+1) + ":");
            System.out.println("Title: ");
            String title = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            System.out.println("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Book book = new Book(title,author,price);
            library.addBook(book);
            System.out.println();
        }

        library.displayAllBooks();

        System.out.println("Enter the author to search for: ");
        String searchAuthor = scanner.nextLine();
        library.findBooksByAuthor(searchAuthor);

        System.out.println("Books before sorting by price:");
        library.displayAllBooks();

        library.sortBooksByPrice();
        System.out.println("Books after sorting by price:");
        library.displayAllBooks();
    }
}