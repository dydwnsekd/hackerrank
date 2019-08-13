if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

    result = 0

    for i in range(3):
        result += student_marks[query_name][i]
    
    print ("%0.2f" % (result / 3))

