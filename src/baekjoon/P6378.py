def addOne(num):
    add=0
    while num>0:
        add+=num%10
        num=int(num/10)
    return add

def addStr(str):
    count=0
    for i in str:
        count+=int(i)
    return count

while True:
    num=input()

    arr=[]
    for i in range(0,len(num)):
        arr.append(num[i:i+1])    
    num=addStr(arr)
    if num!=0:
        while True:
            if num<10:
                print(num)
                break
            else:
                num=addOne(num)
    else:
        break

    
