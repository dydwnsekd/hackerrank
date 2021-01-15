#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    max_length = 0
    search_num = []
    for i in a:
        if i not in search_num:
            search_num.append(i)
            picknum_1 = a.count(i) + a.count(i-1)
            picknum_2 = a.count(i) + a.count(i+1)
            if picknum_1 > picknum_2 and max_length < picknum_1:
                max_length = picknum_1
            elif max_length < picknum_2:
                max_length =picknum_2
                
    return max_length
                
            
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
