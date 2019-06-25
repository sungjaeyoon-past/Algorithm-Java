def hanSu(num):
    s=str(num)
    if (int(s[1])-int(s[0]))==(int(s[2])-int(s[1])):
        return True
    else:
        return False

N=int(input())
if N<100:
    print(N)
else:    
    queue=[]
    [queue.append(i) for i in range(1,100)]
    for i in range(100,N+1):
        if hanSu(i):
            queue.append(i)
    print(len(queue))

