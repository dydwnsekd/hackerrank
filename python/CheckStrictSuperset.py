# Enter your code here. Read input from STDIN. Print output to STDOUT
origin = input().split()
flag = True

for i in range(int(input())):
    a = input().split()
    for j in a:
        if j not in origin:
            flag = False
            break
    
print(flag)