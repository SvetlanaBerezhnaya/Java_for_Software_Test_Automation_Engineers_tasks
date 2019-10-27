package com.epam.Task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {

	public static int getArrayLength() {
		int arrayLength = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Please input array length: ");
			arrayLength = scanner.nextInt();
			if (arrayLength > 0) {
				scanner.close();
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

	public static void printAverageOfArrayAndElementsMoreThanAverage(double[] array) {
		double average = 0;
		double sum = 0;
		for (double value : array) {
			sum += value;
		}
		if (array.length > 0) {
			average = sum / array.length;
		}
		System.out.printf("Average of the array: %-10.3f", average);
		System.out.println();

		int count = 0;
		System.out.println("Array element(s) more than average: ");
		System.out.print("\t");
		for (double value : array) {
			if (value > average) {
				count++;
				System.out.printf("%-10.3f", value);
			}
		}
		System.out.println();
		System.out.println("Total count of elements more than average: " + count);
	}

	public static void main(String[] args) {
		int arrayLength = getArrayLength();
		double[] array = createArray(arrayLength);
		printArray(array, "Initial array: ");
		printAverageOfArrayAndElementsMoreThanAverage(array);
	}
}
