import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        String inputDataOne = scanner.nextLine();
        String inputDataTwo = scanner.nextLine();
         
        String[] firstAxes = inputDataOne.split(" ");
        String[] secondAxes = inputDataTwo.split(" ");
         
        double x1 = Double.parseDouble(firstAxes[0]), y1 = Double.parseDouble(firstAxes[1]); 
        double x2 = Double.parseDouble(secondAxes[0]), y2 = Double.parseDouble(secondAxes[1]);
         
        double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
         
        System.out.println(String.format("%.4f", distance));
         
        scanner.close();
	  
    }

}
  