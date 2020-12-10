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

    // Complete the viralAdvertising function below.
    def viralAdvertising(n: Int): Int = {
        var count = 0
        var like_num = 5
    
        for(i <- 0 until n) {
            count += (like_num / 2)
            like_num = (like_num / 2) * 3
        }
        return count
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val result = viralAdvertising(n)

        printWriter.println(result)

        printWriter.close()
    }
}
