def print_formatted(number):
    length = len(bin(number)) - 2
    for i in range(1, number+1):
        print(f'{i:>{length}} {i:>{length}o} {i:>{length}X} {i:>{length}b}')
        

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)