import java.util.*;

public class Reverse {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);

        String originalStr = "Hello! How are you?";
        String reversed = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversed = originalStr.charAt(i) + reversed;
        }
          
          System.out.println("Reversed string: "+ reversed);

    }
}