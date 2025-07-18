class Solution {
    public String addSpaces(String s, int[] spaces) {
      StringBuilder res=new StringBuilder();
      int n=s.length();
      int m=spaces.length;
      int j=0;
      if (m==0){
        return s;
      }
     for(int i=0;i<n;i++){
        if (j<m){
          if(spaces[j]==i){
            res.append(" ");
            j++;
          }
        }
        res.append(s.charAt(i));
      }
      return res.toString();

    }
}
      

    
      
     
