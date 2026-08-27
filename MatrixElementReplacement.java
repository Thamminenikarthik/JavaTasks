package TASKS;

import java.util.Scanner;

/*1.Write a Java program to read an N × N integer matrix from the user. Replace every even number in the matrix with 0 and every odd number with -1. Display the modified matrix.
Input
        1 2 3
        4 5 6
        7 8 9
Output
        -1  0  -1
        0  -1   0
        -1  0  -1
        */
public class MatrixElementReplacement {
    public static void main() {
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

        for(int i = 0;i<R;i++){
            for(int j= 0;j<C;j++){
                if((arr[i][j] &1) == 0){
                    // even
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = -1;
                }
            }
        }

        for(int []val1 : arr){
            for(int val2 : val1){
                System.out.print(val2 + " ");
            }
            System.out.println();
        }
    }
}
