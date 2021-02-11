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

    // Complete the introTutorial function below.
    def introTutorial(V: Int, arr: Array[Int]): Int = {
        
        arr.indexOf(V)

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val V = stdin.readLine.trim.toInt

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = introTutorial(V, arr)

        printWriter.println(result)

        printWriter.close()
    }
}
