import scala.collection.mutable.Stack
import scala.collection.mutable.Queue
import scala.util.control._

class Solution {
  
  //Write your code here
  var queue = new ListBuffer[String]()
  var stack = new ListBuffer[String]()

  def pushCharacter(s : String) {
    stack += s
  }

  def enqueueCharacter(s : String) {
    queue.insert(0, s)
  }

  def popCharacter() : String = {
    return stack.remove(stack.size-1)
  }

  def dequeueCharacter() : String = {
    return queue.remove(queue.size-1)
  }
}

object Solution {
    def main(args: Array[String]) {
        // read the string s
        var s=scala.io.StdIn.readLine();
        // create the Solution class object p
        var obj=new Solution();
        var i=0;
        var len=s.length();
        //push/enqueue all the characters of string s to stack
        for(i<- 0 to len-1){
            obj.pushCharacter(s.charAt(i));
            obj.enqueueCharacter(s.charAt(i));
        }
      
        var isPalindrome=true;
        /*pop the top character from stack
          dequeue the first character from queue
          compare both the characters*/

        val loop = new Breaks;
        loop.breakable {
            for(i<- 0 to len/2){
                if(obj.popCharacter()!=obj.dequeueCharacter()){
                    isPalindrome=false;
                    loop.break;
                }
            }
        }
      
        //finally print whether string s is palindrome or not
        if(isPalindrome){
            println("The word, "+s+", is a palindrome." );
        }
        else{
            println("The word, "+s+", is not a palindrome." );
        }
    }
}

------------

import scala.collection.mutable.Stack
import scala.collection.mutable.Queue
import scala.util.control._

class Solution {
  
  //Write your code here
  var stack = new Stack[Char]()
  var queue = new Queue[Char]()

  def pushCharacter(s : Char) = stack.push(s)
  def popCharacter() = stack.pop()

  def enqueueCharacter(s : Char) = queue.enqueue(s)
  def dequeueCharacter() = queue.dequeue()
}

object Solution {
    def main(args: Array[String]) {
        // read the string s
        var s=scala.io.StdIn.readLine();
        // create the Solution class object p
        var obj=new Solution();
        var i=0;
        var len=s.length();
        //push/enqueue all the characters of string s to stack
        for(i<- 0 to len-1){
            obj.pushCharacter(s.charAt(i));
            obj.enqueueCharacter(s.charAt(i));
        }
      
        var isPalindrome=true;
        /*pop the top character from stack
          dequeue the first character from queue
          compare both the characters*/

        val loop = new Breaks;
        loop.breakable {
            for(i<- 0 to len/2){
                if(obj.popCharacter()!=obj.dequeueCharacter()){
                    isPalindrome=false;
                    loop.break;
                }
            }
        }
      
        //finally print whether string s is palindrome or not
        if(isPalindrome){
            println("The word, "+s+", is a palindrome." );
        }
        else{
            println("The word, "+s+", is not a palindrome." );
        }
    }
}