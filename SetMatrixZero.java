package TASKS;
import java.util.Scanner;

/*
 ### Question: Set Matrix Zero

**Write a Java program to read an `M × N` integer matrix from the user. If any element in the matrix is `0`, set all elements in that element’s entire row and column to `0`. Display the resulting matrix.**

        ### Example Test Case

**Input:**

        ```text
        1  2  3
        4  0  6
        7  8  9
        ```

        **Output:**

        ```text
        1  0  3
        0  0  0
        7  0  9
        ```

        **Explanation:**
Since the element at the second row and second column is `0`, the **entire second row** and **entire second column** are changed to `0`.
*/

public class SetMatrixZero {
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

        boolean [] RowArr = new boolean[R];
        boolean [] ColArr = new boolean[C];
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                if(arr[i][j] ==  0){
                    RowArr[i] = true;
                    ColArr[j] = true;
                }
            }
        }

        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                if(RowArr[i] == true || ColArr[j] == true){
                    arr[i][j] = 0;
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
