house=int(input())
costs=[]

for _ in range(0,house):
    costs.append(list(map(lambda x:int(x),input().split())))

DP=[]
for cost in costs:
    if len(DP)==0:
        DP.append(cost)
    else:
        arr=[]
        arr.append(cost[0] + min(DP[-1][1],DP[-1][2]))
        arr.append(cost[1] + min(DP[-1][0],DP[-1][2]))
        arr.append(cost[2] + min(DP[-1][0],DP[-1][1]))
        DP.append(arr)
print(min(DP[-1]))
