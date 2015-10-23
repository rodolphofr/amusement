import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
  
        Scanner scanner = new Scanner(System.in);
 
        double R = scanner.nextDouble(); 
        double A = 3.14159 * (R * R);
 
        String round = String.format("%.4f", A).replace(",",".");
 
        System.out.println("A="+round);
  
    }
  