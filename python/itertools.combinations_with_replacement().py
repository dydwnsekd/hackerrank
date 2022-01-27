import sys
from itertools import combinations_with_replacement

if __name__ == '__main__':
    a, b = sys.stdin.readline().split()

    result = list(combinations_with_replacement(a, int(b)))
    for i in range(len(result)):
        result[i] = sorted(result[i])
    result = sorted(result)

    for i in result:
        print("".join(i))