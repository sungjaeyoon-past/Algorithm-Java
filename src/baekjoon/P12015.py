int(input())
arr=list(map(lambda x:int(x),input().split()))

number=[]

for i in range(0,len(arr)):
    cur=arr[i]
    count=0
    maxStack=[]
    for j in range(i,len(arr)):
        if len(maxStack)==2:
            if maxStack[0]>maxStack[1]:
                count+=1
            else:
                
            cur=min(maxStack[0],maxStack[1])
            count+=1
            maxStack=[]
        if arr[j]>cur:
            maxStack.append(arr[j])
    number.append(count)

