import scala.collection.mutable
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        var m = mutable.Map[String,Int]()
        val n = scala.io.StdIn.readInt()
        for ( i <- 0 until n )
        {
            val temp = scala.io.StdIn.readLine.split(" ")
            
            var name = temp(0)
            var phone_num = temp(1).toInt

            m += (name -> phone_num)
        }
        
        while ( true )
        {
            var findkey = scala.io.StdIn.readLine()
            if ( findkey == null )
                return
            var result = m.getOrElse(findkey, "")
            if (result == "")
                println("Not found")
            else
                println(findkey+"="+result)
        }

    }
}