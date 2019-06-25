#        10   -4    3    1    5     6    -35   12   21   -1
#max     10   10   10   10    15   21    21    21   33   33
#table   10    6    9   10    15   21     0    12   33   32

N=int(input())
arr=list(map(lambda x:int(x),input().split()))
arr.insert(0,0)

t=False
for i in range(1,len(arr)):
    if arr[i]>=0:
        t=True
if t:
    maxN=[0 for i in range(N+1)]
    table=[0 for i in range(N+1)]

    for i in range(1,N+1):
        table[i]=table[i-1]+arr[i]
        if table[i]<0:
            table[i]=0      

        if maxN[i-1]<table[i]:
            maxN[i]=table[i]
        else:
            maxN[i]=maxN[i-1]

    print(maxN[-1])
else:
    del arr[arr.index(0)]
    print(max(arr))
