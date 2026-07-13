package Ghoomi;
import java.util.*;
public class CountDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();

        // Count no. of Digits
        // / by 10 --> no. of times divided by 10 upto 0 is the no. of digit in a no.
        // jitni bar 10 se divide hua , utna digit ka number
//
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count+"  Digit Number");


    }
}
