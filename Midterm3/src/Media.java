public class Media {
    protected String title;
    protected String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
    }
}


class Book extends Media{
    protected int numPages;

    public Book(String title, String creator, int numPages) {
        super(title, creator);
        this.numPages = numPages;
    }

    public void readSample(){
        System.out.println("Sample: Sample pages are availible to read.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + numPages);
    }
}

class Movie extends Media{
    protected double duration;

    public Movie(String title, String creator, double duration) {
        super(title, creator);
        this.duration = duration;
    }

    public void watchTrailer(){
        System.out.println("Trailer: Watch the trailer availible");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
    }
}
