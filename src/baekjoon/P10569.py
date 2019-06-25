N=int(input())
for _ in range(N):
    arr=list(map(lambda x:int(x),input().split()))
    print(2-(arr[0]-arr[1]))
