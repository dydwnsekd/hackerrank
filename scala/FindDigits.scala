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

    // Complete the findDigits function below.
    def findDigits(n: Int): Int = {
        var str_n = n.toString
        var count = 0

        for (i <- 0 until str_n.length){
            if (str_n.charAt(i) != '0' && n % str_n.charAt(i).toString.toInt == 0)
                count += 1
        }
            
        return count
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = stdin.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val n = stdin.readLine.trim.toInt

            val result = findDigits(n)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
