import sys

def get_prime_list(n):
    sieve = [True] * n

    m = int(n ** 0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:
            for j in range(i+i, n, i):
                sieve[j] = False

    return [i for i in range(2, n) if sieve[i] == True]

def check_prime(num):
    prime_list = get_prime_list(num+1)

    if num in prime_list:
        return True
    else:
        return False

n = int(sys.stdin.readline())

for i in range(n):
    num = int(sys.stdin.readline())

    if check_prime(num):
        print("Prime")
    else:
        print("Not prime")
