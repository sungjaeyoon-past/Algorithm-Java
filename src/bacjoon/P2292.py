num=int(input())

if num==1:
    print(1)
else:
    i=0
    start=2
    end=7
    while True:
        i+=1
        if num>=start and num<=end:
            print(i+1)
            break
        else:
            start+=6*i
            end+=6*(i+1)
            
