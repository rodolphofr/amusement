import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int count = 0;
 
        for (int i = 0; i < 6; i++) {
             
            double number = scanner.nextDouble();
 
            if (number > 0) {
                count++;
            }
             
        }
         
        System.out.println(count + " valores positivos");
         
        scanner.close();
	  
    }

}
  