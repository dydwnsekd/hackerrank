#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the checkMagazine function below.
def checkMagazine(magazine, note):
    magazine_dict = {}

    for i in magazine:
        if i not in magazine_dict:
            magazine_dict[i] = 1
        else:
            magazine_dict[i] += 1
    
    for i in note:
        if i in magazine_dict and magazine_dict[i] > 0:
            magazine_dict[i] -= 1
        else:
            print("No")
            return False
    print("Yes")
    return True

if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
