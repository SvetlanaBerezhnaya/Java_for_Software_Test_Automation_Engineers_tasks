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

	public static void printArray(double[] array, boolean directOrder) {
		if (directOrder) {
			for (double value : array) {
				System.out.printf("%-10.3f", value);
			}
		} else {
			for (int i = array.length - 1; i >= 0; i--) {
				{
					System.out.printf("%-10.3f", array[i]);
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arrayLength = getArrayLength();
		double[] array = createArray(arrayLength);
		printArray(array, true);
		printArray(array, false);
	}
}
