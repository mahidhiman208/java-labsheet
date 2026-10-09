// ============================================================================
// Lab Sheet-06 : Object Oriented Programming Using Java (MCA III Semester)
// Name: Shradha Chauhan | Roll No: 25308078
//
// NOTE: Java allows only ONE public class per .java file, and many questions
// reuse class names (Animal, Shape, Employee, BankAccount...). So this combined
// file has 11 programs, each starting at a "FILE:" marker. Save each section as
// its own file to compile it. split_programs.py (included) does this
// automatically: python3 split_programs.py Lab06_AllPrograms.java
// ============================================================================

// ===== FILE: AnimalMain.java =====
// Q1. Method overriding - Animal and Cat
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override // overriding the parent method
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal c = new Cat(); // parent reference, child object -> child method runs
        a.makeSound();
        c.makeSound();
    }
}

// ===== FILE: VehicleMain.java =====
// Q2. Method overriding - Vehicle and Car
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle c = new Car();
        v.drive();
        c.drive();
    }
}

// ===== FILE: ShapeMain.java =====
// Q3. Method overriding - Shape and Rectangle
class Shape {
    double getArea() {
        return 0; // generic shape has no specific area
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width; // area of a rectangle
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 5);
        System.out.println("Area of rectangle: " + s.getArea());
    }
}

// ===== FILE: EmployeeMain.java =====
// Q4. Method overriding - Employee and HRManager
class Employee {
    protected double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing recruitment and employee records");
    }

    // New method that exists only in the child class
    void addEmployee(String name) {
        System.out.println("Employee added: " + name);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(30000);
        HRManager hr = new HRManager(60000);
        e.work();
        System.out.println("Salary: " + e.getSalary());
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee("Amit Kumar");
    }
}

// ===== FILE: BankMain.java =====
// Q5. Method overriding - BankAccount and SavingsAccount
class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        // Withdrawal is not allowed if balance would fall below 100
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: balance cannot fall below 100");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000);
        s.deposit(500);
        s.withdraw(1000); // allowed, balance becomes 500
        s.withdraw(450);  // denied, balance would become 50
    }
}

// ===== FILE: AbstractAnimalMain.java =====
// Q6. Abstract class - Animal, Lion and Tiger
abstract class Animal {
    abstract void sound(); // abstract method: no body
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars: Roarrr!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls: Grrrr!");
    }
}

public class AbstractAnimalMain {
    public static void main(String[] args) {
        // Animal a = new Animal(); // not allowed: abstract class cannot be instantiated
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}

// ===== FILE: AbstractShapeMain.java =====
// Q7. Abstract class - Shape, Circle and Triangle
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, c; // three sides

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2; // Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class AbstractShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Circle   -> Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle -> Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}

// ===== FILE: AbstractBankMain.java =====
// Q8. Abstract class - BankAccount, SavingsAccount and CurrentAccount
abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() { // normal (concrete) method inside abstract class
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: deposited " + amount);
    }

    @Override
    void withdraw(double amount) {
        // Savings account must keep minimum balance of 500
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Savings: withdrawn " + amount);
        } else {
            System.out.println("Savings: withdrawal denied (minimum balance 500)");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 2000;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current: deposited " + amount);
    }

    @Override
    void withdraw(double amount) {
        // Current account allows overdraft up to the limit
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Current: withdrawn " + amount);
        } else {
            System.out.println("Current: withdrawal denied (overdraft limit exceeded)");
        }
    }
}

public class AbstractBankMain {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(3000);
        BankAccount ca = new CurrentAccount(1000);
        sa.deposit(1000);
        sa.withdraw(4000); // denied
        sa.showBalance();
        ca.withdraw(2500); // allowed using overdraft
        ca.withdraw(1000); // denied
        ca.showBalance();
    }
}

// ===== FILE: AbstractAnimalBehaviorMain.java =====
// Q9. Abstract class - Animal with eat() and sleep()
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() { System.out.println("Lion eats meat (hunts in a pride)"); }
    @Override
    void sleep() { System.out.println("Lion sleeps up to 20 hours a day"); }
}

class Tiger extends Animal {
    @Override
    void eat() { System.out.println("Tiger eats meat (hunts alone)"); }
    @Override
    void sleep() { System.out.println("Tiger sleeps in dense cover during the day"); }
}

class Deer extends Animal {
    @Override
    void eat() { System.out.println("Deer eats grass and leaves (herbivore)"); }
    @Override
    void sleep() { System.out.println("Deer takes short naps and stays alert"); }
}

public class AbstractAnimalBehaviorMain {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
        }
    }
}

// ===== FILE: AbstractEmployeeMain.java =====
// Q10. Abstract class - Employee, Manager and Programmer
abstract class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus; // manager gets a fixed bonus
    }

    @Override
    void displayInfo() {
        System.out.println("Manager: " + name + " | Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private int overtimeHours;

    Programmer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimeHours * 500; // 500 per overtime hour
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer: " + name + " | Overtime: " + overtimeHours + " hrs | Total Salary: " + calculateSalary());
    }
}

public class AbstractEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Vikas", 60000, 15000),
            new Programmer("Shradha", 45000, 10)
        };
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInfo();
        }
    }
}

// ===== FILE: NumberAnalysisMain.java =====
// Q11. Read ten numbers, find average and count of numbers above average [this keyword]
import java.util.Scanner;

class NumberAnalyzer {
    private double[] numbers;
    private double average;
    private int aboveAverageCount;

    NumberAnalyzer(int size) {
        this.numbers = new double[size]; // 'this' separates the field from other names
    }

    void readNumbers() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            this.numbers[i] = sc.nextDouble();
        }
        sc.close();
    }

    void computeAverage() {
        double sum = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            sum += this.numbers[i];
        }
        this.average = sum / this.numbers.length;
    }

    void countAboveAverage() {
        this.aboveAverageCount = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] > this.average) {
                this.aboveAverageCount++;
            }
        }
    }

    void displayResult() {
        System.out.println("Average: " + this.average);
        System.out.println("Numbers above average: " + this.aboveAverageCount);
    }
}

public class NumberAnalysisMain {
    public static void main(String[] args) {
        NumberAnalyzer analyzer = new NumberAnalyzer(10);
        analyzer.readNumbers();
        analyzer.computeAverage();
        analyzer.countAboveAverage();
        analyzer.displayResult();
    }
}
