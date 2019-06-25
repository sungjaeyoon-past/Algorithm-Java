test_case=int(input())

for case in range(0,test_case):
    DP=[0,1,2,4]
    num=int(input())
    if num<4:
        print(DP[num])
    else:
        DP=[0]*(num+1)
        DP[1],DP[2],DP[3]=1,2,4
        for i in range(4,num+1):
            DP[i]=DP[i-1]+DP[i-2]+DP[i-3]    
    
        print(DP[num])
