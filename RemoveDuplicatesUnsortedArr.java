package TASKS;

/*
### Remove Duplicates from an Unsorted Array

        Write a Java program to **remove duplicate elements from an unsorted array** and print only the elements that occur for the first time.

        The original order of the elements should be maintained.

        **Example:**

        Input:

        ```text
        Enter the size of the array:
        8

        Enter 8 Numbers into the array:
        4 2 7 2 4 9 7 5
        ```

        Output:

        ```text
        4 2 7 9 5
        ```

        **Explanation:**

        ```text
        Original array: 4 2 7 2 4 9 7 5

        Duplicates:
        2 → duplicate
        4 → duplicate
        7 → duplicate

        After removing duplicates:
        4 2 7 9 5
        ```
*/

import java.util.Scanner;

public class RemoveDuplicatesUnsortedArr {
    public static void PrintNonDuplicates(int []arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == -1) continue;
            System.out.print(arr[i] + " ");

            for(int j = i+1;j<arr.length;j++){
                if(arr[j] != -1 && arr[j] == arr[i]){
                    arr[j] = -1;
                }
            }
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Numbers into the array :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PrintNonDuplicates(arr);
    }
}
