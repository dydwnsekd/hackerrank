import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      int heightLeft = 0;
      int heightRight = 0;

      if(root.left != null)
          heightLeft = getHeight(root.left) + 1;
      if(root.right != null)
          heightRight = getHeight(root.right) + 1;

      if (heightLeft > heightRight)
        return heightLeft;
      else
        return heightRight;
    }

    public static Node insert(Node root,int data){