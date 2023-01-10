package lessons;

public class Book {
    private String bookTitle;
    private int publishingYear;
    private Author author;

    public Book(String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public String getAuthor(){
        return author.getAuthorName()+ " " + author.getAuthorSurname();
    }
    public String getBookTitle() {

        return this.bookTitle;
    }
    public int getPublishingYear() {
        return this.publishingYear;

    }
    public void setYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }
}
