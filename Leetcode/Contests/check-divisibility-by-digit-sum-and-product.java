class Solution {
    public boolean checkDivisibility(int n) {
      int temp=n;
      long s=0;
      long p=1;
      while(n>0){
        s+=(n%10);
        p*=(n%10);
        n/=10;
      }
      return temp%(s+p)==0;
        
    }
}
