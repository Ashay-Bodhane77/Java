package Ghoomi;
import java.util.*;
public class Composite {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n=sc.nextInt();


        //Composite no ---> a no. which have more than two factors

        int count=0;
        for(int i=1;i<=n;i++){
            if (n % i ==0){
                count++;
            }
        }
        if(count >2){
            System.out.println("Composite");
        }
        else{
            System.out.println(" Not Composite");
        }


    }
}
