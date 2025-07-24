package com.revature.jdbc;

import java.util.Scanner;

public class StatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display All Employees");
            System.out.println("2. Display Employee by ID");
            System.out.println("3. Insert Employee");
            System.out.println("4. Update Designation");
            System.out.println("5. Delete Employee");
            System.out.println("6. Total Employees");
            System.out.println("7. Total Employees in a Department");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> new ReadAllEmployees().displayAll();
                case 2 -> new ReadEmployeeById().displayById();
                case 3 -> new InsertEmployee().insert();
                case 4 -> new UpdateEmployee().update();
                case 5 -> new DeleteEmployee().delete();
                case 6 -> new CountEmployees().count();
                case 7 -> new CountByDepartment().countByDept();
                case 8 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
