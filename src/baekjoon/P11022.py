case=int(input())
for i in range(0,case):
    arr=list(map(lambda x:int(x),input().split()))
    print('Case #{0}: {1} + {2} = {3}'.format(i+1,arr[0],arr[1],arr[0]+arr[1]))
