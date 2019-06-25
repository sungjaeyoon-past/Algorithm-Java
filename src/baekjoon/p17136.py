def sumTable(table):
    count=0
    for t in table:
        count+=sum(t)
    return count

table=[]

for i in range(0,10):
    a=list(map(lambda x:int(x),input().split(' ')))
    table.append(a)
    
s=[5,5,5,5,5]
for cc in range(1,6):
    for dd in range(1,6):
        for ee in range(1,6):
            print(5,5,ee,dd,cc)


for f in range(5,0,-1):
    for i in range(0,len(table)-(f-1)):
        for j in range(0,len(table)-(f-1)):
            defTable=[]
            for t in table[i:i+f]:
                defTable.append(t[j:j+f])

            if sumTable(defTable)==(f*f):
                for a in range(0,f):
                    for b in range(0,f):
                        table[i+a][j+b]=-1
                s[f-1]-=1

if s[0]<0 or s[1]<0 or s[2]<0 or s[3]<0 or s[4]<0 or sumTable(table)>0:
    print(-1)
else:
    print(25-sum(s))

