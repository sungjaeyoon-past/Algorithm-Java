arr=list(map(lambda x:int(x),input().split()))
print(min(arr[0],arr[1],abs(arr[2]-arr[0]),abs(arr[3]-arr[1])))
