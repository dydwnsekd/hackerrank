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

    // Complete the breakingRecords function below.
    def breakingRecords(scores: Array[Int]): Array[Int] = {
        var max_count = 0
        var min_count = 0
        
        var return_count = ArrayBuffer[Int]()

        var max_value = scores(0)
        var min_value = scores(0)

        for (i <- scores) {
            if (max_value < i) {
                max_value = i
                max_count += 1
            }
            if (min_value > i) {
                min_value = i
                min_count += 1
            }
        }
        
        return_count += max_count
        return_count += min_count
        return return_count.toArray

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val scores = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = breakingRecords(scores)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
