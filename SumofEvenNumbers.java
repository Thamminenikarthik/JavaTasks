package TASKS;

import java.util.Scanner;
/*
### Sum of Even Numbers

Write a Java program to find the **sum of all even numbers from 1 to `n`**.

        **Example:**

Input:

        ```text
10
        ```

Output:

        ```text
THE SUM TILL 10 IS :30
        ```

        **Explanation:**

        ```text
Even numbers: 2 4 6 8 10

Sum = 2 + 4 + 6 + 8 + 10
        = 30
        ```
*/

public class SumofEvenNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1;i<= n;i++){
            if((i & 1) == 0){
                sum += i;
            }
        }
        System.out.print("THE SUM  OF EVEN NUMBERRS TILL " + n + " IS : " +sum);

        }
    }

