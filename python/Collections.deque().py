from collections import deque

dq = deque()

n = int(input())

# for i in range(n):
#     command = input().split()
#     if command[0] == 'append':
#         dq.append(command[1])
#     elif command[0] == 'appendleft':
#         dq.appendleft(command[1])
#     elif command[0] == 'pop':
#         dq.pop()
#     elif command[0] == 'popleft':
#         dq.popleft()

for i in range(n):
    cmd, *args = input().split()
    getattr(dq, cmd)(*args)

print(*dq)
