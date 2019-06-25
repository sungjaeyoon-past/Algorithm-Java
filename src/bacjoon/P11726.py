N=int(input())
DP=[0 for i in range(N+1)]
DP[1]=1
DP[2]=2
for i in range(3,N+1):
    DP[i]=DP[i-1]+DP[i-2]
print(DP[-1]%10007)
