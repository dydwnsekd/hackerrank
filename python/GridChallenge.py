#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the gridChallenge function below.
def gridChallenge(grid):
    
    new_grid = []
    
    for i in range(len(grid)):
        new_grid.append(sorted(grid[i]))
    
    for i in range(len(grid[0])):
        temp_list = []
        for j in range(len(grid)):
            temp_list.append(new_grid[j][i])
        print(temp_list)
        if temp_list != sorted(temp_list):
            return "NO"
            
    return "YES"
                
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        grid = []

        for _ in range(n):
            grid_item = input()
            grid.append(grid_item)

        result = gridChallenge(grid)

        fptr.write(result + '\n')

    fptr.close()
