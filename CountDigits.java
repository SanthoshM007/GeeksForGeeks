
class Solution{
    static int evenlyDivides(int N){
        int t=N,c=0;
        String q=""+N;
        int l=q.length();
        while(l>0)
        {
            if(t%10==0) {l--;t/=10;continue;}
            else{
            if(N%(t%10)==0) 
            c+=1;
            t/=10;
            l--;
            }
        }
        
        
        return c;
    }
}
