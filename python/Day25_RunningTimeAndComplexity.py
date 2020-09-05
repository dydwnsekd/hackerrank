# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys

def check_prime(num):
    for i in range(2, num):
        if num % i == 0:
            return False
    
    return True

n = int(sys.stdin.readline())

for i in range(n):
    num = int(sys.stdin.readline())

    if check_prime(num):
        print("Prime")
    else:
        print("Not prime")