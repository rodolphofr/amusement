import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
        int banknotes[] = new int[]{100, 50, 20, 10, 5, 2, 1};
        int i = 0, count = 0;
         
        System.out.println(n);
         
        while(i < banknotes.length) {
             
            int noteValue = banknotes[i];
             
            if(n >= noteValue) {
                n -= noteValue;
                count++;
            } else {
                i++;
                System.out.println(count + " nota(s) de R$ " + noteValue + ",00");
                count = 0;
            }
                         
        }
         
        scanner.close();
	  
    }

}
  