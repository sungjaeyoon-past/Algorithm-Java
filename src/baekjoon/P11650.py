case_num=int(input())
l=[]
for _ in range(case_num):
    arr=list(map(lambda x:int(x),input().split()))
    l.append(arr)
l=sorted(l,key=lambda x:(x[0],x[1]))
for i in l:
    print('{0} {1}'.format(i[0],i[1]))
