import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] ss;
        ss = s.split("[ .,'!?]+");
        System.out.println(ss.length);
        for(String i: ss)
            System.out.println(i);

        scan.close();
    }
}

