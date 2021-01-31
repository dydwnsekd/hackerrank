#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the funnyString function below.
def funnyString(s):
    s_diff_num = []
    s_reverse_diff_num = []
    
    for i in range(len(s)-1):
        s_diff_num.append(abs(ord(s[i]) - ord(s[i+1])))
        
    for i in range(len(s)-1, 0, -1):
        s_reverse_diff_num.append(abs(ord(s[i]) - ord(s[i-1])))
        
    if s_diff_num == s_reverse_diff_num:
        return "Funny"
    else:
        return "Not Funny"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = funnyString(s)

        fptr.write(result + '\n')

    fptr.close()
