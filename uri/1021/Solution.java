import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        DecimalFormat df = new DecimalFormat("0.00");
         
        int notes[] = new int[]{100, 50, 20, 10, 5, 2};
        double coins[] = new double[]{1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
          
        double n = scanner.nextDouble();
          
        int i = 0, kNotes = 0;
          
        System.out.println("NOTAS:");
          
        while(i < notes.length) {
              
            int note = notes[i];
              
            if(n >= note) {
                n -= note;
                kNotes++;
            } else {
                i++;
                System.out.println(kNotes + " nota(s) de R$ " + df.format(note));
                kNotes = 0;
            }
              
        }
          
        int j = 0, kCoins = 0;
          
        System.out.println("MOEDAS:");
          
        while(j < coins.length) {
              
            double coin = coins[j];
              
            if(n >= coin) {
                n -= coin;
                kCoins++;
            } else {
                j++;
                System.out.println(kCoins + " moeda(s) de R$ " + df.format(coin));
                kCoins = 0;
            }
        }
         
        scanner.close();
	  
    }

}
  