N=int(input())
arr=[]
for _ in range(N):
    arr.append(list(map(lambda x:int(x),input().split())))
if N==1:
    print(arr[0][0])
if N==2:
    print(max(arr[0][0]+arr[1][0],arr[0][0]+arr[1][1]))
else:
    arr[1][0]=arr[1][0]+arr[0][0]
    arr[1][1]=arr[1][1]+arr[0][0]
    for i in range(2,N):
        arr[i][0]=arr[i][0]+arr[i-1][0]
        for j in range(1,len(arr[i])-1):
            arr[i][j]=max(arr[i][j]+arr[i-1][j-1],arr[i][j]+arr[i-1][j])
        arr[i][-1]=arr[i][-1]+arr[i-1][-1]
    print(max(arr[-1]))
