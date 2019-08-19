import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int plus_count = 0;
        int zero_count = 0;
        int minus_count = 0;

        for(int num: arr)
        {
            if(num > 0)
                plus_count++;
            else if(num == 0)
                zero_count++;
            else
                minus_count++;
        }

        System.out.printf("%.7f\n", ((float)plus_count/arr.length));
        System.out.printf("%.7f\n", ((float)minus_count/arr.length));
        System.out.printf("%.7f\n", ((float)zero_count/arr.length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
