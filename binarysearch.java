class Solution
{
    int binarysearch(int arr[], int n, int k)
    {
       int l=0,h=arr.length-1,mid; // code here
    while(l<=h)
    {
    mid =l+(h-l)/2;  
    if(arr[mid]==k)
    return mid;
    else if(arr[mid]<k)
    l=mid+1;
    else
    h=mid-1;

    }
    return -1;
    
}}
