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

    // Complete the kangaroo function below.
    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
        var k1 = x1
        var k2 = x2
    
        while((k1 < k2 && v1 > v2) || (k1 > k2 && v1 < v2)) {
            k1+=v1
            k2+=v2
        }

        if (k1 == k2)
            return "YES"
    
        return "NO"

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val x1V1X2V2 = stdin.readLine.split(" ")

        val x1 = x1V1X2V2(0).trim.toInt

        val v1 = x1V1X2V2(1).trim.toInt

        val x2 = x1V1X2V2(2).trim.toInt

        val v2 = x1V1X2V2(3).trim.toInt

        val result = kangaroo(x1, v1, x2, v2)

        printWriter.println(result)

        printWriter.close()
    }
}
