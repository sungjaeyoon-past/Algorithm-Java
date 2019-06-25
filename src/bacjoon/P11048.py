N,M=input().strip().split(' ')
table=[]
for i in range(int(N)):
    l=list(map(int,input().split()))
    table.append(l)
print(table)
DP=[[0 for i in range(int(M))] for i in range(int(N))]
#for i in range(0,N):
#    for j in range(0,M):
        
