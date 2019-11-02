package com.epam.task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static String getParameter(String parameter) {
        String value = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input " + parameter + ": ");
            switch (parameter) {
                case "year of publishing":
                case "count of books":
                    int valueInt = scanner.nextInt();
                    if (valueInt > 0) {
                        return "" + valueInt;
                    }
                    break;
                case "percent":
                    return "" + scanner.nextFloat();
                case "author":
                    value = scanner.nextLine();
                    value = value.trim();
                    if (!value.isEmpty() && value != "") {
                        return "" + value;
                    }
                    break;
                default:
            }
            System.out.print("Invalid " + parameter + ". ");
        }
    }

    public static Books createBooks(int countOfBooks) {
        Books books = new Books(countOfBooks);
        Random random = new Random();
        for (int i = 1; i <= countOfBooks; i++) {
            int yearOfPublishing = random.nextInt(30) + 1990;
            int countOfPages = random.nextInt(1001) + 200;
            float price = random.nextInt(1100) + 100;
            Book book = new Book("title" + i, "author" + i, "publisher" + i,
                    yearOfPublishing, countOfPages, price);
            books.addBook(book);
        }
        return books;
    }

    public static void main(String[] args) {
        int countOfBooks = Integer.parseInt(getParameter("count of books"));
        Books books = createBooks(countOfBooks);
        books.view();

        books.changingValueOfBooksOnPercent(Float.parseFloat(getParameter("percent")));
        books.view();

        Books foundedBooks = books.searchBooksByAuthor(getParameter("author"));
        foundedBooks.view();

        foundedBooks = books.searchBooksPublishedAfterYearOfPublishing(Integer.parseInt(getParameter("year of publishing")));
        foundedBooks.view();
    }
}
