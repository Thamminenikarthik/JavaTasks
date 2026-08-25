package TASKS;

import java.util.Scanner;

/*2.Remove Duplicate Elements from an Array
Write a Java program to remove duplicate elements from an array and print only the unique elements.
        Input: 1 2 3 2 4 1 5
        Output: Unique Elements: 1 2 3 4 5
        Input: 1 1 1 2 3 4 4 4 4 5
        Output: Unique Elements: 1 2 3 4 5
*/

public class RemoveDuplicatesInSorted {
    public static void PrintDuplicatesInSrtdArr(int [] arr){
        int j;
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");

            j = i + 1;
            if (j < arr.length) {
                while (arr[i] == arr[j]) {
                    j++;
                }
            }
            i = j;
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

        PrintDuplicatesInSrtdArr(arr);
    }
}
