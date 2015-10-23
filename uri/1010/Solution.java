import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
         
        String prodOne = scanner.nextLine();
        String prodTwo = scanner.nextLine();
         
        String[] infProdOne = prodOne.split(" ");
        String[] infProdTwo = prodTwo.split(" ");
         
        double calcProdOne = Integer.parseInt(infProdOne[1]) * Double.parseDouble(infProdOne[2]); 
        double calcProdTwo = Integer.parseInt(infProdTwo[1]) * Double.parseDouble(infProdTwo[2]);
         
        String total = String.format("%.2f", calcProdOne + calcProdTwo);
         
        System.out.println("VALOR A PAGAR: R$ "+total);
  
    }
}
  