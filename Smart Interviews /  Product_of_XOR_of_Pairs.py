t=int(input())
mod=1000000007
for _ in range(t):
    n=int(input())
    arr=[int(i) for i in input().split()]
    m=3001
    cnt=[0]*(m)
    p=1
    check=False
    for i in arr:
        if cnt[i]>=1:
            check=True
            break
        cnt[i]+=1
    if check:
        print(0)
        continue
    for i in range(1,m):
        if(cnt[i]==0):
            continue
        for j in range(i+1,m):
            if(cnt[j]==0):
                continue
            res=i^j
            p=(p*(res)%mod)
    print(p)
        
