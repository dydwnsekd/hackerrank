object Solution {

    def main(args: Array[String]) {
        var Array(d1, m1, y1) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
        var Array(d2, m2, y2) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
        
        if (y1 < y2)
            print (0);
        else if (m1 < m2)
            print (0);
        else if (y1 > y2)
            print(10000);
        else if (m1 > m2)
            print ((m1-m2) * 500);
        else if (d1 > d2)
            print ((d1-d2) * 15);
        else
            print (0);
    }
}