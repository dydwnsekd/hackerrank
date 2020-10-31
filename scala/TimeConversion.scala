import java.io.PrintWriter
import java.text.SimpleDateFormat

object Solution {

    /*
     * Complete the timeConversion function below.
     */
    def timeConversion(s: String): String = {
        val inputTimeFormat = new SimpleDateFormat("hh:mm:ssa")
        val timeWithDateFormat = inputTimeFormat.parse(s)
        val outputTimeFormat = new SimpleDateFormat("HH:mm:ss")
        val outputTime = outputTimeFormat.format(timeWithDateFormat)

        return outputTime
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = scan.readLine

        val result = timeConversion(s)

        fw.println(result)

        fw.close()
    }
}
