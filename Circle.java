import java.util.*;
 
public class Circle {
    public static void main (String args[]) {
        int radius = 7;
        double pi = 3.14;

        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}