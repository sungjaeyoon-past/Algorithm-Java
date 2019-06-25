award1=[500,300,200,50,30,10]
award2=[512,256,128,64,32]

people1=[0,1,2,3,4,5,6]
people2=[0,1,2,4,8,16]

for i in range(1,len(people1)):
    people1[i]=people1[i]+people1[i-1]

for i in range(1,len(people2)):
    people2[i]=people2[i]+people2[i-1]

N=int(input())
for _ in range(N):
    count=0
    arr=list(map(lambda x:int(x), input().split()))
    if arr[0]!=0:
        for i in range(len(people1)-1):
            if arr[0]>people1[i] and arr[0]<=people1[i+1]:
                count+=award1[i]
    if arr[1]!=0:
        for i in range(len(people2)-1):
            if arr[1]>people2[i] and arr[1]<=people2[i+1]:
                count+=award2[i]
    print(count*10000)
