s=input().lower()
table=[0 for i in range(26)]
for i in range(0,len(s)):
    table[ord(s[i])-97]+=1
m=max(table)
if table.count(m)>1:
    print('?')
else:
    k=table.index(m)+65
    print(chr(k))
