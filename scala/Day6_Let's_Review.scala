object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val n = scala.io.StdIn.readInt()
        var str = ""
        var temp1 = ""
        var temp2 = ""
        for ( i <- 0 until n)
        {
            str = scala.io.StdIn.readLine()
            temp1 = ""
            temp2 = ""
            
            for (j <- 0 until str.length())
            {
                if ( j % 2 == 0 )
                    temp1 += str.charAt(j)
                else
                    temp2 += str.charAt(j)
            }

            println(temp1 + " " + temp2) 
        }
    }
}