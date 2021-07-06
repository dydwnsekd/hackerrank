n = int(input())

for _ in range(n):
    try:
        n1, n2 = map(int, input().split())
        print(n1//n2)
    except ZeroDivisionError as e:
        print(f"Error Code: {e}")
    except ValueError as e:
        print(f"Error Code: {e}")