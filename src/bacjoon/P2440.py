N=int(input())
for i in range(0,N):
    s=''
    for _ in range(0,N-i):
        s+='*'
    print(s)
