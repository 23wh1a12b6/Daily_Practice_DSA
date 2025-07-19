class Solution:
    def removeSubfolders(self, folder: List[str]) -> List[str]:
        r=[]
        folder.sort()
        for i in folder:
            if not r or  not i.startswith(r[-1]+'/'):
                r.append(i)
        return r
