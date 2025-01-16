package library;

public class DVD extends LibraryItem{
    protected int duration;
    protected boolean borrowed;

    public DVD(String title, String author, int yearPublished) {
        super(title, author, yearPublished);
    }

    public DVD(String title, String author, int yearPublished, int duration, boolean borrowed) {
        super(title, author, yearPublished);
        this.duration = duration;
        this.borrowed = borrowed;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("Duration: " + duration + "min");
        System.out.println("Borrowed?: " + borrowed);
    }

    @Override
    public boolean isAvailible() {
        return !borrowed;
    }
}
