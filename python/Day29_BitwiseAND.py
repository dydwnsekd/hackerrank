#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        max_num = -1 
        nk = input().split()

        n = int(nk[0])
        k = int(nk[1])

        for i in range(n, 1, -1):
            for j in range(1, i):
                if max_num < i&j < k:
                    max_num = i&j
        
        print (max_num)

        
