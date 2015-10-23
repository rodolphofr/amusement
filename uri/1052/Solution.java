import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int mounth = scanner.nextInt();
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
        try {
            Date date = sdf.parse("01/"+mounth+"/1970");
             
            sdf = new SimpleDateFormat("MMMMM", new Locale("en", "US"));
             
            System.out.println(sdf.format(date));
             
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        scanner.close();
	  
    }

}
  