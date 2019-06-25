graph={1:[],2:[],3:[],4:[],5:[]}
sign=int(input())

for i in range(0,sign):
    line=input().split(" ")
    graph[int(line[0])].append(int(line[1]))
    graph[int(line[1])].append(int(line[0]))

bool=False

if ((len(graph[2])+len(graph[5]))==0) and (3 in graph[1]) and (4 in graph[1]) and (3 in graph[4]):
    bool=True
    
if bool:
    print('Wa-pa-pa-pa-pa-pa-pow!')
else:
    print('Woof-meow-tweet-squeek')
    
    
