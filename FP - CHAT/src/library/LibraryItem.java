package library;

public abstract class LibraryItem {
    protected String title;
    protected String author;
    protected int yearPublished;

    public abstract void printDetails();
    public abstract boolean isAvailible();

    public LibraryItem() {
    }

    public LibraryItem(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
