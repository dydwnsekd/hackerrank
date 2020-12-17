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

    // Complete the permutationEquation function below.
    def permutationEquation(p: Array[Int]): Array[Int] = {
        var return_list = ArrayBuffer[Int]()

        for (i <- 1 to p.length)
            return_list+=p.indexOf(p.indexOf(i)+1)+1
        
        return return_list.toArray

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val p = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = permutationEquation(p)

        printWriter.println(result.mkString("\n"))

        printWriter.close()
    }
}
