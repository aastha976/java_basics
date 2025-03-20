import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);   
      
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Agter Swapping:");
        System.out.println("a = " + a + " b = " + b);
    
    }
}