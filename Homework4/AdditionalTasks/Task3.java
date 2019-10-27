package com.epam.Task3;

import java.util.Scanner;
import java.util.Random;

public class Task3 {

	public static int[] createArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter integer array elements separated by spaces: ");
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		int[] array = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			array[i] = Integer.valueOf(strArray[i].trim());
		}
		scanner.close();
		return array;
	}

	public static void printArray(int[] array, String arrayTitle) {
		System.out.println(arrayTitle);
		System.out.print("\t");
		if (array.length > 0) {
			for (int value : array) {
				System.out.printf("%3d", value);
			}
			System.out.println();
		} else {
			System.out.println("The array is empty.");
		}
	}

	public static int[] findExtremumsAndDeleteTheirDuplicates(int[] array) {
		int min = array[0];
		int max = array[0];
		int countMin = 1;
		int countMax = 1;
		for (int value : array) {
			if (value < min) {
				min = value;
				countMin = 0;
			} else if (value == min) {
				countMin++;
			}
			if (value > max) {
				max = value;
				countMax = 0;
			} else if (value == max) {
				countMax++;
			}
		}
		System.out.println("Maximum value of array elements: " + max);
		System.out.println("Minimum value of array elements: " + min);

		int[] arrayResult = new int[array.length - countMin - countMax];
		int i = 0;
		boolean findMin = false;
		boolean findMax = false;
		for (int value : array) {
			if (value != min && value != max) {
				arrayResult[i] = value;
				i++;
			}
			if (value == max && !findMax) {
				arrayResult[i] = value;
				i++;
				findMax = true;
			}
			if (value == min && !findMin) {
				arrayResult[i] = value;
				i++;
				findMin = true;
			}
		}
		return arrayResult;
	}

	public static void main(String[] args) {
		int[] array = createArray();
		printArray(array, "Initial array: ");

		int[] arrayResult = findExtremumsAndDeleteTheirDuplicates(array);
		printArray(arrayResult, "Result array: ");
	}
}
