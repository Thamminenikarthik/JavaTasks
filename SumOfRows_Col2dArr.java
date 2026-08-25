package TASKS;
import java.util.Scanner;
/*
# Sum of Rows and Columns
Write a Java program to find the **sum of each row and each column** of a 2D array.

**Example:**

Input:

        ```text
        1 2 3
        4 5 6
        7 8 9
        ```

Output:

        ```text
Row 0 Sum = 6     Col 0 Sum = 12
Row 1 Sum = 15    Col 1 Sum = 15
Row 2 Sum = 24    Col 2 Sum = 18
        ```
*/

public class SumOfRows_Col2dArr {
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

        System.out.print("ROW SUM");
        System.out.print("                   ");
        System.out.print("COL SUM");
        System.out.println();

        for (int i = 0; i < R; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < C; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            System.out.print("Row " + i + " Sum = " + rowSum);
            System.out.print("              ");
            System.out.print("Col " + i + " Sum = " + colSum);
            System.out.println();
        }
    }
}
