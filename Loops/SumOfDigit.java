package Ghoomi;
import java.util.Scanner;
public class SumOfDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();

        // Sum of digits of number n entered by the user
        // use while loop because we don't know the no. of iterations
        // while(n>0)
        // take input n
        // " % " --> extract last digit  ( n % 10 )
        // " / " --> removes last digit (n / 10 )

        // sum = sum + digit   ; digit = ( n % 10 )
        // n / 10 to remove digit after adding

        //  CODE :
         if(n<0){
          n=-n;
                }
        int sum=0;
        while(n>0){
            int digit=(n%10);
            sum += digit;
            n /= 10;
        }
//        System.out.print(" sum of digits "+sum);
        System.out.print((sum>0) ? sum: -sum );
//        System.out.println(sum);

    }
}