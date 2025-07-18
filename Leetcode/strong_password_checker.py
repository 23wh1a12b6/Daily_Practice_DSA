class Solution:
    def strongPasswordCheckerII(self,s: str) -> bool:
      f,j,k,l=False,False,False,False
      low="qwertyuioplkjhgfdsazxcvbnm"
      upp="AQWERTYUIOPLKJHGFDSZXCVBNM"
      sp="!@#$%^&*()-+"
      dig="0123456789"
      n=len(s)
      if n<8:
        return False
      for i in range(n):
        if(i+1<n):
          if(s[i]==s[i+1]):
            return False
        if s[i] in dig:
          f=True
        elif s[i] in low:
          j=True
        elif s[i] in upp:
          k=True
        elif s[i] in  sp:
          l=True
      return True if f and j and k and l  else False


        
