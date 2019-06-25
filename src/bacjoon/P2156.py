N=int(input())
po=[0]
for _ in range(N):
    po.append(int(input()))
DP=[0 for i in range(N+1)]

if N<3:
    if N==1:
        print(po[-1])
    if N==2:
        print(po[-1]+po[-2])
else:
    DP[1]=po[1]
    DP[2]=po[1]+po[2]
    for i in range(3,N+1):
        DP[i]=max(po[i]+po[i-1]+DP[i-3],po[i]+DP[i-2],DP[i-1])

    print(DP[-1])

