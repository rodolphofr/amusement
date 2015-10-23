import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
 
        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double received = scanner.nextDouble();
 
        double calc = workedHours * received;
 
        String salary = String.format("%.2f", calc).replace(",", ".");
 
        System.out.println("NUMBER = "+employeeNumber+"\n"+
                           "SALARY = U$ "+salary);
  
    }
}
  