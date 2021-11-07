package sky.pro;

import java.util.Objects;

public class Book {
    private int yearPublication;
    private final String bookName;
    private final Author author;

    public Book(int yearPublication, String bookName, Author author) {
        this.yearPublication = yearPublication;
        this.bookName = bookName;
        this.author = author;
    }

    public int getYearPublication() {

        return this.yearPublication;
    }

    public String getBookName() {

        return this.bookName;
    }

    public String getSurName() {
        return author.getSurName();

    }

    public String getFirstName() {
        return author.getFirstName();

    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearPublication=" + yearPublication +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
