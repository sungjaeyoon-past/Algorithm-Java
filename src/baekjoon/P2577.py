A,B,C=int(input()),int(input()),int(input())
arr=[0 for i in range(10)]
s=str(A*B*C)
for i in s:
    arr[int(i)]+=1
[print(i) for i in arr]
