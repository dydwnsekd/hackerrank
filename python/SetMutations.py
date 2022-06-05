import sys

def set_mutations(s ,command, args):
    if command == "update":
        s.update(args)
        return s
    elif command == "intersection_update":
        s.intersection_update(args)
        return s
    elif command == "difference_update":
        s.difference_update(args)
        return s
    elif command == "symmetric_difference_update":
        s.symmetric_difference_update(args)
        return s

sys.stdin.readline()
set_arr = set(map(int, sys.stdin.readline().split()))

n = int(sys.stdin.readline())

for _ in range(n):
    command = sys.stdin.readline().split()[0]
    args = list(map(int, sys.stdin.readline().split()))
    
    set_arr = set_mutations(set_arr, command, args)
    
    print(set_arr)