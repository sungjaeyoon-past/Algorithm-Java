N=int(input())
for _ in range(N):
    arr=list(input().split())
    s='Distances:'
    for i in range(0,len(arr[0])):
        if ord(arr[0][i])<=ord(arr[1][i]):
            num=ord(arr[1][i])-ord(arr[0][i])
        else:
            num=ord(arr[1][i])-ord(arr[0][i])+26
        s+=' '
        s+=str(num)
    print(s)
