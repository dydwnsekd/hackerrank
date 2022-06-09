cube = lambda x: pow(x,3)

def fibonacci(n):
    answer = []
    for i in range(n):
        answer.append(make_fibo_num(i))

    return answer
    
def make_fibo_num(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return make_fibo_num(n-1) + make_fibo_num(n-2)

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))