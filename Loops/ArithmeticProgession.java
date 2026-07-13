package Ghoomi;
import java.util.*;
public class ArithmeticProgession {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();

     // Print AP = 2,5,8,11 upto n'th terms
     // an= a+(n-1)d  ; a=2  ; d=3
//
//     for(int i=2;i<=3*n-1;i+=3){
//         System.out.println(i);
//     }

//
//        int a=2,d=3;
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a+=d;
//        }

       //print series - 99,95,91,87....upto all psoitive terms
//
//        for(int i=99;i>=0;i-=4){
//            System.out.println(i);
//        }
//


        int a=99 , d=4;
        for(int i=99;a>=0;i--){
            System.out.println(a);
            a-=d;
        }


    }
}
