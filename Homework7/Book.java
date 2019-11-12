package com.epam.task1;

import java.util.Calendar;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int countOfPages;
    private float price;
    private static int currentBookId = 0;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws ValidatorException {
        if (title.isEmpty())
            throw new ValidatorException("The title of the book is empty.");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws ValidatorException {
        if (author.isEmpty())
            throw new ValidatorException("The author of the book is empty.");
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws ValidatorException {
        if (publisher.isEmpty())
            throw new ValidatorException("The publisher of the book is empty.");
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) throws ValidatorException {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        if (yearOfPublishing < 1400 || yearOfPublishing > currentYear)
            throw new ValidatorException("The year of publishing of the book is incorrect.");
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) throws ValidatorException {
        if (countOfPages <= 0)
            throw new ValidatorException("The count of pages of the book is incorrect.");
        this.countOfPages = countOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws ValidatorException {
        if (price <= 0)
            throw new ValidatorException("The price of the book is incorrect.");
        this.price = price;
    }

    public Book() {
        this.id = ++currentBookId;
    }

    public Book(String title, String author, String publisher, int yearOfPublishing, int countOfPages, float price) {
        this.id = ++currentBookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfPages = countOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": id = " + this.getId() +
                ", title = " + this.getTitle() +
                ", author = " + this.getAuthor() +
                ", publisher = " + this.getPublisher() +
                ", year of publishing = " + this.getYearOfPublishing() +
                ", count of pages = " + this.getCountOfPages() +
                ", price = " + String.format("%.2f", this.getPrice());
    }
}
