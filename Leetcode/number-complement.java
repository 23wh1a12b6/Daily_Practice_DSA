class Solution {
    public int findComplement(int num) {
      int i=0;
      int ans=0;
      while(num>0){
        if(num%2==0){
          ans+=(1<<i);
        }
        num/=2;
        i++;
      }
      return ans;  
    }
}
