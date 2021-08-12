from collections import namedtuple
n = int(input())

marks = input().split()

student = namedtuple('student', ','.join(marks))
student_list = []

mark_total = 0

for i in range(n):
    students_field = input().split()
    students = student(students_field[0], students_field[1], students_field[2], students_field[3])
    
    mark_total += int(students.MARKS)

print(mark_total / n)
    