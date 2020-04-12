 // https://www.hackerrank.com/challenges/fp-list-replication/problem
 
def f(num:Int,arr:List[Int]):List[Int] = arr.flatten(List.fill(num)(_))

/* best
def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num)(_))
*/