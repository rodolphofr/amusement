import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
  
       	Scanner scanner = new Scanner(System.in);
         
        double testOne = scanner.nextDouble();
        double testTwo = scanner.nextDouble();
 
        double calc = ((testOne * 3.5) + (testTwo * 7.5)) / (3.5 + 7.5);
 
        String MEDIA = String.format("%.5f", calc).replace(",", ".");
 
        System.out.println("MEDIA = "+MEDIA);
         
    }
}
  