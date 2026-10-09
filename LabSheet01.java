import java.util.Scanner;

public class LabSheet01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" OOP USING JAVA - LAB SHEET 01");
        System.out.println("======================================");
        System.out.print("Enter question number (1-20): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> q1();
            case 2 -> q2();
            case 3 -> q3();
            case 4 -> q4();
            case 5 -> q5();
            case 6 -> q6();
            case 7 -> q7();
            case 8 -> q8();
            case 9 -> q9();
            case 10 -> q10();
            case 11 -> q11();
            case 12 -> q12();
            case 13 -> q13();
            case 14 -> q14();
            case 15 -> q15();
            case 16 -> q16();
            case 17 -> q17();
            case 18 -> q18();
            case 19 -> q19();
            case 20 -> q20();
            default -> System.out.println("Invalid question number.");
        }

        sc.close();
    }

    // Q1. Display name, age and college name
    static void q1() {
        String name = "Shradha Chauhan";
        int age = 22;
        String college = "COER University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    // Q2. Arithmetic operations
    static void q2() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + ((double) a / b));
            System.out.println("Modulus = " + (a % b));
        } else {
            System.out.println("Division and modulus by zero are not possible.");
        }
    }

    // Q3. Even or odd
    static void q3() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is odd.");
    }

    // Q4. Relational operators
    static void q4() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }

    // Q5. Explicit type casting
    static void q5() {
        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        int converted = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("Converted integer value: " + converted);
    }

    // Q6. Character and ASCII value
    static void q6() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);
    }

    // Q7. Divisible by both 3 and 5
    static void q7() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println(n + " is divisible by both 3 and 5.");
        else
            System.out.println(n + " is not divisible by both 3 and 5.");
    }

    // Q8. Vowel or consonant
    static void q8() {
        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println(ch + " is a vowel.");
            else
                System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Please enter an alphabet character.");
        }
    }

    // Q9. Total, percentage and pass/fail
    static void q9() {
        System.out.print("Enter marks of Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    // Q10. Greatest of two numbers
    static void q10() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greatest = " + a);
        else if (b > a)
            System.out.println("Greatest = " + b);
        else
            System.out.println("Both numbers are equal.");
    }

    // Q11. Largest of three using nested if-else
    static void q11() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        if (a > b) {
            if (a > c)
                largest = a;
            else
                largest = c;
        } else {
            if (b > c)
                largest = b;
            else
                largest = c;
        }

        System.out.println("Largest = " + largest);
    }

    // Q12. Leap year
    static void q12() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    // Q13. Positive, negative or zero
    static void q13() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive number.");
        else if (n < 0)
            System.out.println("Negative number.");
        else
            System.out.println("Zero.");
    }

    // Q14. Character classification
    static void q14() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("It is a digit.");
        else if (Character.isUpperCase(ch))
            System.out.println("It is an uppercase letter.");
        else if (Character.isLowerCase(ch))
            System.out.println("It is a lowercase letter.");
        else
            System.out.println("It is a special character.");
    }

    // Q15. Armstrong number (3-digit)
    static void q15() {
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }

    // Q16. Income tax based on slabs
    static void q16() {
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();
        double tax;

        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = income * 0.05;
        else if (income <= 1000000)
            tax = income * 0.20;
        else
            tax = income * 0.30;

        System.out.println("Income = " + income);
        System.out.println("Tax = " + tax);
    }

    // Q17. Palindrome number
    static void q17() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }

    // Q18. Prime number
    static void q18() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }

    // Q19. Operator-based calculator
    static void q19() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result = " + (a / b));
            else
                System.out.println("Division by zero is not possible.");
        } else {
            System.out.println("Invalid operator.");
        }
    }

    // Q20. Marriage eligibility
    static void q20() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(sc.next().charAt(0));

        if (gender == 'M') {
            if (age >= 21)
                System.out.println("Eligible for marriage.");
            else
                System.out.println("Not eligible for marriage.");
        } else if (gender == 'F') {
            if (age >= 18)
                System.out.println("Eligible for marriage.");
            else
                System.out.println("Not eligible for marriage.");
        } else {
            System.out.println("Invalid gender.");
        }
    }
}
