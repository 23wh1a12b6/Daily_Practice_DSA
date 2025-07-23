class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      HashMap<String,Integer>map=new HashMap<>();
      HashSet<String>set=new HashSet<>();
      int n=banned.length;
      for(String i:banned){
        set.add(i);
      }
      String[] para=remPunct(paragraph).split(" ");
      for(String i:para){
        String j=i.toLowerCase();
        if(!(set.contains(j))){
          if(map.containsKey(j)){
            int cnt=map.get(j);
            map.put(j,cnt+1);
          }
          else{
             map.put(j,1);
          }
        }
      }
      System.out.println(map);
      int c=0;
      String ans="";
      for(String i:para){
        String j=i.toLowerCase();
        if( j!="" && map.containsKey(j) ){
        if(map.get(j)>c){
          c=map.get(j);
          ans=j; 
        }
        }
      }
      
       System.out.println(c);
       return ans;     
    }
    public String remPunct(String s){
      int m=s.length();
      StringBuilder res=new StringBuilder();
      for(int i=0;i<m;i++){
        char c=s.charAt(i);
        if((c>='a' &&c<='z' ) ||(c>='A' && c<='Z') ||(c==' ')){
          res.append(c);
        }
        if(c==','){
          res.append(" ");
        }
      }
      return res.toString();
    }
}
