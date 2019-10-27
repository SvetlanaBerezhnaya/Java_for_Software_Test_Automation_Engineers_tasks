package com.epam.Task3;

import java.util.Scanner;
import java.util.Random;

public class Task3 {

	public static int getArrayLength() {
		int arrayLength = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Please input array length: ");
			arrayLength = scanner.nextInt();
			if (arrayLength > 0) {
				return arrayLength;
			}
			System.out.print("Invalid array length. ");
		}
	}

	public static double[] createArray(int arrayLength) {
		double[] array = new double[arrayLength];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 200 - 100;
		}
		return array;
	}

	public static void printArray(double[] array, String arrayTitle) {
		System.out.println(arrayTitle);
		System.out.print("\t");
		if (array.length > 0) {
			for (double value : array) {
				System.out.printf("%-10.3f", value);
			}
			System.out.println();
		} else {
			System.out.println("The array is empty.");
		}
	}

	public static double[] getPositiveArrayElements(double[] array, boolean positive) {
		double[] arrayResult = null;
		int arrayLength = 0;
		for (double value : array) {
			if (positive && value > 0) {
				arrayLength++;
			} else if (!positive && value < 0) {
				arrayLength++;
			}
		}

		int i = 0;
		arrayResult = new double[arrayLength];
		for (double value : array) {
			if (positive && value > 0) {
				arrayResult[i] = value;
				i++;
			} else if (!positive && value < 0) {
				arrayResult[i] = value;
				i++;
			}
		}
		return arrayResult;
	}

	public static void main(String[] args) {
		int arrayLength = getArrayLength();
		double[] array = createArray(arrayLength);
		printArray(array, "Initial array: ");

		double[] arrayResult = getPositiveArrayElements(array, true);
		printArray(arrayResult, "Array with positive elements: ");

		arrayResult = getPositiveArrayElements(array, false);
		printArray(arrayResult, "Array with negative elements: ");
	}
}
