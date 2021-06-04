import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String ip = "(0{0,2}[0-9]|[01]?[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = ip+"."+ip+"."+ip+"."+ip;
}