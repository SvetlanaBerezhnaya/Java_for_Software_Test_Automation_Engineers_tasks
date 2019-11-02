package com.epam.task1;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public void view() {
        System.out.println("id = " + this.getId() + ", title = " + this.getTitle() + ", author = " + this.getAuthor()
                + ", publisher = " + this.getPublisher() + ", year of publishing = " + this.getYearOfPublishing()
                + ", count of pages = " + this.getCountOfPages() + ", price = " + String.format("%.2f", this.getPrice()));
    }
}
