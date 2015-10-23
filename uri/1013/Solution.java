import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
	     
	    String input = scanner.nextLine();
	     
	    String[] values = input.split(" ");
	     
	    int greatest = 0;
	     
	    for (String value : values) {
	        int number = Integer.parseInt(value);
	        if(number > greatest) {
	            greatest = number;
	        }
	    }
	     
	    System.out.println(greatest + " eh o maior");
	  
    }

}
  