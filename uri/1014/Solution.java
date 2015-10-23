import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
         
        System.out.println(String.format("%.3f", x / y) + " km/l");
         
        scanner.close();
	  
    }

}
  