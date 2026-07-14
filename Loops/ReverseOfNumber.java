package Ghoomi;
import java.util.Scanner;
public class ReverseOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Reverse");
        int n = sc.nextInt();
        // for adding og and reverse , storing original bcz after loop it becomes zero
        int original=n;
        int r=0;  //reverse variable to store value
        // use while loop bcz we don't know the no. of iteration required
        while(n!=0){
            r *=10;
            int lastdigit =(n%10);
            // add lastdigit = r*10 + lastdigit --> 4*10 +3 --> 43 and so on
            r+=lastdigit;
            //to remove last digit of n after reversing
            n/=10;

        }
        System.out.println("Reverse of Number is :"+r);

        // print the sum of original number and it's reverse

        int sum=original+r;
//        System.out.println(" Sum of og and reverse is : "+sum);
        // the sum came same as reverse because it loses the original no. bcz of n/10 ; so after loop execution n becomes zero
         // after storing original number n is variable
        System.out.println(" Sum of og and reverse is : "+sum);
    }
}
