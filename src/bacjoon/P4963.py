def addStack(table,stack,area):
    if table[area[0]][area[1]]==1:
        table[area[0]][area[1]]=0
        stack.append(area)
        
while True:
    wh=list(map(lambda x:int(x),input().split()))
    w=wh[0]#whight
    h=wh[1]#height

    #end
    if (w+h)==0:
        break
    
    #make table
    table=[]
    for _ in range(0,h):
        arr=list(map(lambda x:int(x),input().split()))
        table.append(arr)
        
    count=0

    #check all
    for i in range(h):
        for j in range(w):
            if table[i][j]==1:
                
                #dfs
                stack=[[i,j]]
                while stack:
                    v=stack.pop()
                    table[v[0]][v[1]]=0
                    #up
                    if (v[0]-1)>=0:
                        area=[v[0]-1,v[1]]
                        addStack(table,stack,area)
                    #down
                    if (v[0]+1)<h:
                        area=[v[0]+1,v[1]]
                        addStack(table,stack,area)
                    #right
                    if (v[1]+1)<w:
                        area=[v[0],v[1]+1]
                        addStack(table,stack,area)
                    #left
                    if (v[1]-1)>=0:
                        area=[v[0],v[1]-1]
                        addStack(table,stack,area)
                    #1
                    if (v[0]-1)>=0 and (v[1]+1)<w:
                        area=[v[0]-1,v[1]+1]
                        addStack(table,stack,area)
                    #5
                    if (v[0]+1)<h and (v[1]+1)<w:
                        area=[v[0]+1,v[1]+1]
                        addStack(table,stack,area)
                    #7
                    if (v[0]+1)<h and (v[1]-1)>=0:
                        area=[v[0]+1,v[1]-1]
                        addStack(table,stack,area)
                    #11
                    if (v[0]-1)>=0 and (v[1]-1)>=0:
                        area=[v[0]-1,v[1]-1]
                        addStack(table,stack,area)  
                count+=1
    print(count)
