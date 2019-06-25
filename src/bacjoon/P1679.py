N=int(input())
for _ in range(N):
    arr=list(input().split())
    s=''
    for i in range(0,len(arr[1])):
        for _ in range(int(arr[0])):
            s+=arr[1][i]
    print(s)
                       
