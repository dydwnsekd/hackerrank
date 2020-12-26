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

    // Complete the lonelyinteger function below.
    def lonelyinteger(a: Array[Int]): Int = {
        val set_a = a.toSet

        for(i <- set_a){
        if (a.count(_==i) == 1)
            return i
        }
        return 0
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val a = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = lonelyinteger(a)

        printWriter.println(result)

        printWriter.close()
    }
}
