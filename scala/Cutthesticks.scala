import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable.ArrayBuffer

object Solution {

    // Complete the cutTheSticks function below.
    def cutTheSticks(arr: Array[Int]): Array[Int] = {
        val set_arr = arr.sorted.toSet
        var count = arr.length
        var result_arr = ArrayBuffer(count)
        
        println(set_arr)
        
        for (i <- set_arr.slice(0, set_arr.size-1)) {
            result_arr += (count-arr.count(_ == i))
            count -= (arr.count(_ == i))
        }
        return result_arr.toArray

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = cutTheSticks(arr)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
