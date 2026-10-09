import java.util.Scanner;
import java.util.Random;

public class LabSheet02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   OOP USING JAVA - LAB SHEET 02");
        System.out.println("==========================================");
        System.out.print("Enter question number (1-30): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            case 21: q21(); break;
            case 22: q22(); break;
            case 23: q23(); break;
            case 24: q24(); break;
            case 25: q25(); break;
            case 26: q26(); break;
            case 27: q27(); break;
            case 28: q28(); break;
            case 29: q29(); break;
            case 30: q30(); break;
            default: System.out.println("Invalid question number.");
        }

        sc.close();
    }

    // Q1. Area of triangle using Heron's formula
    static void q1() {
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        if (a + b > c && a + c > b && b + c > a) {
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("The given sides do not form a triangle.");
        }
    }

    // Q2. Compound interest
    static void q2() {
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;

        System.out.println("Amount = " + amount);
        System.out.println("Compound Interest = " + ci);
    }

    // Q3. Distance between two points
    static void q3() {
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance = " + distance);
    }

    // Q4. Prefix and postfix increment
    static void q4() {
        System.out.print("Enter initial number of visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Initial visitors = " + visitors);
        System.out.println("Visitor entering (postfix): " + visitors++);
        System.out.println("After entry = " + visitors);
        System.out.println("Visitor leaving (prefix): " + --visitors);
        System.out.println("After leaving = " + visitors);
    }

    // Q5. Negative value using unary operator
    static void q5() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int negative = -n;
        System.out.println("Negative value = " + negative);
    }

    // Q6. Reduce number by half using /=
    static void q6() {
        System.out.print("Enter a number greater than 1: ");
        double n = sc.nextDouble();
        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
        System.out.println("Final value = " + n);
    }

    // Q7. Total rainfall for 7 days using +=
    static void q7() {
        double total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rainfall = sc.nextDouble();
            total += rainfall;
        }

        System.out.println("Total rainfall = " + total);
    }

    // Q8. Check whether three angles form a triangle
    static void q8() {
        System.out.print("Enter angle 1: ");
        int a = sc.nextInt();
        System.out.print("Enter angle 2: ");
        int b = sc.nextInt();
        System.out.print("Enter angle 3: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("The angles form a valid triangle.");
        else
            System.out.println("The angles do not form a valid triangle.");
    }

    // Q9. Lexicographic string comparison without compareTo()
    static void q9() {
        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s1 + " comes after " + s2);
        else
            System.out.println("Both strings are equal.");
    }

    // Q10. Leap year and within a given range
    static void q10() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= lower && year <= upper)
            System.out.println("The year is a leap year and is within the range.");
        else
            System.out.println("Condition not satisfied.");
    }

    // Q11. Course pass condition
    static void q11() {
        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();

        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student PASSES the course.");
        else
            System.out.println("Student FAILS the course.");
    }

    // Q12. Smallest of four using nested ternary
    static void q12() {
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("Smallest = " + smallest);
    }

    // Q13. Character classification using ternary operator
    static void q13() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = Character.isLetter(ch)
                ? ((ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U')
                    ? "Vowel" : "Consonant")
                : (Character.isDigit(ch) ? "Digit" : "Special symbol");

        System.out.println("Character type = " + result);
    }

    // Q14. Swap using XOR
    static void q14() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Q15. Count set bits using bitwise operators
    static void q15() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >>> 1;
        }

        System.out.println("Number of set bits = " + count);
    }

    // Q16. Multiplication and division by powers of two
    static void q16() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.print("Enter power of 2 (e.g., 3 means 2^3): ");
        int power = sc.nextInt();

        int multiplier = 1 << power;
        int multiplied = n << power;
        int divided = n >> power;

        System.out.println("2^" + power + " = " + multiplier);
        System.out.println("Multiplication result = " + multiplied);
        System.out.println("Division result = " + divided);
    }

    // Q17. Cyclic left rotation by 2 positions
    static void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int rotated = (n << 2) | (n >>> 30);

        System.out.println("Original number = " + n);
        System.out.println("After cyclic left rotation by 2 = " + rotated);
    }

    // Q18. First 20 Fibonacci terms using for loop
    static void q18() {
        int a = 0, b = 1;

        System.out.println("First 20 Fibonacci terms:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // Q19. Armstrong numbers between 1 and 1000
    static void q19() {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }

        System.out.println();
    }

    // Q20. Password using do-while
    static void q20() {
        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.next();
        } while (!password.equals(correctPassword));

        System.out.println("Correct password. Access granted.");
    }

    // Q21. Factors using do-while
    static void q21() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int i = 1;

        System.out.println("Factors of " + n + ":");

        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);

        System.out.println();
    }

    // Q22. Reverse digits using while loop
    static void q22() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (n < 0)
            reverse = -reverse;

        System.out.println("Reverse = " + reverse);
    }

    // Q23. Palindrome using while loop
    static void q23() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int temp = Math.abs(n);
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (Math.abs(original) == reverse)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }

    // Q24. Maximum and minimum using for-each
    static void q24() {
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    // Q25. Average marks from a 2D array using for-each
    static void q25() {
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];
        int total = 0;
        int count = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print("Marks of student " + (i + 1) +
                                 ", subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;
        System.out.println("Average marks = " + average);
    }

    // Q26. Weekday or weekend using switch-case
    static void q26() {
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }

    // Q27. Grade meaning using switch-case
    static void q27() {
        System.out.print("Enter grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }

    // Q28. Print 1 to 50, skipping perfect squares
    static void q28() {
        System.out.println("Numbers from 1 to 50 excluding perfect squares:");

        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.print(i + " ");
        }

        System.out.println();
    }

    // Q29. Random numbers until one is divisible by 7 and 13
    static void q29() {
        Random random = new Random();
        int number;

        System.out.println("Generating random numbers...");

        while (true) {
            number = random.nextInt(100) + 1;
            System.out.println("Generated: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found number divisible by both 7 and 13: " + number);
                break;
            }
        }
    }

    // Q30. Shift, bitwise, for loop, continue and break
    static void q30() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check power of 4 using shifts/bitwise operations.
        int temp = n;
        int position = 0;
        boolean powerOf4 = n > 0;

        while (temp > 1) {
            if ((temp & 1) != 0) {
                powerOf4 = false;
                break;
            }
            temp = temp >> 1;
            position++;
        }

        if (position % 2 != 0)
            powerOf4 = false;

        if (powerOf4)
            System.out.println(n + " is a power of 4.");
        else
            System.out.println(n + " is not a power of 4.");

        // Toggle the 3rd bit (bit position 2).
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggled);

        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 20; i++) {
            int result = n * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
