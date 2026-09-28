/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        // cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // console names
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // SALES
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        //  array for city totals
        int[] totals = new int[3];

        //  total sales for each city
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totals[i] = totals[i] + sales[i][j];
            }
        }

        // Display the report
        System.out.println("---------------------------------------------");
        System.out.println("             GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");

        System.out.printf("%-18s %-10s %-10s %-10s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("---------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + " : " + totals[i]);
        }

        // city with the most sales
        int highestSales = totals[0];
        int highestIndex = 0;

        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > highestSales) {
                highestSales = totals[i];
                highestIndex = i;
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " 
                + cities[highestIndex]);
        System.out.println("---------------------------------------------");
    }
}
