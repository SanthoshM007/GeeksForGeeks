class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int i,ct=0;
        char c;
        String t="";
        for(i=0;i<=s.length()-1;i++){
            c=s.charAt(i);
            if(ch==c) ct+=1;
            if(ct==count){
              break;
            }
        }
        for(i=i+1;i<s.length();i++){
            t+=s.charAt(i);
        }
        return t;
    }
}
