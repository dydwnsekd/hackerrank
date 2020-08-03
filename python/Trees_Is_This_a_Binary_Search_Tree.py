""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""
num_list = []
flag = False

def checkBST(root):
    if root.data in num_list:
        flag = False
        return 
    else:
        if root.left != None and root.data > root.left.data:
            checkBST(root.left)
        if root.right != None and root.data < root.right.data:
            checkBST(root.right)
        
        if root.left == None and root.right == None:
            flag = True
            
        return
            
    if flag:
        print("Yes")
    else:
        print("No")
            
    