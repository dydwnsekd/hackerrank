# https://ratsgo.github.io/data%20structure&algorithm/2017/10/22/bst/

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
        
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def getHeight(self,root):
        #Write your code here
        heightLeft = 0
        heightRight = 0

        if root.left != None:
            heightLeft = self.getHeight(root.left) + 1
        if root.right != None:
            heightRight = self.getHeight(root.right) + 1

        return max(heightLeft, heightRight)
    

T=int(input())