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

    // Complete the marcsCakewalk function below.
    def marcsCakewalk(calorie: Array[Int]): Long = {
        var result: Long = 0
        var calorie_reverse = calorie.sorted.reverse
        
        for (i <- 0 until calorie.length)
            result += (math.pow(2, i).toLong) * calorie_reverse(i)
        
        println(result)
        return result

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val calorie = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = marcsCakewalk(calorie)

        printWriter.println(result)

        printWriter.close()
    }
}
