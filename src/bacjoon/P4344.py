for _ in range(0,int(input())):
    arr=list(map(lambda x:int(x),input().split()))
    count=arr.pop(0)
    avg=sum(arr)/count
    upAvg=0
    for i in arr:
        if i>avg:
            upAvg+=1
    print('{:.3f}%'.format(upAvg/count*100))
    
