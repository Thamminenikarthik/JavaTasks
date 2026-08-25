package TASKS;

import java.util.Scanner;

/* Write a Java program to read a 3 × 3 matrix using the Scanner class and find its transpose.
The transpose of a matrix is obtained by interchanging its rows and columns. In other words, the element at position (i, j) becomes (j, i).
Original Matrix:
        1 2 3
        4 5 6
        7 8 9
Transpose Matrix:
        1 4 7
        2 5 8
        3 6 9
        */
public class TransposeMatrix {

    public static void Transpose(int [][]arr){
        for(int i = 0;i<arr.length;i++){
           int j = i+1;
           while(j < arr[i].length){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
               j++;
           }
        }
        print2dArr(arr);
    }
    public static void print2dArr(int [][]arr){
        for(int []val1 : arr){
            for(int val2 : val1){
                System.out.print(val2 + " ");
            }
            System.out.println();
        }
    }
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

        Transpose(arr);

    }
}
