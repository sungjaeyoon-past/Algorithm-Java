N=int(input())
for i in range(1,N+1):
    s=''
    for _ in range(N-i):
        s+=' '
    for _ in range(i):
        s+='*'
    print(s)
