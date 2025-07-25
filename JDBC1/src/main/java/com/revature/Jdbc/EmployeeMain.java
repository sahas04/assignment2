package com.revature.Jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nemployee menu:");
            System.out.println("1.display employee table");
            System.out.println("2.display employee by id");
            System.out.println("3.update row");
            System.out.println("4.delete row");
            System.out.println("5.display total employees");
            System.out.println("6.display total emp respective to departments");
            System.out.println("7.insert values through procedure");
            System.out.println("8.exit");
            System.out.println("enter your choice:");
            choice=sc.nextLine();

            try{
                switch(choice){
                    case "1":
                        new ReadEmployee().display();
                        break;
                    case "2":
                        new ReadEmployeeById().employeeId();
                        break;
                    case "3":
                        new UpdateEmployee().insertEmployee();
                        break;
                    case "4":
                        new DeleteEmployee().deleteEmployee();
                        break;
                    case "5":
                        new TotalEmployee().totalEmployee();
                        break;
                    case "6":
                        new TotalEmployeeDepartment().totalEmployeeDepartment();
                        break;
                    case "7":
                        new InsertProcedure().insertProcedure();
                        break;
                    default:
                        System.out.println("invalid choice");
                    }
                }catch (SQLException e){
                System.out.println("error:"+e.getMessage());
            }
            }while(!choice.equals("7"));
        sc.close();
        }
    }

