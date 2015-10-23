import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	private static final int SECONDS_PER_HOUR = 3600;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int n = scanner.nextInt();
        int hour, minutes, seconds;
         
        if(n < SECONDS_PER_MINUTE) {
             
            System.out.println("0:0:"+n);
             
        } else if (n < SECONDS_PER_HOUR) {
             
            minutes = n / SECONDS_PER_MINUTE;
            seconds =  n - (minutes * SECONDS_PER_MINUTE);  
             
            System.out.println("0:"+minutes+":"+seconds);
             
        } else if (n > SECONDS_PER_HOUR){
             
            hour = n / SECONDS_PER_HOUR;
            minutes = (n - (hour * SECONDS_PER_HOUR)) / MINUTES_PER_HOUR;
            seconds = (n - (hour * SECONDS_PER_HOUR)) - (minutes * SECONDS_PER_MINUTE);
             
            System.out.println(hour+":"+minutes+":"+seconds);
             
        }
         
	  
    }

}
  