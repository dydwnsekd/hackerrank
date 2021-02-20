#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'getTotalX' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#

def getGCD(num1, num2):
    r = -1
    if num1 < num2: num1, num2 = num2, num1

    while (r!=0):
        r = num1 % num2
        num1, num2 = num2, r

    return(num1)
    
def getLCM(num1, num2):
    return int((num1 * num2) / getGCD(num1, num2))

def getTotalX(a, b):
    # Write your code here
    count = 0
    if len(a) >= 2:
        lcm = getLCM(a[0], a[1])
        for i in range(2, len(a)):
            lcm = getLCM(a[i], lcm)
    else:
        lcm = a[0]
    
    gcd = b[0]
    for i in range(1, len(b)):
        gcd = getGCD(b[i], gcd)
        
    for i in range(1, (gcd // lcm) + 1):
        if gcd % (lcm * i) == 0:
            count += 1
            
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    brr = list(map(int, input().rstrip().split()))

    total = getTotalX(arr, brr)

    fptr.write(str(total) + '\n')

    fptr.close()
