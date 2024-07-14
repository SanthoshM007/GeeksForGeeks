class Solution
{

	public int peakElement(int[] arr,int n)
    {
    
       int i;
       
       if(n==1)
       return 0;
       else if(arr[1]<=arr[0])
       return 0;
       else if(arr[n-2]<=arr[n-1])
       return n-1;
       
       for(i=1;i<n-1;i++)
       {
           if((arr[i+1]<=arr[i])&&(arr[i-1]<=arr[i]))
           return i;
       }
       return 0;
       
    }
}
