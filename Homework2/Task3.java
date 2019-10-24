package com.epam;

public class Task3 {

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
    }
}
