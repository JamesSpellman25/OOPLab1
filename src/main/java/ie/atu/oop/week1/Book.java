package ie.atu.oop.week1;

public class Book {

    private String title;
    private String author;
    private int pageCount;

    //Right click



    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }


}
