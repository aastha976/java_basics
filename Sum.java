import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt(); 
        }
        for(int i = 0; i< n; i++) {
           sum += arr[i];
        }
       
        System.out.print("The sum of elements is: " + sum);

        sc.close();
    }

}