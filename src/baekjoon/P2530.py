arr=list(map(lambda x:int(x),input().split()))
time=int(input())

arr[2]=arr[2]+time
if arr[2]>=60:
    addBoon=int(arr[2]/60)
    arr[2]=arr[2]%60
    arr[1]+=addBoon
if arr[1]>=60:
    addSi=int(arr[1]/60)
    arr[1]=arr[1]%60
    arr[0]+=addSi
arr[0]=arr[0]%24

print(arr[0],arr[1],arr[2])


