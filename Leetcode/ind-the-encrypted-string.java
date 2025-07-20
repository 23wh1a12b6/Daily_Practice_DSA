class Solution {
    public String getEncryptedString(String s, int k) {
        String t="";
        int n=s.length();
        for(int i=0;i<n;i++){
            t+=s.charAt((i+k)%n);

        }
        return t;
        
    }
}
