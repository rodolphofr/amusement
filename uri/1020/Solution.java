import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	private static final int DAYS_OF_THE_YEAR = 365;
     
    private static final int DAYS_OF_THE_MONTH = 30;
    
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int days = scanner.nextInt();
         
        int amount_year = 0, amount_month = 0, amount_days = 0;
         
        while(true) {
             
            if(days >= DAYS_OF_THE_YEAR) {
                days -= DAYS_OF_THE_YEAR;
                amount_year++;
            } 
             
            else if (days < DAYS_OF_THE_YEAR && days >= DAYS_OF_THE_MONTH) {
                days -= DAYS_OF_THE_MONTH;
                amount_month++;
            } 
             
            else if (days < DAYS_OF_THE_MONTH) {
                amount_days = days;
                break;
            }
             
        }
         
        System.out.println(amount_year + " ano(s)");
        System.out.println(amount_month + " mes(es)");
        System.out.println(amount_days + " dia(s)");
         
        scanner.close();
	  
    }

}
  