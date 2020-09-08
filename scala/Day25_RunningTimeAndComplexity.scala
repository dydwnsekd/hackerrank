object Solution {

    def check_prime(num: Int) : Boolean = {
        if(num == 1)
            return false
        else if(num <= 3)
            return true
        else {
            var end_num = math.sqrt(num).toInt + 1
            for (i <- 2 until end_num) {
                if(num % i == 0)
                    return false
            }
            return true
        }
    }

    def main(args: Array[String]) {
        var n = scala.io.StdIn.readInt()

        for(i <- 0 until n) {
            var num = scala.io.StdIn.readInt()
            if (check_prime(num))
                println("Prime")
            else
                println("Not prime")
        }
    }
}