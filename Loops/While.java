package Ghoomi;
import java.util.*;

public class While {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter");
//        int n =sc.nextInt();
        // while loop runs until the condition becomes true
        // rule : always update the variable inside loop
        // generally used when conditions are more than one
        // while is used when you don't know the no.of iterations
//        int i=1;
//        while(i<=5){
//            System.out.println(i+" ");
//            i++;
//        }

        //Do-While
       // Executes body at least once even when condition is not satisfied
        int i=1;
        do {
            System.out.println(i);
        }while(i>=5);


    }
}