import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        double n = scanner.nextDouble();
         
        if (n < 0.0 || n > 100.0) {
            System.out.println("Fora de intervalo");
             
        } else {
             
            if (n >= 0.0 && n <= 25.0) {
                System.out.println("Intervalo [0,25]");
            } 
             
            else if (n > 25.0 && n <= 50.0) {
                System.out.println("Intervalo (25,50]");
            }
             
            else if (n > 50.0 && n <= 75.0) {
                System.out.println("Intevalo (50,75]");
            }
             
            else if (n > 75.0 && n <= 100.0) {
                System.out.println("Intervalo (75,100]");
            }
             
        }

        scanner.close();
	  
    }

}
  