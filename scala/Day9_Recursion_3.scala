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

    // Complete the factorial function below.
    def factorial(n: Int): Int = {
        var result = 1
        for ( i <- 1 to n )
            result *= i

        result
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val result = factorial(n)

        printWriter.println(result)

        printWriter.close()
    }
}
