import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a, b, n, c = 0;

        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            
            c = a;
            
            for (int i = 0; i < n; i++) {
                c += (int) Math.pow(2, i) * b;
                System.out.print(c + " ");
            }
            
            System.out.println();
            
            t--;
        }
    }
}