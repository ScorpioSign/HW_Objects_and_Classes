package lessons;

import java.util.Objects;

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
    @Override
    public String toString(){
        return this.bookTitle + "; " + this.author + "; " + this.publishingYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return publishingYear == book.publishingYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author,book.author);
    }
    @Override
    public int hashCode (){
        return Objects.hash(bookTitle, author, publishingYear);
    }
}
