number=int(input())
queue=[1,2,3,4,5,6,7,8,9]
DP=[]

if number>1023:
    print(-1)
elif number<10:
    print(queue[number-1])
else:
    while queue:
        if len(DP)==number:
            break
        v=queue.pop(0)
        DP.append(v)
        
        for i in range(0,int(v%10)):
            queue.append((v*10)+i)
    print(DP[number-1])
        
    
    
