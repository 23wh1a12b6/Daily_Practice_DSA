# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        l=[]
        ans=0
        curr=head
        while(curr!=None):
            l.append(curr.val)
            curr=curr.next
        j=0
        for i in l[::-1]:
            if i==1:
                ans+=(1<<j)
            j+=1
        return ans


       
        
        
