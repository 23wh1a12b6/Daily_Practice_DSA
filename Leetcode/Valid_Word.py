class Solution:
    def isValid(self, word: str) -> bool:
        m=0
        v=0
        c=0
        vow="aeiouAEIOU"
        num="0123456789"
        con="qwrtyplkjhgfdszxcvbnmQWRTYPLKJHGFDSZXCVBNM"
        for i in word:
            if not i.isalnum():
                return False
            else:
                    m+=1
                    if i in vow:
                        v=1
                    if i in con:
                        c=1
        if m>=3 and c==1 and v==1:
            return True
        else:
            return False
        
        
