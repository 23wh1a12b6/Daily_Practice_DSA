class Solution {
    public int[] shuffle(int[] nums, int n) {
      int []arr=new int[2*n];
      int j=0;
      int i=0;
      while(i<2*n && j<n){
        arr[i]=nums[j];
        i+=1;
        arr[i]=nums[n+j];
        i++;
        j++;
      }
      return arr;
        
    }
}
