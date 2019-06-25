num=int(input())
for i in range(0,num):
    str=''
    for j in range(0,i):
        str+=' '
    for j in range(0,num-i):
        str+='*'
    print(str)
