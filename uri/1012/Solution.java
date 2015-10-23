import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
         
        String input = scanner.nextLine();
         
        String[] values = input.split(" ");
         
        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[1]);
        double c = Double.parseDouble(values[2]);
         
        double triangle = (1.0/2) * a * c;
        double circle = 3.14159 * Math.pow(c, 2);
        double trapezoid = ((a + b) / 2) * c;
        double square = Math.pow(b, 2);
        double rectangle = a * b;
         
        System.out.println("TRIANGULO: "+ format(triangle));
        System.out.println("CIRCULO: "+ format(circle));
        System.out.println("TRAPEZIO: "+ format(trapezoid));
        System.out.println("QUADRADO: "+ format(square));
        System.out.println("RETANGULO: "+ format(rectangle));
  
    }

    public static String format(double result) {
        return String.format("%.3f", result);
    }
  
}
  