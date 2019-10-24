package com.epam;

public class Task4 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int cathetus = 5;
        while (i <= cathetus) {
            j = 1;
            while (j <= cathetus) {
                if (j <= cathetus - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        i = 1;
        j = 1;
        while (i <= cathetus) {
            j = 1;
            while (j <= cathetus) {
                if (j <= i - 1) {
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
