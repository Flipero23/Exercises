public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Essentials", "Alice Johnson", 320);
        Movie movie1 = new Movie("Learning AI","Bob Smith", 120);
        Book book2 = new Book("Effective Programming", "Carol White", 450);

        Media[] mediaArr = {book1,movie1, book2};

        Main main = new Main();
        main.displayAllMedia(mediaArr);
    }

    public void displayAllMedia(Media[] mediaArr){
        for(int i=0; i< mediaArr.length; i++){
            mediaArr[i].displayInfo();
            if(mediaArr[i] instanceof Book){
                ((Book)mediaArr[i]).readSample();
            } else if (mediaArr[i] instanceof Movie) {
                ((Movie)mediaArr[i]).watchTrailer();
            }
            System.out.println();
        }
    }
}

