if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    
    arr = list(set(arr))
    arr.sort()
    arr.reverse()
    print (arr[1])