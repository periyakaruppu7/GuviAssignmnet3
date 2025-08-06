package GuviAssignment3.Taxable;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee information
        System.out.println("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Yearly Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();
        System.out.println("Income Tax for " + name + ": $" + incomeTax);

        // Accept product information
        System.out.println("\nEnter Product ID: ");
        int pid = scanner.nextInt();
        System.out.println("Enter Unit Price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();
        System.out.println("Sales Tax for Product ID " + pid + ": $" + salesTax);

        scanner.close();
    }
}