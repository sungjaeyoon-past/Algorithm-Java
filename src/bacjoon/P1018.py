def com():
    
def solution(a,b,arr):

    for i,st in enumerate(arr):
        st=st.replace('W','1')
        st=st.replace('B','0')
        arr[i]=st

    bool=True

    MASK=[]

    for j in range(0,b+1): #한줄 더 생성 
        l=[]
        for i in range(0,a):
            if bool:
                l.append('0')
                bool=False
            else:
                l.append('1')
                bool=True
        c=''.join(l)
        MASK.append(c)
        if bool:
            bool=False
        else:
            bool=True

    #0~b 로 비교
        

    #1~b+1로 비교
    

            
    [print(i) for i in MASK]
    print('----')
    [print(i) for i in arr]
    return 0

arr=['WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBBBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW']
solution(8,8,arr)
