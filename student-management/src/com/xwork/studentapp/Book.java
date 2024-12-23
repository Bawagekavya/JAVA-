package com.xwork.studentapp;

public class Book {

    private double id;
    private String bookName;
    private String author;

    protected double getId() {
        return id;
    }

    protected String getBookName() {
        return bookName;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setId(double id) {
        this.id = id;
    }

    protected void setBookName(String bookName) {
        this.bookName = bookName;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
