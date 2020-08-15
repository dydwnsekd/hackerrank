#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here

swap_count = 0

for i in range(len(a)-1, 0, -1):
    for j in range(0,i):
        if a[j] > a[j+1]:
            a[j], a[j+1] = a[j+1], a[j]
            swap_count += 1

print("Array is sorted in {} swaps.".format(swap_count))
print("First Element: {}".format(a[0]))
print("Last Element: {}".format(a[-1]))