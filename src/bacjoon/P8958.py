case_num=int(input())
for _ in range(case_num):
    count=0
    stack=0
    s=input()
    for i in range(0,len(s)):
        if s[i]=='O':
            stack+=1
            count+=stack
        else:
            stack=0
    print(count)
    
