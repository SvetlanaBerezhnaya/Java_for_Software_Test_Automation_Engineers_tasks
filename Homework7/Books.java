package com.epam.task1;

public class Books {
    private Book[] books;

    public Books(int countOfBooks) {
        this.books = null;
        if (countOfBooks >= 0)
            this.books = new Book[countOfBooks];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book newBook) {
        if (newBook != null) {
            if (this.books == null) {
                Books booksObject = new Books(1);
                this.books = booksObject.books;
            }
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i] == null) {
                    this.books[i] = newBook;
                    return;
                }
            }
        }
    }

    public void view() {
        if (this.books != null)
            for (Book book : this.books)
                if (book != null)
                    System.out.println(book);
        System.out.println();
    }

    public void changingValueOfBooksOnPercent(float percent) throws ValidatorException {
        if (this.books != null)
            for (int i = 0; i < this.books.length; i++)
                if (this.books[i] != null)
                    this.books[i].setPrice(this.books[i].getPrice() * (1 + percent / 100));
    }

    public Books searchBooksByAuthor(String author) {
        Books foundedBooks = null;
        int countOfBooks = 0;
        if (author != null && author.trim() != "" && this.books != null) {
            for (Book book : this.books)
                if (book.getAuthor().trim().compareToIgnoreCase(author.trim()) == 0)
                    countOfBooks++;
            foundedBooks = new Books(countOfBooks);
            for (int i = 0; i < this.books.length; i++)
                if (this.books[i].getAuthor().trim().compareToIgnoreCase(author.trim()) == 0)
                    foundedBooks.addBook(this.books[i]);
        }
        if (countOfBooks == 0)
            System.out.println("There is no any book of author " + author + ".");
        return foundedBooks;
    }

    public Books searchBooksPublishedAfterYearOfPublishing(int yearOfPublishing) {
        Books foundedBooks = null;
        int countOfBooks = 0;
        if (yearOfPublishing > 0 && this.books != null) {
            for (Book book : this.books)
                if (book.getYearOfPublishing() > yearOfPublishing)
                    countOfBooks++;
            foundedBooks = new Books(countOfBooks);
            for (int i = 0; i < this.books.length; i++)
                if (books[i].getYearOfPublishing() > yearOfPublishing)
                    foundedBooks.addBook(this.books[i]);
        }
        if (countOfBooks == 0)
            System.out.println("There is no any book published after " + yearOfPublishing + " year.");
        return foundedBooks;
    }
}
