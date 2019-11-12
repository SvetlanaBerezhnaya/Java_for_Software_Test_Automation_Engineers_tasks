package com.epam.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static String getParameter(String parameter) throws ValidatorException {
        String value = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input " + parameter + ": ");
            switch (parameter) {
                case "year of publishing":
                case "count of books":
                case "year of publishing of the book":
                case "count of pages of the book":
                    try {
                        if (parameter == "count of books")
                            System.out.println();
                        int valueInt = scanner.nextInt();
                        if (valueInt > 0)
                            return "" + valueInt;
                        break;
                    } catch (Exception e) {
                        throw new ValidatorException("Incorrect input.");
                    }
                case "title of the book":
                case "author of the book":
                case "publisher of the book":
                    value = scanner.nextLine();
                    value = value.trim();
                    if (!value.isEmpty() && value != "")
                        return "" + value;
                    break;
                case "price of the book":
                    float valueFloat = scanner.nextFloat();
                    if (valueFloat > 0)
                        return "" + valueFloat;
                    break;
                case "percent":
                    return "" + scanner.nextFloat();
                case "author":
                    value = scanner.nextLine();
                    value = value.trim();
                    if (!value.isEmpty() && value != "")
                        return "" + value;
                    break;
                default:
            }
            System.out.print("Invalid " + parameter + ". ");
        }
    }

    public static Books createBooks(int countOfBooks) throws ValidatorException {
        Books books = new Books(countOfBooks);
        Scanner scanner = new Scanner(System.in);
        String valueStr = "";
        for (int i = 1; i <= countOfBooks; i++) {
            Book book = new Book();
            try {
                System.out.println("PLEASE INPUT BOOK № " + book.getId() + " DETAILS:");
                book.setTitle(getParameter("title of the book"));
                book.setAuthor(getParameter("author of the book"));
                book.setPublisher(getParameter("publisher of the book"));
                book.setYearOfPublishing(Integer.parseInt(getParameter("year of publishing of the book")));
                book.setCountOfPages(Integer.parseInt(getParameter("count of pages of the book")));
                book.setPrice(Float.parseFloat(getParameter("price of the book")));
                books.addBook(book);
                System.out.println();
            } catch (ValidatorException e) {
                throw new ValidatorException(e.getMessage(), e);
            }
        }
        return books;
    }

    public static void main(String[] args) throws ValidatorException {
        int countOfBooks = 0;
        Books books = null;
        try {
            countOfBooks = Integer.parseInt(getParameter("count of books"));
            if (countOfBooks > 0) {
                books = createBooks(countOfBooks);
                books.view();

                books.changingValueOfBooksOnPercent(Float.parseFloat(getParameter("percent")));
                books.view();

                Books foundedBooks = books.searchBooksByAuthor(getParameter("author"));
                foundedBooks.view();

                foundedBooks = books.searchBooksPublishedAfterYearOfPublishing(Integer.parseInt(getParameter("year of publishing")));
                foundedBooks.view();

                Books sortedBooks = new Books(0);
                sortedBooks.setBooks(Arrays.copyOf(books.getBooks(), countOfBooks));

                System.out.println("Sorted list of books by author in alphabetical order:");
                Arrays.sort(sortedBooks.getBooks(), new BookAuthorComparator());
                sortedBooks.view();

                System.out.println("Sorted list of books by publisher in alphabetical order:");
                Arrays.sort(sortedBooks.getBooks(), new BookPublisherComparator());
                sortedBooks.view();

                System.out.println("Sorted list of books by price in descending order:");
                Arrays.sort(sortedBooks.getBooks(), new BookPriceComparator());
                sortedBooks.view();

                System.out.println("Initial list of books:");
                books.view();
            }
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }
}
