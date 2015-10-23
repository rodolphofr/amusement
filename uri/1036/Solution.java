import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
 
        double a = Double.parseDouble(values[0]);
         
        if(a != 0.0) {
             
            double b = Double.parseDouble(values[1]);
            double c = Double.parseDouble(values[2]);
             
            double delta = Math.sqrt((Math.pow(b, 2)) -(4) * a * c);
             
            if(delta > 0) {
                double r1 = (-(b) + delta) / (2 * a);
                double r2 = (-(b) - delta) / (2 * a);
                 
                System.out.println("R1 = "+String.format("%.5f", r1));
                System.out.println("R2 = "+String.format("%.5f", r2));
                 
            } else {
                System.out.println("Impossivel calcular");
            }
             
        } else {
            System.out.println("Impossivel calcular");
        }
         
        scanner.close();
	  
    }

}
  