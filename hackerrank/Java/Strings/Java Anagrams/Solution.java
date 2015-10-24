import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
        char[] arrA = A.toLowerCase().toCharArray();
        char[] arrB = B.toLowerCase().toCharArray();
        
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        if (Arrays.equals(arrA, arrB)) {
            return true;
        } else {
            return false;
        }       
   }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}