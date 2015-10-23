import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        String initialHour = values[0],
               initialMinute = values[1],
               finalHour = values[2],
               finalMinute = values[3];
         
        long hours = 0,
             minutes = 0;
         
        int start = Integer.parseInt(initialHour),
            end = Integer.parseInt(finalHour);
         
        String initialDateFormat = initialHour + ":" + initialMinute;
        String finalDateFormat = finalHour + ":" + finalMinute;
         
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
         
        try {
             
            Date startDate = sdf.parse(initialDateFormat);
            Date endDate = sdf.parse(finalDateFormat);
             
            if (start == end || end < start) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(endDate);
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                endDate = calendar.getTime();
            } 
             
            long difference = endDate.getTime() - startDate.getTime();
             
            long secondsInMilli = 1000;
            long minutesInMilli = secondsInMilli * 60;
            long hoursInMilli = minutesInMilli * 60;
             
            hours = difference / hoursInMilli;
            difference = difference % hoursInMilli;
             
            minutes = difference / minutesInMilli;
            difference = difference % minutesInMilli;
         
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
         
        scanner.close();
	  
    }

}
  