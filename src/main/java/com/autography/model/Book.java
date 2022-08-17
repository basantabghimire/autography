package com.autography.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String title;
    private String isbn;
    private String pictureUrl;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_bookId"),
          inverseJoinColumns = @JoinColumn (name="authors_authorId"))

    private Set<Author> authors=new HashSet<>();

    public Book() {
    }

    public Book(String title, String isbn, String pictureUrl) {
        this.title = title;
        this.isbn = isbn;
        this.pictureUrl=pictureUrl;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", publisher=" + publisher +
                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId != null ? bookId.equals(book.bookId): book.bookId==null;
    }

    @Override
    public int hashCode() {
        return bookId!=null? bookId.hashCode():0;
    }
}
