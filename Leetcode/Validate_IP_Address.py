class Solution:
    def validIPAddress(self, queryIP: str) -> str:
      def check(k):
        for i in range(len(k)):
          if k[i] != '0':
              res = k[i::]
              return res
        return k
      def calipv4(queryIP):
        res=queryIP.split(".")
        if len(res)!=4:
          return False
        for j in res:
          if not j.isdigit():
            return False
          if j!=check(j):
            return False
          if len(j)>=2 and int(j)==0 :
            return False
          if not (int(j)>=0) or not(int(j)<=255):
            return False
        return True
      def calipv6(queryIP):
        res=queryIP.split(":")
        if len(res)>=9:
          return False
        low="abcdef"
        upp="ABCDEF"
        dig="0123456789"
        for i in res:
          if len(i)==0 or len(i)>4:
            return False
          if not i.isalnum():
            return False
          else:
            c=0
            for j in i:
              if j in low:
                c+=1
              elif j in upp:
                c+=1
              elif j in dig:
                c+=1
            if c!=len(i):
              return False
        return True
      for i in queryIP:
        if i=='.':
          if(calipv4(queryIP)):
            return "IPv4"
        if i==":":
          if(calipv6(queryIP)):
            return "IPv6"
      return "Neither"


      
