class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        char [] res=s.toCharArray();
        for (int i=0;i<n;i++){
            if(res[i]>='A' && res[i]<='Z'){
                res[i]=(char)(res[i]+32);
            }
        }
        return new String (res);
        
    }
}
