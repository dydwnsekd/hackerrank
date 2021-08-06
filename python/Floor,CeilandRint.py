import numpy

numpy.set_printoptions(sign=' ')
n_arr = numpy.array(list(map(float, input().split())))

print(numpy.floor(n_arr))
print(numpy.ceil(n_arr))
print(numpy.rint(n_arr))