package com.epam;

import java.util.Scanner;

public class Task2 {

    public static String toBinary(int number) {
        String str = "";
        String reverseStr = "";
        int remainderOfDivision;

        while (number > 1) {
            remainderOfDivision = number % 2;
            number = number / 2;
            str += remainderOfDivision;
        }
        str += number;

        int i = str.length() - 1;
        while (i >= 0) {
            reverseStr += str.charAt(i);
            i--;
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int number = scan.nextInt();
        if (number <= 0) {
            System.out.println("The number is not positive integer.");
        } else {
            System.out.println("The binary representation of the number is: " + toBinary(number));
        }
    }
}
