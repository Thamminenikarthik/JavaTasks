package TASKS;
import java.util.Scanner;

public class NeonNumber {
    long Sum(long n){
        long sum = 0;

        while(n!=0){
            sum += n%10;
            n/=10;
        }

        return sum;
    }

    void main(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        long square = Math.powExact(n,2);
        long sum  = Sum(square);

       if(n == sum){
            System.out.println(n + " is an Neon Number");
        }
        else{
           System.out.println(n + " is not an Neon Number");
        }
    }
}
