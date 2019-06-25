while True:
    try:
        so,dae,num,gong=0,0,0,0
        str=input()
        for i in range(0,len(str)):
            c=str[i:i+1]
            if c==' ':
                gong+=1
            elif c=='0' or c=='1' or c=='2' or c=='3' or c=='4' or c=='5' or c=='6' or c=='7' or c=='8' or c=='9':
                num+=1
            elif c>='a' and c<='z':
                so+=1
            elif c>='A' and c<='Z':
                dae+=1
        print(so,dae,num,gong)
    except EOFError:
        break
        
