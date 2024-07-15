
class Solution {
    public String smallestNumber(int s, int d) {
        // code here
      int f=1,i,q;
      String t="";
      if(d>1){
          while(d>=2){
              f=f*10;
              d--;
          }
      }
      for(i=f;i<f*10-1;i++){
        if(sum(i,s)) break;
        
        
      }
      t=t+i;
      q=i;
      int su=0;
        while(i!=0){
              su+=i%10;
              i/=10;
          }
        if(su!=s) return "-1";
      return t;
     
        
    }
    public static boolean sum(int i,int s){
        int sum=0;
        while(i!=0){
              sum+=i%10;
              i/=10;
          }
          if(sum==s) return true;
          else return false;
    }
   
}
