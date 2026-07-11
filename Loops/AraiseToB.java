package Ghoomi;
import java.util.*;
public class AraiseToB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        // a raise to n
        if (a != 0 && b != 0) {

            int ans = 1;

            for (int i = 1; i <= b; i++) {
                ans = ans * a;
                System.out.println(ans);
            }
            System.out.println("Final : "+ans);
        }
        else{
            System.out.println(0);
        }

    }
}
