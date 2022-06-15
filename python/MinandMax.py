import numpy
import sys

n, m = list(map(int, sys.stdin.readline().split()))
np_array = numpy.empty((0, m), int)
print(n)
print(m)

for i in range(n):
    temp_list = []
    temp_list.append(list(map(int, sys.stdin.readline().split())))
    np_arr = numpy.append(np_array, numpy.array(temp_list), axis=0)
    
    print(np_arr)
    
print (np_array)