class Solution {
    public String makeFancyString(String s) {
     // char []res=s.toCharArray();
      int n=s.length();
      StringBuilder res=new StringBuilder();
      int c=1;
      for(int i=0;i<n;i++){
        if ( i>0 && s.charAt(i-1)==s.charAt(i)){
          c++;
        }
        else{
          System.out.println(c);
          c=1;
        }
        if(c<=2){
          res.append(s.charAt(i));
        }
       
      }
       return res.toString(); 
    }
}
