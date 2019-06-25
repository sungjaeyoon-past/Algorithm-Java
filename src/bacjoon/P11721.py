s=input()
num=int(len(s)/10)
for i in range(0,num):
    print(s[i*10:(i+1)*10])
print(s[num*10:])

