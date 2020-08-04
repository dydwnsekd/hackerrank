""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""

import sys

def checkBST(root):
    max = 999999
    min = -999999

    return check(root, min, max)

def check(n, min_val, max_val):
    if(n==None):
        return True
    if(n.data <= min_val or n.data >= max_val):
        return False
    return check(n.left, min_val, n.data) and check(n.right, n.data, max_val)