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

    // Complete the serviceLane function below.
    def serviceLane(n: Int, cases: Array[Array[Int]], width: Array[Int]): Array[Int] = {
        var result = ArrayBuffer[Int]()
        
        for (i <- cases){
            result += width.slice(i(0),i(1)+1).min
        }
        return result.toArray

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nt = stdin.readLine.split(" ")

        val n = nt(0).trim.toInt

        val t = nt(1).trim.toInt

        val width = stdin.readLine.split(" ").map(_.trim.toInt)

        val cases = Array.ofDim[Int](t, 2)

        for (i <- 0 until t) {
            cases(i) = stdin.readLine.split(" ").map(_.trim.toInt)
        }

        val result = serviceLane(n, cases, width)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
