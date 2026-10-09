import java.util.Scanner;

public class LabSheet03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   OOP USING JAVA - LAB SHEET 03");
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

    // Q1. Input and display 5 integers
    static void q1() {
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        System.out.println("Array elements:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    // Q2. Input 10 integers and display in reverse order
    static void q2() {
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();

        System.out.println("Reverse order:");
        for (int i = 9; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Q3. Sum of all elements
    static void q3() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    // Q4. Maximum element
    static void q4() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum element = " + max);
    }

    // Q5. Count even and odd numbers
    static void q5() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int even = 0, odd = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }

    // Q6. Copy one array into another
    static void q6() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = arr1[i];

        System.out.println("Copied array:");
        for (int value : arr2)
            System.out.print(value + " ");
        System.out.println();
    }

    // Q7. Input and display 3 x 3 matrix
    static void q7() {
        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Matrix:");
        printMatrix(matrix);
    }

    // Q8. Sum of all matrix elements
    static void q8() {
        int[][] matrix = readMatrix();
        int sum = 0;

        for (int[] row : matrix)
            for (int value : row)
                sum += value;

        System.out.println("Sum of all elements = " + sum);
    }

    // Q9. Sum of each row
    static void q9() {
        int[][] matrix = readMatrix();

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int value : matrix[i])
                sum += value;

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }

    // Q10. Sum of each column
    static void q10() {
        int[][] matrix = readMatrix();

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < matrix.length; i++)
                sum += matrix[i][j];

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }

    // Q11. Transpose a matrix
    static void q11() {
        int[][] matrix = readMatrix();

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose:");
        printMatrix(transpose);
    }

    // Q12. Add two matrices
    static void q12() {
        System.out.println("Enter first 3 x 3 matrix:");
        int[][] a = read3x3();

        System.out.println("Enter second 3 x 3 matrix:");
        int[][] b = read3x3();

        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum of matrices:");
        printMatrix(sum);
    }

    // Q13. Multiply two 3 x 3 matrices
    static void q13() {
        System.out.println("Enter first 3 x 3 matrix:");
        int[][] a = read3x3();

        System.out.println("Enter second 3 x 3 matrix:");
        int[][] b = read3x3();

        int[][] product = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                    product[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Product of matrices:");
        printMatrix(product);
    }

    // Q14. Input and display 2 x 2 x 2 3-D array
    static void q14() {
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();

        System.out.println("3-D array:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
        }
    }

    // Q15. Sum of all elements in 3-D array
    static void q15() {
        int[][][] arr = read3DArray();
        int sum = 0;

        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int value : row)
                    sum += value;

        System.out.println("Sum = " + sum);
    }

    // Q16. Count positive and negative numbers in 3-D array
    static void q16() {
        int[][][] arr = read3DArray();

        int positive = 0, negative = 0;

        for (int[][] layer : arr) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > 0)
                        positive++;
                    else if (value < 0)
                        negative++;
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
    }

    // Q17. Maximum element in 3-D array
    static void q17() {
        int[][][] arr = read3DArray();

        int max = arr[0][0][0];

        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int value : row)
                    if (value > max)
                        max = value;

        System.out.println("Maximum element = " + max);
    }

    // Q18. Search element in 3-D array
    static void q18() {
        int[][][] arr = read3DArray();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    if (arr[i][j][k] == target) {
                        System.out.println("Element found at position: [" +
                                i + "][" + j + "][" + k + "]");
                        found = true;
                    }
                }
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }

    // Q19. Jagged array with 3 rows of different lengths
    static void q19() {
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter " + jagged[i].length +
                    " elements for row " + (i + 1) + ":");

            for (int j = 0; j < jagged[i].length; j++)
                jagged[i][j] = sc.nextInt();
        }

        System.out.println("Jagged array:");
        printJagged(jagged);
    }

    // Q20. Student marks with different number of subjects
    static void q20() {
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter number of subjects for student " +
                    (i + 1) + ": ");
            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }

        System.out.println("Student marks:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int mark : marks[i])
                System.out.print(mark + " ");

            System.out.println();
        }
    }

    // Q21. Rotate array left by one position
    static void q21() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int first = arr[0];

        for (int i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];

        arr[n - 1] = first;

        System.out.println("Array after left rotation:");
        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();
    }

    // Q22. Frequency of each element
    static void q22() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Element frequencies:");

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }

    // Q23. Second largest element
    static void q23() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("A distinct second largest element does not exist.");
        else
            System.out.println("Second largest = " + secondLargest);
    }

    // Q24. Remove duplicates without collections
    static void q24() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] unique = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");

        System.out.println();
    }

    // Q25. Main and secondary diagonal sums
    static void q25() {
        int[][] matrix = readSquareMatrix();

        int mainSum = 0;
        int secondarySum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }

    // Q26. Upper and lower triangular parts
    static void q26() {
        int[][] matrix = readSquareMatrix();
        int n = matrix.length;

        System.out.println("Upper triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    // Q27. Boundary elements of matrix
    static void q27() {
        int[][] matrix = readMatrix();
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Boundary elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 ||
                    j == 0 || j == cols - 1)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q28. Search element in 2-D array
    static void q28() {
        int[][] matrix = readMatrix();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at row " +
                            (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }

    // Q29. Sort each row of a jagged array
    static void q29() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int length = sc.nextInt();

            jagged[i] = new int[length];

            System.out.println("Enter elements:");
            for (int j = 0; j < length; j++)
                jagged[i][j] = sc.nextInt();
        }

        // Bubble sort each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length - 1; j++) {
                for (int k = 0; k < jagged[i].length - 1 - j; k++) {
                    if (jagged[i][k] > jagged[i][k + 1]) {
                        int temp = jagged[i][k];
                        jagged[i][k] = jagged[i][k + 1];
                        jagged[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array after sorting each row:");
        printJagged(jagged);
    }

    // Q30. Check sparse matrix
    static void q30() {
        int[][] matrix = readMatrix();

        int zero = 0;
        int nonZero = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonZero);

        if (zero > nonZero)
            System.out.println("The matrix is a sparse matrix.");
        else
            System.out.println("The matrix is not a sparse matrix.");
    }

    // Helper: read a 3 x 3 matrix
    static int[][] read3x3() {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        return matrix;
    }

    // Helper: read a matrix with user-defined rows and columns
    static int[][] readMatrix() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        return matrix;
    }

    // Helper: read a square matrix
    static int[][] readSquareMatrix() {
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        return matrix;
    }

    // Helper: read 2 x 2 x 2 array
    static int[][][] read3DArray() {
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    arr[i][j][k] = sc.nextInt();

        return arr;
    }

    // Helper: print matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    // Helper: print jagged array
    static void printJagged(int[][] jagged) {
        for (int[] row : jagged) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}
