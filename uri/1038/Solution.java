import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        int x = Integer.parseInt(values[0]); //prodCode
        int y = Integer.parseInt(values[1]); //amount
         
        double total = 0;
         
        switch (x) {
        case 1:
            total = y * 4.00;
            break;
         
        case 2:
            total = y * 4.50;
            break;
         
        case 3:
            total = y * 5.00;
            break;
         
        case 4:
            total = y * 2.00;
            break;
         
        case 5:
            total = y * 1.50;
            break;
         
        default:
            break;
        }
         
        System.out.println("Total: R$ "+String.format("%.2f", total));
         
        scanner.close();
	  
    }

}
  