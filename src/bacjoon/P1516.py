N=int(input())
graph=[[] for i in range(N+1)]
cost=[0 for i in range(N+1)]
indegree=[ 0 for i in range(N+1)]
result=[]

for i in range(1,N+1):
    arr=list(map(lambda x:int(x),input().split()))
    cost[i]=arr[0]
    for j in range(1,len(arr)-1):
        graph[i].append(arr[j])
        indegree[arr[j]]+=1

#print(graph)
#print(cost)
#print(indegree)

def topologicalSort():
    queue=[]
    for i in range(1,N+1):
        if indegree[i]==0:
            queue.append(i)

    while queue:
        v=queue.pop(0)
        result.append(v)
        for i in graph[v]:
            indegree[i]-=1
            if indegree[i]==0:
                queue.append(i)

topologicalSort()
result.reverse()
#print(result)


for i in range(1,len(result)):
    maxNum=0
    for j in graph[result[i]]:
        if cost[j]>maxNum:
            maxNum=cost[j]
    cost[result[i]]=cost[result[i]]+maxNum 

for i in range(1,len(cost)):
    print(cost[i])
        
