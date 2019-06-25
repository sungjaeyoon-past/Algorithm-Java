import sys
N=int(sys.stdin.readline())
graph=[]
for _ in range(N):
    l=sys.stdin.readline()
    na=[]
    for i in range(N):
        na.append(int(l[i]))
    graph.append(na)

house=[]
for i in range(N):
    for j in range(N):
        if graph[i][j]==1:
            print("---")
            count=1
            stack=[[i,j]]
            graph[i][j]=0
            while stack:
                print(stack)
                v=stack.pop()
                #up
                if (i-1)>=0:
                    arr=[i-1,j]
                    if graph[arr[0]][arr[1]]==1:
                        graph[arr[0]][arr[1]]=0
                        stack.append(arr)
                        count+=1                  
                #down
                if (i+1)<N:
                    arr=[i+1,j]
                    if graph[arr[0]][arr[1]]==1:
                        graph[arr[0]][arr[1]]=0
                        stack.append(arr)
                        count+=1 
                #left
                if (j-1)>=0:
                    arr=[i,j-1]
                    if graph[arr[0]][arr[1]]==1:
                        graph[arr[0]][arr[1]]=0
                        stack.append(arr)
                        count+=1           
                #right
                if (j+1)<N:
                    arr=[i,j+1]
                    if graph[arr[0]][arr[1]]==1:
                        graph[arr[0]][arr[1]]=0
                        stack.append(arr)
                        count+=1 
            print("---")
            house.append(count)
house.sort()
print(len(house))
for i in house:
    print(i)
    

