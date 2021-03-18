#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the appendAndDelete function below.
def appendAndDelete(s, t, k):
    short_len = len(s) if len(s) < len(t) else len(t)
    equal_len = 0
    
    for i in range(short_len):
        if s[i] == t[i]:
            equal_len += 1
        else:
            break
            
    if (len(s) + len(t) - 2*equal_len) > k:
        return "No"
    elif (len(s) + len(t) - 2*equal_len) % 2 == k%2:
        return "Yes"
    elif (len(s) + len(t) - k) < 0:
        return "Yes"
    else:
        return "No"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    t = input()

    k = int(input())

    result = appendAndDelete(s, t, k)

    fptr.write(result + '\n')

    fptr.close()
