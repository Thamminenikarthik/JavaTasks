package TASKS;

import java.util.Scanner;

/*
# Sum of Left and Right Diagonals in a 2D Array

Write a Java program to accept the **number of rows and columns** of a 2D integer array and then accept all its elements.

Your program should calculate and print:

        1. The sum of the **left (main) diagonal** — elements where the row index and column index are equal (`i == j`).
        2. The sum of the **right (secondary) diagonal** — elements where `i + j == C - 1`.

        ### Example Test Case

**Input:**

        ```text
Enter the row size of the array you want:
        3
Enter the col size of the array you want:
        3
Enter 3 values into array for 3 Times
        1 2 3
        4 5 6
        7 8 9
        ```

        **Expected Output:**

        ```text
left diagonal sum : 15
right diagonal sum : 15
        ```

        ### Explanation

For the given array:

        ```text
        1 2 3
        4 5 6
        7 8 9
        ```

        * Left diagonal: `1 + 5 + 9 = 15`
        * Right diagonal: `3 + 5 + 7 = 15`
*/

public class Sum2dArrDiagonal {


    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array you want :");
        int R = sc.nextInt();
        System.out.println("Enter the col size of the array you want :");
        int C = sc.nextInt();
        Integer[][] arr = new Integer[R][C];
        System.out.println("Enter " + C + "values into array for " + R + " Times");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int RightDiagonalSum = 0, LeftDiagonalSum = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (i == j) {
                    LeftDiagonalSum += arr[i][j];
                }
                if (i + j == C - 1) {
                    RightDiagonalSum += arr[i][j];
                }
            }
        }

        System.out.println("left diagonal sum : " + LeftDiagonalSum);
        System.out.println("right diagonal sum : " + RightDiagonalSum);


    }
}
