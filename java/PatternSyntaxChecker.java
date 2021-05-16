import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int line_num = in.nextInt();
        in.nextLine();
        String temp_str = "";

        for(int i=0; i<line_num; i++)
        {
            temp_str = in.nextLine();
            try
            {
                Pattern.compile(temp_str);
                System.out.println("Valid");
            }
            catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}