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

    // Complete the repeatedString function below.
    def repeatedString(s: String, n: Long): Long = {
        val result = (s.count(_ == 'a') * (n/s.length).toLong) + 
        (s.substring(0, (n % s.length).toInt).count(_ == 'a'))
        
        return result

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = stdin.readLine

        val n = stdin.readLine.trim.toLong

        val result = repeatedString(s, n)

        printWriter.println(result)

        printWriter.close()
    }
}
