class Solution {
    public List<String> removeComments(String[] source) {
        List<String> list = new ArrayList<>();
        boolean flag = false;  
        StringBuffer sb = new StringBuffer();

        for (String s : source) {
            char ch[] = s.toCharArray();
            int i = 0;

            if (!flag) sb.setLength(0); 

            while (i < ch.length) {
              
                if (!flag && i + 1 < ch.length && ch[i] == '/' && ch[i + 1] == '*') {
                    flag = true;
                    i += 1; 
                }
                
                else if (flag && i + 1 < ch.length && ch[i] == '*' && ch[i + 1] == '/') {
                    flag = false;
                    i += 1; 
                }
              
                else if (!flag && i + 1 < ch.length && ch[i] == '/' && ch[i + 1] == '/') {
                    break;
                }
                
                else if (!flag) {
                    sb.append(ch[i]);
                }
                i++;
            }

         
            if (!flag && sb.length() > 0) {
                list.add(sb.toString());
            }
        }
        return list;
    }
} 
