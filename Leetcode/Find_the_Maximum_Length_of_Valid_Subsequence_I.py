class Solution:
    def maximumLength(self, nums: List[int]) -> int:
      i,j,k,l=0,0,0,0
      for p in nums:
        if p%2==0:
          i+=1
          k=l+1
        else:
          j+=1
          l=k+1
      return max(i,j,l,k)
