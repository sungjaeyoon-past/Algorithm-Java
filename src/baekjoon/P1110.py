def cycle(num):
    if num<10:
        return (num*10)+num
    else:
        numRight=num%10
        numLeft=(num-numRight)/10

        addNum=numLeft+numRight
        addNumRight=addNum%10
        return (numRight*10)+addNumRight
    
num=int(input())
count=0

r=num

while True:
    r=cycle(r)
    count+=1
    if r==num:
        break
    
print(count)
