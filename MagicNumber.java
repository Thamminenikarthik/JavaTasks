package TASKS;

public class MagicNumber {
    void main(){
        int n = 609,sum = 0;
        while(n >= 0){
            sum += n %10;
            n/=10;

            if(n == 0){
                if(sum > 9 ) {
                    n = sum;
                    sum = 0;
                }else {
                    break;
                }
            }

        }

        if(sum == 1){
            System.out.println("It's a Magic Number");
        }else{
            System.out.println("It's not an Magic Number");
        }
    }
}
