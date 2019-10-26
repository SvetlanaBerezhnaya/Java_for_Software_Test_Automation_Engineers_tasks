package com.epam.Task3;

import java.util.Scanner;

public class Task3 {

	public static String getText() {
		String text = "";
		String str = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input text (enter \"exit\" in the end of text to exit): ");
		while (str != null) {
			str = scanner.nextLine();
			if (!str.isEmpty()) {
				int i = str.toLowerCase().lastIndexOf("exit");
				if (i > -1) {
					text += str.substring(0, i);
					break;
				} else {
					text += str;
				}
			}
		}
		return text;
	}

	public static int getNumber() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Please input positive integer number: ");
			number = scanner.nextInt();
			if (number > 0) {
				return number;
			}
			System.out.print("Invalid number. ");
		}
	}

	public static char getFirstCharacterOfWordWithNumberN(String text, int number) {
		char firstCharacter = ' ';
		text = text.trim();
		if (text.isEmpty()) {
			System.out.println("The text is empty.");
			return firstCharacter;
		}

		text = " " + text;
		int word = 0;
		boolean b = true;
		while (b) {
			int i = text.indexOf(" ");
			if (i > -1) {
				text = text.substring(i + 1).trim();
				word++;
			} else {
				b = false;
			}
			if (word == number) {
				firstCharacter = text.charAt(0);
				return firstCharacter;
			}
		}
		if (firstCharacter == ' ') {
			System.out.println("Number index out of bounds.");
		}
		return firstCharacter;
	}

	public static void main(String[] args) {
		String text = getText();
		int number = getNumber();
		char ch = getFirstCharacterOfWordWithNumberN(text, number);
		if (ch != ' ') {
			System.out.println("The first character of word with number " + number + " is: '" + ch + "'.");
		}
	}
}
