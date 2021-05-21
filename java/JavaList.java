import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        String command = "";

        Scanner in = new Scanner(System.in);

        int list_len = in.nextInt();
        for(int i=0;i<list_len;i++)
            a.add(in.nextInt());

        int command_len = in.nextInt();
        for(int i=0;i<command_len;i++)
        {
            command = in.next();
            if(command.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                a.add(index, value);
            }
            else if(command.equals("Delete"))
            {
                int index = in.nextInt();
                a.remove(index);
            }
        }
        for(int i: a)
            System.out.print(i + " ");
        
    }
}