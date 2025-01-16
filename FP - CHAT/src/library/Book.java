package library;

public class Book extends LibraryItem{
    protected String ISBN;
    protected String genre;
    protected boolean borrowed;

    public Book(String title, String author, int yearPublished) {
        super(title, author, yearPublished);
    }

    public Book(String title, String author, int yearPublished, String ISBN, String genre, boolean borrowed) {
        super(title, author, yearPublished);
        this.ISBN = ISBN;
        this.genre = genre;
        this.borrowed = borrowed;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Genre: " + genre);
        System.out.println("Borrowed?: " + borrowed);
    }

    @Override
    public boolean isAvailible() {
        return !borrowed;
    }
}
