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

	public static void printArray(double[] array, String arrayName) {
		System.out.println(arrayName + " array: ");
		System.out.print("\t");
		for (double value : array) {
			System.out.printf("%-10.3f", value);
		}
		System.out.println();
	}

	public static double[] getSumOfArrayElements(double[] array1, double[] array2) {
		double[] array = new double[array1.length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = array1[i] + array2[i];
		}
		return array;
	}

	public static void main(String[] args) {
		int arrayLength = getArrayLength();
		double[] array1 = createArray(arrayLength);
		double[] array2 = createArray(arrayLength);
		double[] array = getSumOfArrayElements(array1, array2);
		printArray(array1, "First");
		printArray(array2, "Second");
		printArray(array, "Result");
	}
}
