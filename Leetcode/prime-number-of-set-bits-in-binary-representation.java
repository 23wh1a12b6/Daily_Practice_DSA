class Solution {
    public int countPrimeSetBits(int left, int right) {
      HashSet<Integer>set=new HashSet<>(Set.of(2,3,5,7,11,13,17,19,23,31));
      //set=Set.of(2,3,5,7,11,13,17,19,23,31);
      int cnt=0;
      for(int i=left;i<=right;i++){
        int res=checkBit(i);
        if(set.contains(res)){
          cnt++;
        }

      }

       return cnt; 
    }
    public static int checkBit(int n){
      int c=0;
      while(n>0){
        if(n%2==1){
          c++;
        }
        n/=2;
      }
      return c;
     
    }
   
}
