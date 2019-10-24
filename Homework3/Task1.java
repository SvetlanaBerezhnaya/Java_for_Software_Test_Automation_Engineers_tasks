package com.epam;

import java.util.Scanner;

public class Task1 {

    public static String getUniqueStringCharacters(String text) {
        String UniqueStringCharacters = "";
        int i = 0;
        while (!text.isEmpty() && i <= text.length() - 1) {
            char ch = text.charAt(i);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                UniqueStringCharacters += ch;
                text = text.replace(ch, ' ');
            }
            i++;
        }
        return UniqueStringCharacters;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        if (str.trim().isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            String uniqueStringCharacters = getUniqueStringCharacters(str);
            if (uniqueStringCharacters.isEmpty()) {
                System.out.println("There are no unique characters in the string.");
            } else {
                System.out.println("The unique character(s) of the string '" + str + "': " + uniqueStringCharacters);
            }
        }
    }
}
