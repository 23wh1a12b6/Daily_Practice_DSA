def cal(n,arr,l,i,res):
    if i==n:
        
            res.append(l[:])
            return 
 
    l.append(arr[i])
    cal(n,arr,l,i+1,res)
    l.pop()
    cal(n,arr,l,i+1,res)

t=int(input())
for _ in range(t):
    n=int(input())
    arr=[int(i) for i in input().split()]
    arr.sort()
    l=[]
    i=0
    res=[]
    cal(n,arr,l,i,res)
    res.sort()
    for i in res[1:]:
        print(*i)
    print()
   
