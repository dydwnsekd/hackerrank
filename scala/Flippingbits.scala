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

    // Complete the flippingBits function below.
    def flippingBits(n: Long): Long = {
        val flipping: Long = math.pow(2, 32).toLong - 1
        
        return n ^ flipping
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = stdin.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val n = stdin.readLine.trim.toLong

            val result = flippingBits(n)
snsanfdmf
            printWriter.println(result)
        }

        printWriter.close()
    }
}
