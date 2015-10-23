import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int hour = scanner.nextInt();
        int average_velocity = scanner.nextInt();
         
        double liters = (hour * average_velocity) / 12.0;
         
        System.out.println(String.format("%.3f", liters));
         
        scanner.close();
	  
    }

}
  