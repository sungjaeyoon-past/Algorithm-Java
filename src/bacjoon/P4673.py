def sumAll(num):
    count=0
    while num>0:
        addNum=num%10
        count+=addNum
        num=int(num/10)
    return count

self_number=[True]*10000

for i in range(1,10000):
    if self_number[i]:
        num=i
        while True:
            if num<10:
                num=num*2
                self_number[num]=False
            else:
                num=num+sumAll(num)
                if num>=10000:
                    break
                self_number[num]=False

[print(i) for i in range(1,10000) if self_number[i]]


