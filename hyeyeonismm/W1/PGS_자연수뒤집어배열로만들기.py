def solution(n):
    n = list(str(n))
    m= n[::-1]
    answer = []
    for i in m:
        answer.append(int(i))
        
    return answer