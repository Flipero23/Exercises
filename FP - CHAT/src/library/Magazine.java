package library;

public class Magazine extends LibraryItem{
    protected int issueNumber;
    protected boolean borrowed;

    public Magazine(String title, String author, int yearPublished) {
        super(title, author, yearPublished);
    }

    public Magazine(String title, String author, int yearPublished, int issueNumber, boolean borrowed) {
        super(title, author, yearPublished);
        this.issueNumber = issueNumber;
        this.borrowed = borrowed;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("Issue number: " + issueNumber);
        System.out.println("Borrowed?: " + borrowed);
    }

    @Override
    public boolean isAvailible() {
        return !borrowed;
    }
}
