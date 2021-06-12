if __name__ == '__main__':
    
    student = list()
    score_list = list()
    
    for _ in range(int(input())):
        name = input()
        score = float(input())
        student.append([name, score])
        score_list.append(score)
    
    second_score = sorted(list(set(score_list)))[1]
    
    for i in sorted(student):
        if second_score == i[1]:
            print(i[0])
