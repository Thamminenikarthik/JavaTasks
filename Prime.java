package TASKS;
import java.util.Scanner;
public class Prime {
    boolean isPrime(int n){
        if(n == 1 || n == 0) return false;
        for(int  i = 2;i<= n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    void main(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out Prime or Not :");
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }

}
