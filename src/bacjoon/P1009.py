N=int(input())
for _ in range(N):
    stack=[]
    arr=list(map(lambda x:int(x),input().split()))
    cur=arr[0]%10
    for i in range(0,arr[1]):
        if len(stack)==0:
            stack.append(cur)
        else:
            nam=(cur*arr[0])%10
            if stack[0]==nam:
                break
            else:
                stack.append(nam)
                cur=nam
    if stack[0]==0:
        print(10)
    else:
        print(stack[arr[1]%len(stack)-1])
    
