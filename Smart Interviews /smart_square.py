def checkIsSmart(arr):
    return (
    (arr[0]+arr[1]+arr[2])%5==0 and 
    (arr[3]+arr[4]+arr[5])%5==0 and 
    (arr[6]+arr[7]+arr[8])%5==0 and
    (arr[0]+arr[3]+arr[6])%5==0 and
    (arr[1]+arr[4]+arr[7])%5==0 and
    (arr[2]+arr[5]+arr[8])%5==0and 
    (arr[0]+arr[4]+arr[8])%5==0 and
    (arr[2]+arr[4]+arr[6])%5==0 )
nums=[1,2,3,4,5,6,7,8,9]
n=9
def cal(ans,ds,l,nums,n):
    if len(l)==n:
        ans.append(l[:])
        return 
    for i in range(n):
        if(not ds[i]):
            l.append(nums[i])
            ds[i]=True
            cal(ans,ds,l,nums,n)
            l.pop()
            ds[i]=False
l=[]
ds=[False]*n
ans=[]
cal(ans,ds,l,nums,n)
res=[]
for i in ans:
    if checkIsSmart(i):
        res.append(i)
t=int(input())
for _ in range(t):
    mat=[]
    for k in range(3):
        mat+=[int(i) for i in input().split()]
    cost=float("inf")
    for sm in res:
        curr=0
        for i in range(9):
            curr+=abs(mat[i]-sm[i])
        cost=min(cost,curr)
    print(cost)





