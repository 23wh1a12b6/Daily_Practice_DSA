class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
  
       int res=calMax(nums,n);
       int val=nums[res];
       System.out.println(res);
        for(int i=0;i<n;i++){
          if(res!=i && ! (val>=(2*nums[i]))){
            return -1;
          }
        }
        return res;
    }
    public static int calMax(int arr[],int n){
        int m=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(m<arr[i]){
              m=arr[i];
              idx=i;
            }
          
        }
        return idx;
      }
}
