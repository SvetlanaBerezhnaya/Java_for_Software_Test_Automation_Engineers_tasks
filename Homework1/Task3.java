package com.epam;

public class Task3 {

    public static void main(String[] args) {
        int depositAmount = 10_000_000;
        int numberOfMonths = 6;
        float percentPerAnnum = 12.25f;
        double amountOfProfit = depositAmount / 100 / 12 * numberOfMonths * percentPerAnnum;
        System.out.println("Amount of profit: " + amountOfProfit);
    }
}
