# Enter your code here. Read input from STDIN. Print output to STDOUT
def check(arr,n,k,m):
    s=0
    for i in range(n):
        s+=arr[i]
        if s>m:
            k-=1
            if k==0:
                return False
            s=arr[i]
    return k>=0
def binSrch(n,k,arr,l,h):
    ans=-1
    while(l<=h):
        m=(l+h)//2
        if(check(arr,n,k,m)):
            ans=m
            h=m-1
        else:
            l=m+1
    return ans
t=int(input())
for _ in range(t):
    n,k=map(int,input().split())
    arr=[int(i) for i in input().split()]
    l=max(arr)
    h=sum(arr)
    print(binSrch(n,k,arr,l,h))
