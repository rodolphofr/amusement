import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int count = 0;
        int evenNumbers = 0;
         
        while (count < 5) {
            int number = scanner.nextInt();
            if ((number % 2) == 0) {
                evenNumbers++;
            }
            count++;
        }
         
        System.out.println(evenNumbers + " valores pares");
         
        scanner.close();
	  
    }

}
  