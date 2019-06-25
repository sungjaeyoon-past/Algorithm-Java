#input value
computer=int(input())
edge=int(input())
cost=[]
for _ in range(edge):
    arr=list(map(int,input().split()))
    cost.append(arr)

#range cost as cost[2]<-cost
cost=sorted(cost,key=lambda cost:cost[2])

#select minimum but not cycle
result=0
graph=[[] for i in range(computer+1)]


