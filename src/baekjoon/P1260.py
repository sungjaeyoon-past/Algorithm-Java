#input setting
value=list(map(int,input().split()))
N=value[0]
V=value[1]
start=value[2]
graph=[[] for i in range(N+1)]
for _ in range(V):
    arr=list(map(int,input().split()))
    graph[arr[0]].append(arr[1])
    graph[arr[1]].append(arr[0])

def dfs(start):
    stack=[start]
    visited=[False for i in range(N+1)]
    result=[]
    while stack:
        v=stack.pop()
        result.append(v)
        visited[v]=True
        node=sorted(graph[v],reverse=True)
        for i in node:
            if not visited[i] and i not in stack:
                stack.append(i)
            elif not visited[i] and i in stack:
                del stack[stack.index(i)]
                stack.append(i)
    return result

def bfs(start):
    queue=[start]
    visited=[False for i in range(N+1)]
    result=[]
    while queue:
        v=queue.pop(0)
        result.append(v)
        visited[v]=True
        node=sorted(graph[v])
        for i in node:
            if not visited[i] and i not in queue:
                queue.append(i)
    return result

d=""
for i in dfs(start):
    d+=str(i)+" "
b=""
for i in bfs(start):
    b+=str(i)+" "
print(d[:-1])
print(b[:-1])

