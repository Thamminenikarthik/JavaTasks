package TASKS;
import java.util.Scanner;
public class HappyNumber {

    void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0,lastDigi = 0;

        System.out.println("Enter a Number to Check Whether Happy Number or Not : ");
        while(n >= 0){
            lastDigi = n%10;
            n/=10;
            sum += lastDigi * lastDigi;
            if(n == 0){

                if(sum > 9){
                    n = sum;
                    sum = 0;
                }
                else{
                    break;
                }
            }
        }
        if(sum == 1) {
            System.out.println("😄 It's a Happy Number");
        }else{
            System.out.println("😓 It's not a Happy Number");
        }
    }
}
