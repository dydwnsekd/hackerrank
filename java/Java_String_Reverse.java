import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String reverse = new String(5);

        System.out.println(A.charAt(1));

        for(int i=0;i<A.length();i++)
        {
            reverse.charAt(i) = A.charAt(A.length()-i);
        }

        System.out.println(reverse);
    }
}
