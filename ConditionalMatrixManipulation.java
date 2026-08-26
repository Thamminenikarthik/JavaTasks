package TASKS;

import java.util.Scanner;

/*1.Write a Java program to perform the following operations on a 3 × 3 integer matrix:
Reverse the elements of every even-indexed row (rows 0 and 2).
Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
Square all the elements on the main (left) diagonal.
Display the modified matrix.
Input
        1 2 3
        4 5 6
        7 8 9
Output
        9   2   1
        8  25   12
        9   8  49
        */
public class ConditionalMatrixManipulation {
    void main(){
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
            int j = 0;
            //even case
            if((i & 1) == 0){
                int end = C-1;
                while(j <= end){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][end];
                    arr[i][end] = temp;
                    // diagonal square
                    if(i == j){
                        arr[i][j] *= arr[i][j];
                    }
                    if(i == end){
                        arr[i][end] *= arr[i][end];
                    }
                    j++;end--;
                }

            }
                // odd case
            else{
                while(j<C){

                    if(i!=j) {

                        arr[i][j] *= 2;
                    } else if (i == j) {
                        // if diagonal -> then square
                        arr[i][j]*=arr[i][j];
                    }

                    j++;
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
