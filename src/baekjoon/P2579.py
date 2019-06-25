N=int(input())
co=[0]
for _ in range(N):
    co.append(int(input()))

DP=[0 for i in range(N+1)]

DP[1]=co[1]
DP[2]=DP[1]+co[2]
for i in range(3,N+1):
    DP[i]=co[i]+max(co[i-1]+DP[i-3],DP[i-2])

print(DP[-1])
