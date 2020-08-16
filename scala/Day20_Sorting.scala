object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        var swap_count = 0
        for(a_i <- 0 to n-1) {
        	a(a_i) = sc.nextInt();
        }
        // Write Your Code Here
        for(i <- a.size-1 to 0 by -1) {
            for(j <- 0 to i-1) {
                if(a(j) > a(j+1)){
                    val temp = a(j)
                    a(j) = a(j+1)
                    a(j+1) = temp
                    swap_count += 1
                }
            }
        }
        println("Array is sorted in " + swap_count +" swaps.")
        println("First Element: " + a(0))
        println("Last Element: " + a(n-1))
    }
}