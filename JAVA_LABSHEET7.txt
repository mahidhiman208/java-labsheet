import java.util.Scanner;

// Custom Exception for Task 7 & 10 from Basic Section
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

// Multithreading demonstration class extending Thread (Advanced Task 1)
class SampleThread extends Thread {
    private String threadName;

    public SampleThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " running, count: " + i);
            try {
                Thread.sleep(300); // Sleep demo (Advanced Task 6)
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished execution.");
    }
}

public class LabSheet07MasterDemo {
    
    // 1. Divide by Zero Exception Demo
    public static void testDivideByZero() {
        System.out.println("\n--- 1. Divide by Zero Exception Demo ---");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed: Resource cleanup.");
        }
    }

    // 2. Array Index Out of Bounds Demo
    public static void testArrayIndex() {
        System.out.println("\n--- 2. Array Index Out of Bounds Demo ---");
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array index (0 to 4): ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Invalid array index accessed!");
        }
    }

    // 3. Custom Exception Demo (Password Validation)
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password is too short! Must be at least 6 characters.");
        }
        System.out.println("Password accepted successfully.");
    }

    public static void testCustomException() {
        System.out.println("\n--- 3. Custom Exception Demo ---");
        try {
            validatePassword("abc"); // Will trigger exception
        } catch (InvalidPasswordException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }

    // 4. Multithreading Demo
    public static void testMultithreading() {
        System.out.println("\n--- 4. Multithreading Demo ---");
        SampleThread t1 = new SampleThread("Thread-Alpha");
        SampleThread t2 = new SampleThread("Thread-Beta");
        
        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All threads completed execution.");
    }

    // Main Method Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println(" COER University - Lab Sheet-07 Master Menu ");
            System.out.println("========================================");
            System.out.println("1. Test Divide by Zero Exception[span_3](start_span)[span_3](end_span)");
            System.out.println("2. Test Array Index Out of Bounds[span_4](start_span)[span_4](end_span)");
            System.out.println("3. Test User-Defined Custom Exception[span_5](start_span)[span_5](end_span)");
            System.out.println("4. Test Multithreading[span_6](start_span)[span_6](end_span)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    testDivideByZero();
                    break;
                case 2:
                    testArrayIndex();
                    break;
                case 3:
                    testCustomException();
                    break;
                case 4:
                    testMultithreading();
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
