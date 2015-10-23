import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
         
        int r = scanner.nextInt();
         
        double calc = (4.0/3) * 3.14159 * Math.pow(r, 3);
         
        String volume = String.format("%.3f", calc);
         
        System.out.println("VOLUME = "+volume);
         
        scanner.close();
  
    }
}
  