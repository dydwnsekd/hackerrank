import numpy

N = int(input())

np_a = None
np_b = None

for i in range(2):
    temp_numpy_list = list()
    for j in range(N):
        temp_list = list(map(int, input().split(" ")))
        temp_numpy_list.append(temp_list)
    
    if i == 0:
        np_a = temp_numpy_list
    else:
        np_b = temp_numpy_list
    
print (numpy.dot(np_a, np_b))

