day31=[1,3,5,7,8,10,12]
day30=[4,6,9,11]
day=['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT','SUN']

month=[31,59]
for i in range(3,13):
    if i in day31:
        month.append(month[-1]+31)
    elif i in day30:
        month.append(month[-1]+30)

count=0
arr=list(map(lambda x:int(x),input().split()))
if arr[0]!=1:
    count+=month[arr[0]-2]
count+=arr[1]

print(day[count%7-1])
