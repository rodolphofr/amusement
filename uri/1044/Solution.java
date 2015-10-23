import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
 
        String[] values = input.split(" ");
 
        int a = Integer.parseInt(values[0]), 
            b = Integer.parseInt(values[1]); 
         
        boolean areMultiples;
         
        if(b > a) {
            areMultiples = (b % a) == 0; 
        } else {
            areMultiples = (a % b) == 0;
        }
         
        if (areMultiples) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
 
        scanner.close();
	  
    }

}
  