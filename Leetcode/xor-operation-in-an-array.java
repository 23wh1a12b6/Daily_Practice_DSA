class Solution {
    public int xorOperation(int n, int start) {
       int ans=0;
        int i=0;
        while(i<n){
          int res=start+2*i;
         // System.out.println(res);
          ans^=res;
          i++;
        }
        return ans;
    }
}
