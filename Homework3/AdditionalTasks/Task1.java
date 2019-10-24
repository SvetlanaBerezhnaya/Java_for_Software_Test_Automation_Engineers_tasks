package com.epam;

import java.util.Scanner;

public class Task1 {

    public static String getLastTwoDigitsInReverse(int number) {
        String lastTwoDigitsInReverse = "";
        String str = String.valueOf(number);
        int l = str.length();
        if (l >= 2) {
            lastTwoDigitsInReverse += str.substring(l - 1);
            lastTwoDigitsInReverse += str.substring(l - 2, l - 1);
        }
        return lastTwoDigitsInReverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int number = scan.nextInt();
        if (number <= 0) {
            System.out.println("The number is not positive integer.");
        } else if (number < 10) {
            System.out.println("The number should be at least double-digit.");
        } else {
            System.out.println("The last two digits of the number in reverse is: " + getLastTwoDigitsInReverse(number));
        }
    }
}
