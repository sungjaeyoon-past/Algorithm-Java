int(input())
myCard=list(map(lambda x:int(x),input().split()))
stack={}
for i in myCard:
    if i not in stack:
        stack[i]=1
    else:
        stack[i]+=1
        

N=int(input())
go=list(map(lambda x:int(x),input().split()))
s=''
for i in go:
    if i in stack:
        num=stack[i]
        s+=str(num)+' '
    else:
        s+=str(0)+' '
print(s[:-1])

