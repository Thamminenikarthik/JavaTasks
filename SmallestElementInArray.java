package TASKS;

import java.util.Scanner;

public class SmallestElementInArray {
   public static int findSmallestVal(int []arr){
       int minValue = Integer.MAX_VALUE;

       for(int val : arr){
           minValue = Math.min(val,minValue);
       }
       return minValue;
   }
    public static void  main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array :");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSmallestVal(arr));
    }
}
