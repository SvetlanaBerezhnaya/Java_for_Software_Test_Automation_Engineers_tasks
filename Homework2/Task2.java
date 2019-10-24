package com.epam;

public class Task2 {

    public static void main(String[] args) {
        int i = 1;
        int j;
        int cathetus = 5;
        while (i <= cathetus) {
            j = 1;
            while (j <= cathetus) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
