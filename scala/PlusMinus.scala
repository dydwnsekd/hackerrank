import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
        var plus_count = 0.0d
        var zero_count = 0.0d
        var minus_count = 0.0d
        val arr_size = arr.size

        plus_count = arr.filter(_ > 0).length
        zero_count = arr.filter(_ > 0).length
        minus_count = arr.filter(_ > 0).length

        // for (i <- arr) {
        //     if (i > 0)
        //         plus_count += 1
        //     else if (i == 0)
        //         zero_count += 1
        //     else
        //         minus_count += 1
        // }

        printf("%f\n", (plus_count/arr_size))
        printf("%f\n", (minus_count/arr_size))
        printf("%f\n", (zero_count/arr_size))

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}
