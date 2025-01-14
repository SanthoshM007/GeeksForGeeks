class Solution {
    void selectionSort(int[] arr) {
        
        for(int j=0;j<arr.length;j++){        
        
            int min=Integer.MAX_VALUE;
            
            int min_ind=-1;
            
            for(int i=j;i<arr.length;i++){
                if(arr[i]<min) {min=arr[i];min_ind=i;}
            }
            
            int t=arr[j];
            arr[j]=min;
            arr[min_ind]=t;
            
        }
        
        
    }
}
