package TASKS;

import java.util.Scanner;

public class LargestElementInArray {
    int  findLargestValInArr(int []arr){

        int maxValue = Integer.MIN_VALUE;
        for(int val : arr){
            maxValue = Math.max(maxValue,val);
        }
        return maxValue;
    }

    void  main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest Element In Array is : " + findLargestValInArr(arr));
    }
}
