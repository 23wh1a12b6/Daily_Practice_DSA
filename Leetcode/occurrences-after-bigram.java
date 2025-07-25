class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String []res=text.split(" ");
        int n=res.length;
        ArrayList<String>arr=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(res[i].equals(first) && res[i+1].equals(second) ){
                arr.add(res[i+2]);
            }

        }
        return arr.toArray(new String[0]);
    }
}
