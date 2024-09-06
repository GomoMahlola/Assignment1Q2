/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.attendancemanagementsystemq2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class AttendanceManagementSystemQ2 {


/**
 *
 * @author RC_Student_lab
 */






public class AttendanceManagementSystem {
    public static void main(String[] args) {
        AttendanceManger manager = new AttendanceManger();
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            
            do {
                System.out.println("1. Add Person");
                System.out.println("2. Mark Attendance");
                System.out.println("3. View Attendance");
                System.out.println("4. List All People");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine();
                
                switch (choice) {
                    case "1":
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Is this person a student or an employee (s/e)? ");
                        String type = scanner.nextLine();
                        if (type.equalsIgnoreCase("s")) {
                            //manager.addPerson(new Student(name));
                        } else if (type.equalsIgnoreCase("e")) {
                            manager.addPerson(new Employee(name));
                        } else {
                            System.out.println("Invalid type.");
                        }
                        break;
                        
                    case "2":
                        System.out.print("Enter name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        System.out.print("Present (true/false): ");
                        boolean present = Boolean.parseBoolean(scanner.nextLine());
                        manager.markAttendance(name, date, present);
                        break;
                        
                    case "3":
                        System.out.print("Enter name: ");
                        name = scanner.nextLine();
                        manager.viewAttendance(name);
                        break;
                        
                    case "4":
                        manager.listAllPeople();
                        break;
                        
                    case "5":
                        System.out.println("Exiting...");
                        break;
                        
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } while (!choice.equals("5"));
        }
    }
    }
}
