/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Student
 */
import java.util.Scanner;

// Interface
interface IConsole {
    String getConsoleType();
    int getTotalSales();
}

// Abstract class
abstract class Console implements IConsole {

    // Variables
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // Constructor
    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Get console type
    public String getConsoleType() {
        return consoleType;
    }

    // Get total sales
    public int getTotalSales() {
        return totalSales;
    }
}

// Subclass
class Consoles extends Console {

    // Constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Print report
    public void printReport() {
        System.out.println("-------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("-------------------------");
        System.out.println("Console Type: " + consoleType);
        System.out.println("Store Name: " + storeName);
        System.out.println("Total Sales: R" + totalSales);
        System.out.println("-------------------------");
    }
}

// Main class
public class Mavenproject2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("CONSOLE SALES APPLICATION");

        System.out.print("Enter console type: ");
        String consoleType = input.nextLine();

        System.out.print("Enter store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = input.nextInt();

        Consoles console = new Consoles(
                consoleType,
                storeName,
                totalSales
        );

        console.printReport();
    }
}