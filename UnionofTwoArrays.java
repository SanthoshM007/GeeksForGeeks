class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
    return s.size();
    }
}
