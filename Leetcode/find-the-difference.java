class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            sum+=s.charAt(i);
        }
        System.out.println(sum);
         for(int i=0;i<n+1;i++){
            res+=t.charAt(i);
        }
        int r=res-sum;

        return (char)r;
    }
}
