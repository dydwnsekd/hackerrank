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

    // Complete the beautifulTriplets function below.
    def beautifulTriplets(d: Int, arr: Array[Int]): Int = {
        var count = 0
        for (i <- arr) {
            if (arr.contains(i+d) && arr.contains(i+d+d))
                count += 1
        }
                
        return count
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nd = stdin.readLine.split(" ")

        val n = nd(0).trim.toInt

        val d = nd(1).trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = beautifulTriplets(d, arr)

        printWriter.println(result)

        printWriter.close()
    }
}
