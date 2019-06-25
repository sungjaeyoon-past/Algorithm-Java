import math
s=int(input())
table=[0 for i in range(0,10)]
if s==0:
    print(1)
else:
    while s>0:
        table[s%10]+=1
        s=int(s/10)
    six=[table[6],table[9]]
    table[6],table[9]=0,0
    k=max(table)

    if sum(six)>k*2:
        print(math.ceil((sum(six)-k*2)/2)+k)
    else:
        print(k)
