import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int k = sc.nextInt();

        SortedSet<String> ss = new TreeSet<String>();
        
        for (int i = 0; i <= a.length() - k; i++) {
            ss.add(a.substring(i, i + k));
        }
        
        System.out.println(ss.first());
        System.out.println(ss.last());
        
        sc.close();
    }
}