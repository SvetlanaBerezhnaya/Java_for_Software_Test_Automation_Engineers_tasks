package com.epam.Task2;

import java.util.Scanner;

public class Task2 {

	public static byte getPyramidHeight() {
		Scanner scan = new Scanner(System.in);
		byte pyramidHeight = 0;
		while (true) {
			System.out.println("Enter the height of the pyramid please: ");
			pyramidHeight = scan.nextByte();
			if (pyramidHeight >= 1 && pyramidHeight <= 9) {
				scan.close();
				return pyramidHeight;
			}
			System.out.println("Pyramid height should be in the range from 1 to 9.");
		}
	}

	public static void pyramidOutput(byte pyramidHeight) {
		byte numberOfSpaces = 0;
		byte row = 1;
		while (row <= pyramidHeight + 1) {
			numberOfSpaces = (byte) (pyramidHeight - row + 1);
			if (numberOfSpaces > 0) {
				System.out.printf("%" + numberOfSpaces + "s", "");
			}

			String str = "";
			byte col = 1;
			boolean grow = true;
			while (col > 0) {
				str += col;
				if (grow) {
					if (col == row) {
						grow = false;
						col -= 2;
					}
					col++;
				} else {
					col--;
				}
			}
			System.out.println(str);
			row++;
		}
	}

	public static void main(String[] args) {
		byte pyramidHeight = getPyramidHeight();
		pyramidOutput(pyramidHeight);
	}
}
