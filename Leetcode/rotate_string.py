class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        n=len(s)
        m=len(goal)
        if n!=m:
            return False
        if s==goal:
            return True
        n=len(s)
        l=0
        res=s
        while(l<n):
            res=res[1:]+res[0]
            print(res)
            if res==goal:
                return True
            l+=1
           
        return False

