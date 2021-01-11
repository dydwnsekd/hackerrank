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

    // Complete the equalizeArray function below.
    def equalizeArray(arr: Array[Int]): Int = {
        var max_count = 0
        val set_arr = arr.toSet
        for (i <- set_arr) {
            if (max_count < arr.count(_ == i))
                max_count = arr.count(_ == i)
        }
        return arr.length - max_count
    
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = equalizeArray(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
