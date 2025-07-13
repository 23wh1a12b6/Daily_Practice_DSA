class Solution:
    def matchPlayersAndTrainers(self,arr1: List[int], arr2: List[int]) -> int:
      arr1.sort()
      arr2.sort()
      n=len(arr1)
      m=len(arr2)
      i=0
      j=0
      c=0
      while(i<n and j<m):
        if(arr1[i]<=arr2[j]):
          i+=1
          c+=1
        j+=1
      return c
        
