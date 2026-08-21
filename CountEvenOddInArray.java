package TASKS;

import java.util.Scanner;

public class CountEvenOddInArray {
    public  static void findEvenOddCount(int [] arr) {
        int evenCount = 0,oddCount = 0;

        for(int val : arr){
            if((val & 1) ==0){
                evenCount++ ;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even Number's Count : " + evenCount);
        System.out.println("Odd Number's Count : " + oddCount);
    }
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array :");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findEvenOddCount(arr);
    }
}
