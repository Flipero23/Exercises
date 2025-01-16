package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LibraryItem> libraryItems = new ArrayList<>();

        while(true){
            System.out.println("\nLibrary Management Menu:");
            System.out.println("1. Add a Library Item");
            System.out.println("2. Borrow an Item");
            System.out.println("3. Return an Item");
            System.out.println("4. Display All Available Items");
            System.out.println("5. Find the Oldest Item");
            System.out.println("6. Calculate Average Publication Year");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void addLibraryItem(List<LibraryItem> library,Scanner scanner){
        System.out.println("Enter the type of item (Book,Magazine,DVD): ");
        String type = scanner.nextLine();

        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        System.out.println("Enter author: ");
        String author = scanner.nextLine();

        System.out.println("Enter publish year: ");
        int publishYear = scanner.nextInt();

        switch (type){
            case "book":
                System.out.println("Enter ISBN: ");
                String isbn = scanner.nextLine();

                System.out.println("Enter genre: ");
                String genre = scanner.nextLine();

                library.add(new Book(title,author,publishYear,isbn,genre,false));
                break;

            case "magazine":
                System.out.println("Enter issue number: ");
                int issueNumber = scanner.nextInt();

                library.add(new Magazine(title,author,publishYear,issueNumber,false));
                break;

            case "DVD":
                System.out.println("Enter duration in min: ");
                int duration = scanner.nextInt();

                library.add(new DVD (title,author,publishYear,duration,false));
                break;

            default:
                System.out.println("Invalid item type!");
                break;
        }
    }
}