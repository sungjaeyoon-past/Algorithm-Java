N=int(input())
for i in range(N):
    j=2*i+1
    s=''
    for _ in range(0,N-i-1):
        s+=' '
    for _ in range(0,j):
        s+='*'
    print(s)
