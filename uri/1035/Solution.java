import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        int c = Integer.parseInt(values[2]);
        int d = Integer.parseInt(values[3]);
         
        if(((b > c) && (d > a)) && ((c + d) > (a + b))) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
         
        scanner.close();
	  
    }

}
  