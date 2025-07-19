class Solution:
    def splitArray(self, nums: List[int]) -> int:
        n=len(nums)
        def isPrime(n):
            if n<=1:
                return False
            if n==2 or n==3:
                return True
            if n%2==0 or n%3==0:
                return False
            i = 5
            while i * i <= n:
                if n % i == 0 or n % (i + 2) == 0:
                    return False
                i += 6
            return True
        list1=[]
        list2=[]
        for i in range(n):
            if(isPrime(i)):
                list1.append(nums[i])
            else:
                list2.append(nums[i])
        print(list1)
        print(list2)
        return abs(sum(list1)-sum(list2))
    
