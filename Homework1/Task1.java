package com.epam;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Please, enter a three digit integer number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int numberDigit3 = number / 100;
        int numberDigit2 = (number - numberDigit3 * 100) / 10;
        int numberDigit1 = number % 10;
        int numberInReverseOrder = numberDigit1 * 100 + numberDigit2 * 10 + numberDigit3;
        System.out.println("Number in reverse order: " + numberInReverseOrder);
        System.out.println("Result: " + number + " - " + numberInReverseOrder + " = " + (number - numberInReverseOrder));
    }
}
