import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int distance = scanner.nextInt();
         
        int minutes = distance * 2;
         
        System.out.println(minutes + " minutos");
         
        scanner.close();
	  
    }

}
  