arr=list(map(lambda x:int(x),input().split()))
arr2=list(map(lambda x:int(x),input().split()))
s=''
for i in arr2:
    if i<arr[1]:
        s+=str(i)+' '
print(s[:-1])
