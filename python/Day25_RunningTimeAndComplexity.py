import sys
# 참고 https://myjamong.tistory.com/139

def check_prime(num):
    if num == 1:
        return False
    elif num <= 3:
        return True
    else:
        end_num = int(num ** 0.5) + 1
        for i in range(2, end_num):
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
