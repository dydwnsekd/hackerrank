import sys

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

"""
    def levelOrder(self,root):
        #Write your code here
        print(root.data, end=" ")
        if root.left != None:
            self.levelOrder(root.left)
        if root.right != None:
            self.levelOrder(root.right)
"""
    def levelOrder(self,root):
        q = [ root ]
        #i = 0
        
        #while i < len( q ):
        #    current = q[i]
        #    i += 1
        
        for current in q:    
            if current:
                print(current.data, end=' ')

                q.append(current.left)
                q.append(current.right) 

T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)
