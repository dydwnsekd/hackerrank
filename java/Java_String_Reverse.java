import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";

        for(int i=1;i<=A.length();i++)
            reverse = reverse.concat(Character.toString(A.charAt(A.length()-i)));

        if(reverse.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}



