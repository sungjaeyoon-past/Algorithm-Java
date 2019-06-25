import sys
test_case=sys.stdin.readline().rstrip()
for _ in range(0,int(test_case)):
    arr=list(map(lambda x:int(x),sys.stdin.readline().rstrip().split()))
    print(arr[0]+arr[1])
