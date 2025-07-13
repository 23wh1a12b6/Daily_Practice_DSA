class Solution:
    def processStr(self, s: str) -> str:
      stack=[]
      res="%*#"
      for i in s:
        if i not in res:
          stack.append(i)
        if stack:
          if i=="*":
            stack.pop()
          if i=="#":
            stack.extend(stack)
          if i=="%":
            stack.reverse()
      return "".join(map(str,stack))
