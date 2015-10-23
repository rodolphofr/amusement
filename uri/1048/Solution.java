import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 		
 		double salary = scanner.nextDouble();
         
        double earned = 0.0;
        int percentual = 0;
         
        if (salary <= 400.00) {
            percentual = 15;
            earned = salary * 0.15;
            salary += earned;
        }
         
        else if (salary >= 400.01 && salary <= 800.00) {
            percentual = 12;
            earned = salary * 0.12;
            salary += earned;
        }
         
        else if (salary >= 800.01 && salary <= 1200.00) {
            percentual = 10;
            earned = salary * 0.10;
            salary += earned;
        }
         
        else if (salary >= 1200.01 && salary <= 2000.00) {
            percentual = 7;
            earned = salary * 0.07;
            salary += earned;
        }
         
        else if (salary > 2000) {
            percentual = 4;
            earned = salary * 0.04;
            salary += earned;
        }
         
        DecimalFormat df = new DecimalFormat("0.00");
         
        System.out.println("Novo salario: "+ df.format(salary));
        System.out.println("Reajuste ganho: "+ df.format(earned));
        System.out.println("Em percentual: "+ percentual + " %");
        
        scanner.close();
	  
    }

}
  