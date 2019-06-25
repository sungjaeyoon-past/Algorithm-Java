import sys
#위상정렬
def topologicalSort(graph,direction,cost):
    stack=[]
    result=[]

    #no direction add stack
    for i in range(1,len(graph)):
        if len(graph[i])==0:
            stack.append(i)
    
    while stack:
        v=stack.pop()
        result.append(v)
        #del direction graph
        for i in direction[v]:
            del graph[i][graph[i].index(v)]
            if len(graph[i])==0:
                stack.append(i)
                
    return result

TEST_CASE=int(input())
for _ in range(TEST_CASE):
    
    #input(buildingCount seqNum)
    build=list(map(lambda x:int(x),sys.stdin.readline().split()))
    buildingCount=build[0]
    seqNum=build[1]

    #input(cost[0 ~ buildingCount+1)
    cost=list(map(lambda x:int(x),sys.stdin.readline().split()))
    cost.insert(0,0) #set index (cost[i]=building num)

    #input sequence    
    graph=[[] for i in range(0,build[0]+1)]
    originGraph=[[] for i in range(0,build[0]+1)]
    direction=[[] for i in range(0,build[0]+1)]
    for _ in range(seqNum):
        seq=list(map(lambda x:int(x),sys.stdin.readline().split()))
        originGraph[seq[1]].append(seq[0])
        graph[seq[1]].append(seq[0])
        direction[seq[0]].append(seq[1])
        
    #input result buildingNum
    obj=int(input())

    #topological Sort
    result=topologicalSort(graph,direction,cost)

    #DP
    DP=[ 0 for i in range(0,buildingCount+1)]
    for i in result:
        maxNum=0
        for j in originGraph[i]:
            if DP[j]>maxNum:
                maxNum=DP[j]
        DP[i]=maxNum+cost[i]
        if i==obj:
            break
    #result
    print(DP[obj])
