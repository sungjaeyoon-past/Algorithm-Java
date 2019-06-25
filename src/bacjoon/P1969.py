import sys
l=list(map(int,sys.stdin.readline()[:-1].split()))
NUM=l[0]
LENGTH=l[1]
result=[0]

DNA=[[]]
for i in range(NUM):
    arr=list(sys.stdin.readline()[:-1])
    DNA.append(arr)

for i in range(1,NUM+1):
    hamming=0
    for j in range(1,NUM+1):
        #DNA[i] : DNA[j]
        for k in range(0,LENGTH):

            if DNA[i][k]!=DNA[j][k]:
                hamming+=1
                print(i,j,DNA[i][k],DNA[j][k])
    print(hamming)
    result.append(hamming)
