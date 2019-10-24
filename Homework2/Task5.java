package com.epam;

public class Task5 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int level = 1;
        int cathetus = 5;
        int numberOfLevels = 2;
        while (i <= cathetus * numberOfLevels && level <= numberOfLevels) {
            j = 1;
            while (j <= cathetus + i) {
                if (j <= cathetus - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
            if (i == cathetus + 1) {
                i = 1;
                level++;
            }
        }
    }
}
