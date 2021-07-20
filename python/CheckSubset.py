n = int(input())

for i in range(n):
    input()
    a = list(input().split())
    input()
    b = list(input().split())
    
    for j in a:
        flag = True
        if j not in b:
            print("False")
            flag = False
            break
    if flag:
        print("True")