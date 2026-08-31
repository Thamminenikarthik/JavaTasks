package TASKS;

import java.util.Scanner;
/*
# Dominated Rows in a Matrix

Given an integer matrix `arr` with `R` rows and exactly **2 columns**, determine whether each row is dominated by another row.

A row `i` is **dominated** if there exists another row `j` (`i != j`) such that:

        ```text
arr[i][0] >= arr[j][0]
AND
arr[i][1] <= arr[j][1]
        ```

Print `1` if the row is dominated; otherwise, print `0`.

        ### Example

**Input:**

        ```text
        5
        2
        5 10
        3 20
        8 5
        6 15
        2 25
        ```

        **Output:**

        ```text
1 0 1 1 0
        ```

        ### Constraints

```text
1 <= R <= 10^4
C == 2
-10^9 <= arr[i][j] <= 10^9
        ```

**Note:** A row must not be compared with itself.
*/

public class DominantPairMatrix {
    void main() {
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

        for (int i = 0; i < R; i++) {
            boolean isDone = false;
            for (int j = 0; j < R; j++) {

                if (i != j) {
                    isDone = false;
                    if (arr[i][0] >= arr[j][0] && arr[i][1] <= arr[j][1]) {
                        System.out.print(1 + " ");
                        isDone = true;
                        break;
                    }

                }
            }
            if (!isDone) {
                System.out.print(0 + " ");
            }

        }

    }
}
