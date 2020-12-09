#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the viralAdvertising function below.
def viralAdvertising(n):
    count = 0
    like_num = 5
    
    for i in range(n):
        count += int(like_num / 2)
        like_num = int(like_num / 2) * 3
    
    return count
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = viralAdvertising(n)

    fptr.write(str(result) + '\n')

    fptr.close()
