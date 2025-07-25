class Solution {
    public int maxSum(int[] nums) {
      int n=nums.length;
      int sum=calSum(nums,n);
      int max=calMax(nums,n);
      if(max<0){
        return max;
      }
      else{
        return sum;
      }
      
        
    }
    public static int calSum(int arr[],int n){
       HashSet<Integer>set=new HashSet<>();
       int s=0;
      for(int i:arr){
         if(i>0){
          set.add(i);

        }
        
      }
      System.out.println(set);
      for(int i:set){
        s+=i;
      }

      return s;
    }
    public static int calMax(int arr[],int n){
      int m=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        m=Math.max(m,arr[i]);
      }
      return m;
    }
}
