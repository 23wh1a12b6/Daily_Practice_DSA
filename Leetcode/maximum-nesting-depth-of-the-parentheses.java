class Solution {
    public int maxDepth(String s) {
      int c=0;
      int m=0;
      char[] res=s.toCharArray();
      for(char i: res){
        if (i=='('){
          c+=1;
          m=Math.max(c,m);
        }
        if (i==')'){
          c-=1;
        }

      }
     
        return m;
    }
}
