import java.io.IOException;
import java.util.Scanner;
  
public class Solution {
  
  	public static void main(String[] args) throws IOException {
 
	    Scanner scanner = new Scanner(System.in);
 
        String input = scanner.nextLine();
 
        String[] values = input.split(" ");
 
        DecimalFormat df = new DecimalFormat("0.0");
         
        double a = Double.parseDouble(values[0]), 
               b = Double.parseDouble(values[1]), 
               c = Double.parseDouble(values[2]);
         
        if(isTriangle(a, b, c)) {
            double perimeter = a + b + c;
            System.out.println("Perimetro = "+ df.format(perimeter));
        } else {
            double area = ((a + b) * c) / 2;
            System.out.println("Area = "+ df.format(area));
        }
	  
    }

    public static boolean isTriangle(double a, double b, double c) {
        boolean firstSideIsValid = (b - c) < a && a < (b + c);
        boolean secondSideIsValid = (c - a) < b && b < (c + a);
        boolean thirdSideIsValid = (a - b) < c && c < (a + b);
        return firstSideIsValid && secondSideIsValid & thirdSideIsValid;
    }

}
  