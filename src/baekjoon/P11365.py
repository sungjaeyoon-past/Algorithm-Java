while True:
    l=input()
    if l=='END':
        break
    k=''
    for i in range(len(l)-1,-1,-1):
        k+=l[i]
    print(k)
