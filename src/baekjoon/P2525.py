arr=list(map(lambda x:int(x),input().split()))
time=int(input())

arr[1]=arr[1]+time

if arr[1]>=60:
    addSi=int(arr[1]/60)
    arr[1]=arr[1]%60
    arr[0]+=addSi
if arr[0]>=24:
    arr[0]-=24
print(arr[0],arr[1])
