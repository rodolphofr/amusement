import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
            String name = scanner.nextLine();
            double salary = scanner.nextDouble();
            double sold = scanner.nextDouble();
         
            double total = salary + (sold * 0.15);
         
            DecimalFormat df = new DecimalFormat(".00");
         
            System.out.println("TOTAL = R$ " + df.format(total));
         
            scanner.close();
	  
    }

}
  