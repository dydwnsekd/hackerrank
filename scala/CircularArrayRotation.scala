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

    // Complete the circularArrayRotation function below.
    def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
        var result_ArrayBuffer = ArrayBuffer[Int]()
        val rotation = k % a.length
        for (i <- queries){
            println(i-rotation)
            if (i-rotation >= 0)
                result_ArrayBuffer += a(i-rotation)
            else
                result_ArrayBuffer += a(a.length+(i-rotation))
        }
    
        return result_ArrayBuffer.toArray

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nkq = stdin.readLine.split(" ")

        val n = nkq(0).trim.toInt

        val k = nkq(1).trim.toInt

        val q = nkq(2).trim.toInt

        val a = stdin.readLine.split(" ").map(_.trim.toInt)

        val queries = Array.ofDim[Int](q)

        for (i <- 0 until q) {
            val queriesItem = stdin.readLine.trim.toInt
            queries(i) = queriesItem}

        val result = circularArrayRotation(a, k, queries)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
