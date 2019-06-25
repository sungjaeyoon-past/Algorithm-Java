input()
arr1=list(map(lambda x:int(x),input().split()))
arr2=list(map(lambda x:int(x),input().split()))
arr1=sorted(arr1)
arr2=sorted(arr2,reverse=True)
count=0
for i in range(len(arr1)):
    count+=arr1[i]*arr2[i]
print(count)
