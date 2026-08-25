package TASKS;

import java.util.Scanner;

/*Today's Assignment
Java-
        1.Write a Java program to find all the leader elements in an array of integers.
A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
        Input: 16 17 4 3 5 2
Output: Leader Elements: 17 5 2
*/
public class FindLeaderElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want :");
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            boolean isGreater = true;
            for(int j = i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    isGreater = false;
                }
            }
            if(isGreater){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
