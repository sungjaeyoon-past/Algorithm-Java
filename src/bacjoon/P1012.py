TEST_CASE_NUM=int(input())
for _ in range(TEST_CASE_NUM):
    inputData=list(map(lambda x:int(x),input().split()))
    table=[[0 for i in range(inputData[0])] for i in range(inputData[1])]
    for _ in range(inputData[2]):
        vegi=list(map(lambda x:int(x),input().split()))
        table[vegi[1]][vegi[0]]=1
    for i in table:
        print(i)
    print('-----')

    count=0
    
    for i in range(inputData[1]):
        for j in range(inputData[0]):
            if table[i][j]==1:

                stack=[[i,j]]
                print(stack)
                while stack:
                    v=stack.pop()
                    table[v[0]][v[1]]=0
                    
                    #up
                    if (v[0]+1)<inputData[1]:
                        area=[v[0]+1,v[1]]
                        if table[area[0]][area[1]]==1:
                            table[area[0]][area[1]]=0
                            stack.append(area)
                    #down
                    if (v[0]-1)>=0:
                        area=[v[0]-1,v[1]]
                        if table[area[0]][area[1]]==1:
                            table[area[0]][area[1]]=0
                            stack.append(area)
                    
                    #right
                    if (v[1]+1)<inputData[0]:
                        area=[v[0],v[1]+1]
                        if table[area[0]][area[1]]==1:
                            table[area[0]][area[1]]=0
                            stack.append(area)
                    
                    #left
                    if (v[1]-1)>=0:
                        area=[v[0],v[1]-1]
                        if table[area[0]][area[1]]==1:
                            table[area[0]][area[1]]=0
                            stack.append(area)                  
                
                count+=1
    print(count)
