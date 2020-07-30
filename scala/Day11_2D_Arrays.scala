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

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = Array.ofDim[Int](6, 6)
        var max_value = Integer.MIN_VALUE

        for (i <- 0 until 6) {
            arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
        }

        for (i <- 1 until 5)
        {
            for (j <- 1 until 5)
            {
                var temp = arr(i-1)(j-1) + arr(i-1)(j) + arr(i-1)(j+1) + arr(i)(j) + arr(i+1)(j-1) + arr(i+1)(j) + arr(i+1)(j+1)
                if (max_value < temp)
                    max_value = temp
            }
        }

        return max_value
    }
}
