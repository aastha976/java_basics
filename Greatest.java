import java.util.*;

public class Greatest {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal!");
        } else if (a > b) {
            System.out.println("a is greater!");
        } else {
            System.out.println("a is lesser!");
        }
        
        sc.close();
    }
}