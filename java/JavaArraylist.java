import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> num_al = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n-- > 0) {
            ArrayList<Integer> temp = new ArrayList<>();
            int m = in.nextInt();
            while(m-- > 0)
                temp.add(in.nextInt());
            num_al.add(temp);
        }

        n = in.nextInt();
        while(n-- > 0) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();

            try {
                System.out.println(num_al.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}