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

    // Complete the utopianTree function below.
    def utopianTree(n: Int): Int = {
        var result = 1
        for (i <- 0 until n)
            if (i % 2 == 0)
                result *= 2
            else
                result += 1
                
        return result
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = stdin.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val n = stdin.readLine.trim.toInt

            val result = utopianTree(n)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
