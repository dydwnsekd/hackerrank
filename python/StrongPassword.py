#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumNumber function below.
def minimumNumber(n, password):
    numbers = "0123456789"
    lower_case = "abcdefghijklmnopqrstuvwxyz"
    upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    special_characters = "!@#$%^&*()-+"
    
    strong_flag = [False, False, False, False,]
    for i in password:
        if not(strong_flag[0]):
            if i in numbers:
                strong_flag[0] = True
        
        if not(strong_flag[1]):
            if i in lower_case:
                strong_flag[1] = True
                
        if not(strong_flag[2]):
            if i in upper_case:
                strong_flag[2] = True
                
        if not(strong_flag[3]):
            if i in special_characters:
                strong_flag[3] = True
        
    false_count = strong_flag.count(False)
    print(strong_flag)
    print(false_count)
    
    if 6 < n:
        return false_count
    else:
        if 6-n > false_count:
            return (6-n)
        else:
            return false_count
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    password = input()

    answer = minimumNumber(n, password)

    fptr.write(str(answer) + '\n')

    fptr.close()
