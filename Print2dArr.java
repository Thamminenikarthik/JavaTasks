package TASKS;

import java.util.Scanner;

public class Print2dArr {

    /* Q > Write a Java program to read the elements of a 3 × 3 matrix using the Scanner class and display the matrix in the same format.*/

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

        System.out.println("Here is the "+ R + "*" + C +" Array :");
        for (Integer[] Val1 : arr) {
            for (Integer Val2 : Val1) {
                System.out.print(Val2 + " ");
            }
            System.out.println();
        }
    }


}
