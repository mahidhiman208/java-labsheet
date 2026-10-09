/*
 * MCA III Semester
 * Object Oriented Programming Using Java
 * Lab Sheet-04
 *
 * All 15 questions are included.
 * Run the program and enter a question number from 1 to 15.
 */

import java.util.Scanner;

public class LabSheet04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      OOP USING JAVA - LAB SHEET 04");
        System.out.println("==========================================");
        System.out.print("Enter question number (1-15): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                q1();
                break;
            case 2:
                q2();
                break;
            case 3:
                q3();
                break;
            case 4:
                q4();
                break;
            case 5:
                q5();
                break;
            case 6:
                q6();
                break;
            case 7:
                q7();
                break;
            case 8:
                q8();
                break;
            case 9:
                q9();
                break;
            case 10:
                q10();
                break;
            case 11:
                q11();
                break;
            case 12:
                q12();
                break;
            case 13:
                q13();
                break;
            case 14:
                q14();
                break;
            case 15:
                q15();
                break;
            default:
                System.out.println("Invalid question number.");
        }

        sc.close();
    }

    // =========================================================
    // Q1. Student Record
    // =========================================================

    static void q1() {

        Student student = new Student("Shradha Chauhan", 101);
        student.display();
    }


    static class Student {

        private String name;
        private int rollNumber;

        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
        }
    }


    // =========================================================
    // Q2. Medicine - Parameterized Constructor
    // =========================================================

    static void q2() {

        Medicine medicine = new Medicine("Paracetamol", 50.0);

        medicine.display();
    }


    static class Medicine {

        private String name;
        private double price;

        Medicine(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println("Medicine Name: " + name);
            System.out.println("Price: " + price);
        }
    }


    // =========================================================
    // Q3. Pharmacy - Static Pharmacy Name and Location
    // =========================================================

    static void q3() {

        Pharmacy p1 = new Pharmacy("Roorkee");
        Pharmacy p2 = new Pharmacy("Haridwar");

        p1.display();
        p2.display();

        System.out.println("Static pharmacy name is shared by both objects.");
    }


    static class Pharmacy {

        static String pharmacyName = "City Pharmacy";
        String location;

        Pharmacy(String location) {
            this.location = location;
        }

        void display() {
            System.out.println("Pharmacy Name: " + pharmacyName);
            System.out.println("Location: " + location);
            System.out.println();
        }
    }


    // =========================================================
    // Q4. Pharmacy Inventory
    // =========================================================

    static void q4() {

        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }


    static class MedicineStock {

        String medicineName;
        int quantity;

        MedicineStock(String medicineName, int quantity) {
            this.medicineName = medicineName;
            this.quantity = quantity;
        }

        void display() {
            System.out.println(
                "Medicine: " + medicineName +
                ", Quantity: " + quantity
            );
        }
    }


    static class Inventory {

        MedicineStock[] stock;

        Inventory() {

            stock = new MedicineStock[3];

            stock[0] = new MedicineStock("Paracetamol", 50);
            stock[1] = new MedicineStock("Amoxicillin", 30);
            stock[2] = new MedicineStock("Vitamin C", 40);
        }

        void displayInventory() {

            System.out.println("Pharmacy Inventory:");

            for (MedicineStock medicine : stock) {
                medicine.display();
            }
        }
    }


    // =========================================================
    // Q5. Patient Eligibility
    // =========================================================

    static void q5() {

        Patient patient = new Patient("Rahul", 20);

        patient.checkEligibility();
    }


    static class Patient {

        String name;
        int age;

        Patient(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void checkEligibility() {

            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);

            if (age >= 18) {
                System.out.println("Patient is eligible.");
            } else {
                System.out.println("Patient is not eligible.");
            }
        }
    }


    // =========================================================
    // Q6. Encapsulated Medicine Product
    // =========================================================

    static void q6() {

        EncapsulatedMedicine medicine =
            new EncapsulatedMedicine("Cough Syrup", 120.50);

        medicine.displayData();
    }


    static class EncapsulatedMedicine {

        private String name;
        private double price;

        EncapsulatedMedicine(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void displayData() {

            System.out.println("Medicine Name: " + name);
            System.out.println("Price: " + price);
        }
    }


    // =========================================================
    // Q7. Bank Account
    // =========================================================

    static void q7() {

        BankAccount account = new BankAccount(5000);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);
        System.out.println("Balance after valid deposit: "
                + account.getBalance());

        account.deposit(-500);

        System.out.println("Final Balance: " + account.getBalance());
    }


    static class BankAccount {

        private double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        double getBalance() {
            return balance;
        }
    }


    // =========================================================
    // Q8. Patient Bill
    // =========================================================

    static void q8() {

        PatientBill bill = new PatientBill();

        bill.setDoctorFee(500);
        bill.setMedicineFee(800);
        bill.setRoomFee(1000);

        bill.displayBill();
    }


    static class PatientBill {

        private double doctorFee;
        private double medicineFee;
        private double roomFee;

        void setDoctorFee(double doctorFee) {
            this.doctorFee = doctorFee;
        }

        void setMedicineFee(double medicineFee) {
            this.medicineFee = medicineFee;
        }

        void setRoomFee(double roomFee) {
            this.roomFee = roomFee;
        }

        double calculateTotal() {
            return doctorFee + medicineFee + roomFee;
        }

        void displayBill() {

            System.out.println("Doctor Fee: " + doctorFee);
            System.out.println("Medicine Fee: " + medicineFee);
            System.out.println("Room Fee: " + roomFee);
            System.out.println("Total Bill: " + calculateTotal());
        }
    }


    // =========================================================
    // Q9. Employee -> Pharmacist
    // Single Inheritance
    // =========================================================

    static void q9() {

        Pharmacist pharmacist =
            new Pharmacist("Amit", 101, "Pharmacy Department");

        pharmacist.displayPharmacist();
    }


    static class Employee {

        String name;
        int employeeId;

        Employee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        void displayEmployee() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
        }
    }


    static class Pharmacist extends Employee {

        String department;

        Pharmacist(String name, int employeeId, String department) {

            super(name, employeeId);
            this.department = department;
        }

        void displayPharmacist() {

            displayEmployee();

            System.out.println("Department: " + department);
        }
    }


    // =========================================================
    // Q10. Hierarchical Hospital Staff
    // Employee -> Doctor
    // Employee -> Pharmacist
    // =========================================================

    static void q10() {

        Doctor doctor =
            new Doctor("Dr. Neha", 201, "Cardiology");

        HospitalPharmacist pharmacist =
            new HospitalPharmacist("Ravi", 202, "Pharmacy");

        doctor.display();
        System.out.println();

        pharmacist.display();
    }


    static class Doctor extends Employee {

        String specialization;

        Doctor(String name, int employeeId, String specialization) {

            super(name, employeeId);
            this.specialization = specialization;
        }

        void display() {

            displayEmployee();

            System.out.println("Specialization: " + specialization);
        }
    }


    static class HospitalPharmacist extends Employee {

        String department;

        HospitalPharmacist(String name, int employeeId, String department) {

            super(name, employeeId);
            this.department = department;
        }

        void display() {

            displayEmployee();

            System.out.println("Department: " + department);
        }
    }


    // =========================================================
    // Q11. Multilevel Inheritance
    // Person -> Employee -> Manager
    // =========================================================

    static void q11() {

        Manager manager =
            new Manager("Suresh", 301, "Hospital Manager");

        manager.displayManager();
    }


    static class Person {

        String name;

        Person(String name) {
            this.name = name;
        }

        void displayPerson() {
            System.out.println("Name: " + name);
        }
    }


    static class HospitalEmployee extends Person {

        int employeeId;

        HospitalEmployee(String name, int employeeId) {

            super(name);
            this.employeeId = employeeId;
        }

        void displayEmployeeData() {

            displayPerson();

            System.out.println("Employee ID: " + employeeId);
        }
    }


    static class Manager extends HospitalEmployee {

        String designation;

        Manager(String name, int employeeId, String designation) {

            super(name, employeeId);
            this.designation = designation;
        }

        void displayManager() {

            displayEmployeeData();

            System.out.println("Designation: " + designation);
        }
    }


    // =========================================================
    // Q12. Multiple Inheritance - Concept Only
    // =========================================================

    static void q12() {

        System.out.println("Java does not support multiple inheritance");
        System.out.println("through classes.");
        System.out.println();
        System.out.println("A class cannot extend two classes at the same time.");
        System.out.println("Example (not valid):");
        System.out.println("class C extends A, B { }");
        System.out.println();
        System.out.println("Interfaces can be used for multiple inheritance");
        System.out.println("of type/behavior, but interfaces are not used here.");
    }


    // =========================================================
    // Q13. Hybrid Inheritance - Concept Only
    // =========================================================

    static void q13() {

        System.out.println("Hybrid inheritance is a combination of");
        System.out.println("two or more types of inheritance.");
        System.out.println();
        System.out.println("Java does not implement hybrid inheritance");
        System.out.println("through multiple class inheritance.");
        System.out.println("Interfaces can be used in Java to achieve");
        System.out.println("similar structures, but interfaces are not used here.");
    }


    // =========================================================
    // Q14. Shape Hierarchy
    // Shape -> Rectangle / Circle
    // =========================================================

    static void q14() {

        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle Area = " +
                rectangle.calculateArea());

        System.out.println("Circle Area = " +
                circle.calculateArea());
    }


    static class Shape {

        double calculateArea() {
            return 0;
        }
    }


    static class Rectangle extends Shape {

        double length;
        double width;

        Rectangle(double length, double width) {

            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {

            return length * width;
        }
    }


    static class Circle extends Shape {

        double radius;

        Circle(double radius) {

            this.radius = radius;
        }

        @Override
        double calculateArea() {

            return Math.PI * radius * radius;
        }
    }


    // =========================================================
    // Q15. Final Hospital Staff System
    // =========================================================

    static void q15() {

        HospitalSystem system = new HospitalSystem();

        system.runSystem();
    }


    static class HospitalSystem {

        private Doctor doctor;
        private HospitalPharmacist pharmacist;
        private Manager manager;

        HospitalSystem() {

            doctor =
                new Doctor("Dr. Priya", 401, "General Medicine");

            pharmacist =
                new HospitalPharmacist("Anil", 402, "Pharmacy");

            manager =
                new Manager("Meena", 403, "Hospital Manager");
        }

        void runSystem() {

            System.out.println("===== HOSPITAL STAFF SYSTEM =====");

            System.out.println();
            System.out.println("Doctor:");
            doctor.display();

            System.out.println();
            System.out.println("Pharmacist:");
            pharmacist.display();

            System.out.println();
            System.out.println("Manager:");
            manager.displayManager();
        }
    }
}
