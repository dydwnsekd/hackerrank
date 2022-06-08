cube = lambda x: x**2

def fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

def fibo_list(n):
    answer = []
    for i in range(n):
        answer.append(fibonacci(i))

    return answer

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibo_list(n))))