while True:
    N=int(input())
    if N==0:
        break
    else:
        maxLength=-1.
        student=[]
        for i in range(N):
            arr=list(input().split())
            if maxLength<float(arr[1]):
                maxLength=float(arr[1])
                student=[arr[0]]
            elif maxLength==float(arr[1]):
                student.append(arr[0])
        s=''
        for i in student:
            s+=i+' '
        print(s[:-1])
            
