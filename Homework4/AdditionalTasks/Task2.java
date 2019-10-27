package com.epam.Task2;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

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

	public static void fillArray(double[] array, double[] arrayResult, int i) {
		for (double value : array) {
			arrayResult[i] = value;
			i++;
		}
	}

	public static double[] concatArrays(double[] array1, double[] array2) {
		double[] arrayResult = new double[array1.length + array2.length];
		fillArray(array1, arrayResult, 0);
		fillArray(array2, arrayResult, array1.length);
		return arrayResult;
	}

	public static void main(String[] args) {
		int arrayLength1 = getArrayLength();
		double[] array1 = createArray(arrayLength1);
		printArray(array1, "Initial first array: ");

		int arrayLength2 = getArrayLength();
		double[] array2 = createArray(arrayLength2);
		printArray(array2, "Initial second array: ");

		double[] arrayResult = concatArrays(array1, array2);
		printArray(arrayResult, "The concatenation result of the first and second arrays: ");
	}
}
