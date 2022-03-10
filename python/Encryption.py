#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'encryption' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def encryption(s):
    s = s.replace(' ', '')
    n = len(s)
    s_list = []
    result = []

    f = math.floor(math.sqrt(n))
    c = math.ceil(math.sqrt(n))
    
    for i in range(c):
        result.append(s[i::c])
        
    return ' '.join(result)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = encryption(s)

    fptr.write(result + '\n')

    fptr.close()
