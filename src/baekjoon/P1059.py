
num=input()
l=list(map(lambda x:int(x),list(input().split())))
N=int(input())


bool=True

for i in l:
    if i==N:
        bool=False
if bool:
    count=0
    l.append(N)
    l.sort()
    a=l.index(N)
    if a==0:
        min,max=1,l[1]
    else:
        min,max=(l[a-1]+1),(l[a+1])
    for i in range(min,max):
        for j in range(i+1,max):
            if N>=i and N<=j:
                count+=1
    
    print(count)
else:
    print(0)
               

