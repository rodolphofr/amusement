import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        int[] numbers = new int[values.length]; 
         
        for(int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
         
        int aux;
         
        for(int i = numbers.length - 1; i >= 0; i--) {
             
            for(int j = i; j >= 0; j--) {
                 
                if(numbers[i] < numbers[j]) {
                    aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
                 
            }
        }
         
        for(int number : numbers) {
            System.out.println(number);
        }
         
        System.out.println();
         
        for(String number : values) {
            System.out.println(number);
        }
         
        scanner.close();
	  
    }

}
  