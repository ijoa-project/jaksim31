n = int(input())

als = []
for i in range(n):
    arr = list(map(str, input().split()))
    als.append(arr)

tmp=['ChongChong']
num=0

for i in range(len(als)):
    if als[i][0] in tmp:
        tmp.append(als[i][1])
    elif als[i][1] in tmp:
        tmp.append(als[i][0])

print(len(set(tmp))) 