import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
  
       	
        Scanner scanner = new Scanner(System.in);
         
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
 
        double calc = ((A * 2) + (B * 3) + (C * 5))  / (2 + 3 + 5);
 
        String MEDIA = String.format("%.1f", calc).replace(",", ".");
 
        System.out.println("MEDIA = "+MEDIA);
  
         
    }
}
  