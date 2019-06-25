line=input().split()
table=[]
for i in range(0,int(line[0])):
    arr=[]
    for j in input():
        arr.append(j)
    table.append(arr)

no,one,two,three,four=0,0,0,0,0

print(table)
for i in range(0,int(line[0])-1):
    for j in range(0,int(line[1])-1):
        count=0
        if (table[i][j]=='#') or (table[i+1][j]=='#') or (table[i][j+1]=='#') or (table[i+1][j+1]=='#'):
            continue
        if table[i][j]=='X':
            count+=1
        if table[i+1][j]=='X':
            count+=1
        if table[i][j+1]=='X':
            count+=1
        if table[i+1][j+1]=='X':
            count+=1
        
        if count==0:
            no+=1
        elif count==1:
            one+=1
        elif count==2:
            two+=1
        elif count==3:
            three++1
        elif count==4:
            four+=1
        print(count)
    print('----')

print(no)
print(one)
print(two)
print(three)
print(four)

