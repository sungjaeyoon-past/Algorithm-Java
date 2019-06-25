s=int(input())

count=0
for i in range(0,int(s/3)+1):
    cur=s-(3*i)
    if cur%5==0:
        count=i+int(cur/5)
        break
if count==0:
    print(-1)
else:
    print(count)
