import java.util.*;

public class Swap {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.print("Before swapping:");
        System.out.println("a = " + a +  ", b = " + b);

        c = a;
        a = b;  
        b = c;

        System.out.print("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();


    }
}   