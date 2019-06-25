case_num=int(input())
for _ in range(case_num):
    arr=list(map(lambda x:int(x),input().split()))
    if arr[0]==arr[1]:
        print(1)
    else:
        minNum=min(arr)
        maxNum=max(arr)
        count=1
        high=1
        for i in range(maxNum,maxNum-minNum,-1):
            high*=i
        lo=1
        for i in range(minNum,0,-1):
            lo*=i
        
        print(int(high/lo))
