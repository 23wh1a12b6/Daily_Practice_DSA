class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
      d={}
      l=0
      s=0
      m=0
      n=len(nums)
      for r in range(n):
        while nums[r] in d:
          d[nums[l]]-=1
          if d[nums[l]]==0:
            del d[nums[l]]
          s-=nums[l]
          l+=1
        d[nums[r]]=1
        s+=nums[r]     
        m=max(s,m)
      return m

        
