arr=list(map(lambda x:int(x),input().split()))
all=arr.pop()
nam=all%sum(arr)

can=False
for i in arr:
    if nam%i==0:
        can=True
        break
if can:
    print(1)
else:
    print(0)
