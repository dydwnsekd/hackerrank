# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
S = ''
ops = []
prev_S = []

for _ in range(n):
    ops_item = input()
    ops.append(ops_item)

for op in ops:
    if op[0] == '1':
        prev_S.append(S)
        S = S + op[2:]
    elif op[0] == '2':
        prev_S.append(S)
        S = S[:len(S)-int(op[2:])]
    elif op[0] == '3':
        print(S[int(op[2:])-1])
    elif op[0] == '4':
        S = prev_S.pop()