import sys

sys.stdin.readline()
set_arr = list(map(int, sys.stdin.readline().split()))

n = int(sys.stdin.readline())

for _ in range(n):
    command, args_count = sys.stdin.readline().split()
    print(command, args_count)
    
    sys.stdin.readline()
