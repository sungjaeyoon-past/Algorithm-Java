while True:
    l=list(map(lambda x:int(x),input().split()))
    add=l[0]+l[1]
    if add==0:
        break
    else:
        print(add)
