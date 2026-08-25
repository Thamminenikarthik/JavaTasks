package TASKS;

import java.util.Scanner;

/*.Write a Java program to read a 3 × 3 matrix and find the sum of all its elements.
        Input:  1 2 3
                4 5 6
                7 8 9
Output : Sum of all elements = 45
 */
public class SumOf2dArr {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array you want :");
        int R = sc.nextInt();
        System.out.println("Enter the col size of the array you want :");
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        System.out.println("Enter " + C + " values into array for " + R + " Times");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        // for each loop
        for (int[] Val1 : arr) {
            for (int Val2 : Val1) {
                sum += Val2;
            }
        }
        System.out.println("The Sum of  all Values in the " + R + "*" + C + " Array is : " + sum);

    }
}
