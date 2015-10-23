import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 		
 		double salary = scanner.nextDouble();
        double total = 0;
         
        if (salary > 0.00 && salary <= 2000.00) {
            System.out.println("Isento");
        }
         
        else {
         
            if (salary >= 2000.01 && salary <= 3000.00) {
                total = (salary - 2000.0) * 0.08;
            }
             
            else if (salary >= 3000.01 && salary <= 4500.00) {
                total = 1000.0 * 0.08 + (salary - 3000.0) * 0.18; 
            }
             
            else if (salary > 4500.00) {
                total = 1000.0 * 0.08 + 1500.0 * 0.18 + (salary - 4500.0) * 0.28;
            }
             
            DecimalFormat df = new DecimalFormat("0.00");
             
            System.out.println("R$ "+df.format(total));
             
        }
        
        scanner.close();
	  
    }

}
  