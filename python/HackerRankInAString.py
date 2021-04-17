#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the hackerrankInString function below.
def hackerrankInString(s):
    hacker_index = 0
    hackerrank_string = "hackerrank"
    for i in s:
        if hacker_index == len(hackerrank_string)-1:
            return "YES"
        elif hackerrank_string[hacker_index] == i:
            hacker_index += 1
    
    return "NO"
            

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = hackerrankInString(s)

        fptr.write(result + '\n')

    fptr.close()
