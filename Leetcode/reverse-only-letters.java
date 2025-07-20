class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        int l=0;
        //A-Z are 65-90,  a-z are 97-122
        int h=n-1;
        char [] res= s.toCharArray();
        while(l<h){
            if (!((res[l] >= 65 && res[l] <= 90) || (res[l] >= 97 && res[l] <= 122))){
                l++;
            }
            else if (!((res[h]>=65) && (res[h]<=90) || (res[h]>=97) && (res[h]<=122))){
                h--;
            }
            else{
                char temp=res[l];
                res[l]=res[h];
                res[h]=temp;
                l++;
                h--;
            }
        }
        return new String(res);
    }
}
