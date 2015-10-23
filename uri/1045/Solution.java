import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
 
        double[] numbers = toDoubleList(input.split(" "));
         
        numbers = descendingOrder(numbers);
         
        List<String> types = typesOfTriangle(numbers);
         
        for(String type : types) {
            System.out.println(type);
        }
         
        scanner.close();
	  
    }

     public static double[] descendingOrder(double[] numbers) {
        double aux;
         
        for(int i = 0; i < numbers.length; i++) {
             
            for(int j = i + 1; j < numbers.length; j++) {
                  
                if(numbers[j] > numbers[i]) {
                    aux = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = aux;
                }
                  
            }
        }
         
        return numbers;
         
    }
     
    public static double[] toDoubleList(String[] values) {
        double[] numbers = new double[values.length];
         
        for(int i = 0; i < values.length; i++) {
            numbers[i] = Double.parseDouble(values[i]);
        }
         
        return numbers;
    }
     
    public static List<String> typesOfTriangle(double[] numbers) {
        List<String> types = new ArrayList<String>();
         
        double a = numbers[0],
               b = numbers[1],
               c = numbers[2];
         
        if (a >= (b + c)) {
            types.add("NAO FORMA TRIANGULO");
        } 
         
        else {
             
            if ((a * a) == ((b * b) + (c * c))) {
                types.add("TRIANGULO RETANGULO");
            } 
             
            if ((a * a) > ((b * b) + (c * c))) {
                types.add("TRIANGULO OBTUSANGULO");
            } 
             
            if ((a * a) < ((b * b) + (c * c))) {
                types.add("TRIANGULO ACUTANGULO");
            }
             
            if (a == b && a == c && b == c) {
                types.add("TRIANGULO EQUILATERO");
            }
             
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if(numbers[i] == numbers[j]) {
                        count++;
                    }
                }
            }
             
            if(count == 1) {
                types.add("TRIANGULO ISOSCELES");
            }
             
        }
         
        return types;
    }

}
  