class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def cal(r,res,c,o,s):
          if (c+o)==r:
            res.append(s)

          if c<o:
            cal(r,res,c+1,o,s+")")
          if o<r//2:
            cal(r,res,c,o+1,s+"(")
        res=[]
        c=0
        o=0
        s=""
        r=2*n
        cal(r,res,c,o,s)
        return res
