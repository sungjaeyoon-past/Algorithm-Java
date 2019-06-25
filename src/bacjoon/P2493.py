num=int(input())
top=list(map(lambda x:int(x),input().split()))
top=top[:num]

result=[0]*num

stack=[]

for i in range(len(top)-1,-1,-1):
    if not stack:
        stack.append([i,top[i]])
    else:
        if top[i]>=stack[-1][1]:
            while stack:
                if stack[-1][1]<top[i]:
                    arr=stack.pop()
                    result[arr[0]]=i+1
                else:
                    break
        stack.append([i,top[i]])
                
print(result)



    
