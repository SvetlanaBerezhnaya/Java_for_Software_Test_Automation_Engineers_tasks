package com.epam;

public class Task1 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int cathetus = 5;
        while (i <= cathetus) {
            j = 1;
            while (j <= i) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("***");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        cathetus--;
        i = 1;
        j = cathetus;
        while (i <= cathetus) {
            j = cathetus;
            while (j >= i) {
                if (j == cathetus) {
                    System.out.print("*");
                } else {
                    System.out.print("***");
                }
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
