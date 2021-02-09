#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the kaprekarNumbers function below.
def kaprekarNumbers(p, q):
    result_list = list()
    for i in range(p, q+1):
        temp = str(i ** 2)
        if len(temp) == 1:
            temp_1 = int(temp)
            temp_2 = 0
        else:
            temp_1 = int(temp[:len(temp)//2])
            temp_2 = int(temp[len(temp)//2:])
        if temp_1 + temp_2 == i:
            result_list.append(i)
        
    if len(result_list) == 0:
        print("INVALID RANGE")
    else:
        for i in result_list:
            print(i, end=" ")

if __name__ == '__main__':
    p = int(input())

    q = int(input())

    kaprekarNumbers(p, q)
