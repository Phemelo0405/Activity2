/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create a Scanner to read user input from the console

        // Declare a 2D array to hold 2 years x 3 quarters of data
        int[][] productSales = new int[2][3]; // 2 rows (years), 3 columns (quarters) - empty for now

        // Ask the user to enter a value for every quarter of every year
        for (int year = 0; year < productSales.length; year++) {              // loop through each year (row)
            for (int quarter = 0; quarter < productSales[year].length; quarter++) { // loop through each quarter (column)
                System.out.print("Enter sales for Year " + (year + 1) + " Quarter " + (quarter + 1) + ": ");
                productSales[year][quarter] = input.nextInt(); // read the number typed by the user and store it
            }
        }

        //  Sum all values in the 2D array
        int total = 0;
        for (int year = 0; year < productSales.length; year++) {       // loop through each year (row)
            for (int quarter = 0; quarter < productSales[year].length; quarter++) { // loop through each quarter (column)
                total += productSales[year][quarter];   // add current value to running total
            }
        }
        System.out.println("Total sales: " + total);

        //  Find the maximum value in the 2D array
        int max = productSales[0][0]; // start with first element as initial max
        for (int year = 0; year < productSales.length; year++) {
            for (int quarter = 0; quarter < productSales[year].length; quarter++) {
                if (productSales[year][quarter] > max) {  // if current value is bigger, replace max
                    max = productSales[year][quarter];
                }
            }
        }
        System.out.println("Maximum sale: " + max);

        //  Find the minimum value in the 2D array
        int min = productSales[0][0]; // start with first element as initial min
        for (int year = 0; year < productSales.length; year++) {
            for (int quarter = 0; quarter < productSales[year].length; quarter++) {
                if (productSales[year][quarter] < min) {  // if current value is smaller, replace min
                    min = productSales[year][quarter];
                }
            }
        }
        System.out.println("Minimum sale: " + min);

        //  Calculate the average as a double (avoid integer division!)
        int count = 0; // keep track of how many values we added
        for (int year = 0; year < productSales.length; year++) {
            for (int quarter = 0; quarter < productSales[year].length; quarter++) {
                count++; // one more value counted
            }
        }
        // Cast total (int) to double BEFORE dividing, otherwise Java does integer division
        // and you'd lose the decimal part (e.g. 2200 / 6 = 366, not 366.67)
        double average = (double) total / count;
        System.out.println("Average sales: " + average);

        input.close(); // always close the Scanner when you're done reading input
    }
}
   
     