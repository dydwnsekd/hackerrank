#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the caesarCipher function below.
def caesarCipher(s, k):
    new_string = ""
    k = k % 26
    
    for i in s:
        if 'a' <= i <= 'z':
            new_string += chr(((ord(i) - 97 + k) % 26) + 97)
        elif 'A' <= i <= 'Z':
            new_string += chr(((ord(i) - 65 + k) % 26) + 65)
        else:
            new_string += i
            
    return new_string

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    k = int(input())

    result = caesarCipher(s, k)

    fptr.write(result + '\n')

    fptr.close()
