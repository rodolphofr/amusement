import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	private static final int HOURS_OF_THE_DAY = 24;
 
    private static final int NOON = HOURS_OF_THE_DAY / 2;
    
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        int start = Integer.parseInt(values[0]),
              end = Integer.parseInt(values[1]);
         
        int time = 0;
         
        if (start == end) {
            time = HOURS_OF_THE_DAY;
        }
         
        else if ((start <= NOON && end <= NOON) || (start >= NOON && end >= NOON)) {
            time = end - start;
        } 
         
        else if (start >= NOON && end <= NOON) {
            time = (HOURS_OF_THE_DAY - start) + end; 
        } 
         
        else if (start <= NOON && end >= NOON) {
            time = (NOON - start) + (end - NOON);
        } 
         
        System.out.println("O JOGO DUROU " + time + " HORA(S)");
         
        scanner.close();
	  
    }

}
  