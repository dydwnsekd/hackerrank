import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();

        
        if(s.length() == 0)
            System.out.println("0");
        else
        {
            String[] ss;
            ss = s.split("[ .,'!?@_]+");
  
            if(ss.length <= 400000)
            {
                System.out.println(ss.length);
                for(String i: ss)
                    System.out.println(i);
            }
        }
        
        scan.close();
    }
}

