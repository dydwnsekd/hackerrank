 //def f(arr:List[Int]):Int = arr.zipWithIndex.filter(_._1 % 2 == 1).unzip._1.sum
 
 def f(arr:List[Int]):Int = arr.filter(_ % 2 == 1).sum
 