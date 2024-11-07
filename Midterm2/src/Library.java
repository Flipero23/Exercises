import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    protected ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }


    public void addBook(Book book){
        books.add(book);
    }

    public void displayAllBooks(){
        for(int i=0; i<books.size(); i++){
            System.out.println("Book " + (i+1) + ":");
            System.out.println(books.get(i));
            System.out.println();

        }
    }

    public void findBooksByAuthor(String author){
        boolean found = false;
        System.out.println("\nBooks by " + author);
        for (int i=0; i< books.size();i++){
            if(books.get(i).getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: " + books.get(i).getTitle());
                System.out.println("Price: " + books.get(i).getPrice());
                System.out.println();
                found = true;
            }
            else if(!found){
                System.out.println("No books found by author " + author);
            }
        }
    }

    public void sortBooksByPrice(){
        books.sort(Comparator.comparing(Book::getPrice));
    }
}
