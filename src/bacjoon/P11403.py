#input setting
N=int(input())
graph=[[] for i in range(N+1)]
for i in range(1,N+1):
    j=list(map(int,input().split()))
    for num,k in enumerate(j):
        if k==1:
            graph[i].append(num+1)

def bfs(start):
    result=[]
    visited=[False for i in range(N+1)]
    queue=[start]
    startCycle=False
    while queue:
        v=queue.pop(0)
        visited[v]=True
        result.append(v)
        for i in graph[v]:
            if i not in queue and visited[i]==False:
                queue.append(i)
            if startCycle==False and i==start:
                startCycle=True
    if not startCycle:
        del result[result.index(start)]
    return result

result=[[0 for i in range(N)] for i in range(N)]

#start bfs 1~N
for i in range(1,N+1):
    connect=sorted(bfs(i))
    for j in connect:
        result[i-1][j-1]=1

for i in result:
    d=""
    for j in i:
        d+=str(j)+" "
    print(d[:-1])
