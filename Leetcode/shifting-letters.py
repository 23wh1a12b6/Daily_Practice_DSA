class Solution:
    def shiftingLetters(self, s: str, arr: List[int]) -> str:
      n=len(arr)
      lst=[0]*(n)
      lst[n-1]=arr[n-1]%26
      for i in range(n-2,-1,-1):
        lst[i]=lst[i+1]%26+arr[i]%26
      ans=[0]*n
      for i in range(n):
        curr=ord(s[i])-ord('a')
        ans[i]=chr((curr+lst[i])%26+ord('a'))
      return "".join(map(str,ans))
        
      

      
        
