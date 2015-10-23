import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    int count = 1;
         
        while(count <= 100) {
             
            if((count % 2) == 0) {
                System.out.println(count);
            }
             
            count++;
        }
	  
    }

}
  