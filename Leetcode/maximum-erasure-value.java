class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int n=nums.length;
      HashMap<Integer,Integer>map=new HashMap<>();
      int m=0;
      int s=0;
      int l=0;
      for(int r=0;r<n;r++){
        while(map.containsKey(nums[r])){
          int cnt=map.get(nums[l]);
          map.put(nums[l],cnt-1);
          if (map.get(nums[l])==0){
            map.remove(nums[l]);
          }
          s-=nums[l];
          l++;

        }
        map.put(nums[r],1);
        s+=nums[r];
        m=Math.max(s,m);
      }
        return m;
    }
}
