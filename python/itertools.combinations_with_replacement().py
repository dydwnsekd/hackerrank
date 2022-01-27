import sys
from itertools import combinations_with_replacement

if __name__ == '__main__':
    a, b = sys.stdin.readline().split()

    result = list(combinations_with_replacement(a, int(b)))
    result = sorted(result)

    for i in result:
        print("".join(i))