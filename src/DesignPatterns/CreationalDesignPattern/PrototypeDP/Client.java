package DesignPatterns.CreationalDesignPattern.PrototypeDP;

import java.util.Scanner;

public class Client {
//    Prototype Pattern says that cloning of an existing object instead of creating new one.
//    This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int eid = sc.nextInt();

        System.out.println("Enter Employee Name");
        String eName = sc.next();

        System.out.println("Enter Employee Designation: ");
        String eDesignation= sc.next();

        System.out.println("Enter Employee Address: ");
        String eAddress= sc.next();

        System.out.println("Enter Employee Salary: ");
        double eSalary= sc.nextDouble();

        EmployeeRecord e1 = new EmployeeRecord(eid, eName, eDesignation, eSalary, eAddress);
        e1.showRecord();
        EmployeeRecord e2 = (EmployeeRecord)e1.getClone();
        e2.showRecord();
    }
}
