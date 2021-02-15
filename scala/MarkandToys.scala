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

    // Complete the maximumToys function below.
    def maximumToys(prices: Array[Int], k: Int): Int = {
        var count = 0
        var sum_value = 0
        
        for (i <- prices.sorted) {
            if (k - sum_value - i >= 0){
                sum_value += i
                count += 1
            }
        }
        return count
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nk = stdin.readLine.split(" ")

        val n = nk(0).trim.toInt

        val k = nk(1).trim.toInt

        val prices = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = maximumToys(prices, k)

        printWriter.println(result)

        printWriter.close()
    }
}
