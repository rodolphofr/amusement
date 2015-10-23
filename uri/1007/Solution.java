import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
         
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
 
        int DIFERENCA = (A * B) - (C * D);
 
        System.out.println("DIFERENCA = "+DIFERENCA);
  
    }
}
  