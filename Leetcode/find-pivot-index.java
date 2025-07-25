class Solution {
    public int pivotIndex(int[] nums) {
      int l=0;
      int n=nums.length;
      int h=calSum(nums,n);
      System.out.println(h);
      for(int i=0;i<n;i++){
        h-=nums[i];
        System.out.println(l);
        if(l==h){
          return i;
        }
        l+=nums[i];
      }
      return -1;
        
    }
    public static int calSum(int arr[],int n){
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=arr[i];
      }
      return sum;
    }
}
