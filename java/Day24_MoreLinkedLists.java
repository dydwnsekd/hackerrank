import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
        ArrayList<Integer> print_list = new ArrayList<Integer>();
        Node current = head;
        while(true) {
            if (!print_list.contains(current.data)) {
                print_list.add(current.data);
                System.out.printf("%d ", current.data);
            }
            if (current.next == null)
                break;
            else
                current = current.next;
        }
        return null;
    }

	 public static  Node insert(Node head,int data)