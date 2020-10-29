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

    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Int]) {
        var min = Long.MaxValue
        var max = Long.MinValue

        val sum: Long = arr.map(_.toLong).sum

        for (i <- arr) {
            if (min > sum - i)
                min = sum - i
            if (max < sum -i)
                max = sum - i
        }

        printf("%d %d", min, max)

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        miniMaxSum(arr)
    }
}
