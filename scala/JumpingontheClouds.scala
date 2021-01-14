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

    // Complete the jumpingOnClouds function below.
    def jumpingOnClouds(c: Array[Int]): Int = {
        var count = 0
        var current_index = 0 
        while(current_index < c.length-1){
            if (current_index+2 < c.length && c(current_index + 2) == 0)
                current_index += 2
            else
                current_index += 1
            count += 1
        }
        
        return count

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val c = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = jumpingOnClouds(c)

        printWriter.println(result)

        printWriter.close()
    }
}
