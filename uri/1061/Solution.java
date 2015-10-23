import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        String input4 = scanner.nextLine();
 
        int startDay = Integer.parseInt(input1.split(" ")[1]);
 
        int endDay = Integer.parseInt(input3.split(" ")[1]);
 
        String startTime = input2.replaceAll(" ", "");
 
        String endTime = input4.replaceAll(" ", "");
 
        long hours = 0, minutes = 0, days = 0, seconds = 0;
 
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
 
        try {
 
            Date startDate = sdf.parse(startTime);
            Date endDate = sdf.parse(endTime);
 
            if (endDay > startDay) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(endDate);
                int difference = endDay - startDay;
                calendar.add(Calendar.DAY_OF_MONTH, difference);
                endDate = calendar.getTime();
            }
 
            long difference = endDate.getTime() - startDate.getTime();
 
            long secondsInMilli = 1000;
            long minutesInMilli = secondsInMilli * 60;
            long hoursInMilli = minutesInMilli * 60;
            long daysInMilli = hoursInMilli * 24;
 
            days = difference / daysInMilli;
            difference = difference % daysInMilli;
             
            hours = difference / hoursInMilli;
            difference = difference % hoursInMilli;
 
            minutes = difference / minutesInMilli;
            difference = difference % minutesInMilli;
             
            seconds = difference / secondsInMilli;
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
         
        scanner.close();
	  
    }

}
  