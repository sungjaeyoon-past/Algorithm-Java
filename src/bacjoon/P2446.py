N=int(input())
for i in range(0,N):
    j=2*(N-i)-1
    s=''
    for _ in range(0,i):
        s+=' '
    for _ in range(0,j):
        s+='*'

    print(s)
for i in range(1,N):
    s=''
    j=2*i+1
    for _ in range(0,N-i-1):
        s+=' '
    for _ in range(0,j):
        s+='*'

    print(s)
