import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  	
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        int count = 0;
        int positiveNumbers = 0;
        double sum = 0;
         
        while (count < 6) {
            double number = scanner.nextDouble();
            if (number > 0) {
                sum += number;
                positiveNumbers++;
            }
            count++;
        }
         
        DecimalFormat df = new DecimalFormat("0.0");
        double average = sum / positiveNumbers;
         
        System.out.println(positiveNumbers + " valores positivos");
        System.out.println(df.format(average));
         
        scanner.close();
	  
    }

}
  