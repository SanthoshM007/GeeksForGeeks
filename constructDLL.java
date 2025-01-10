class Solution {
    Node constructDLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node pre=head;
        
        
        for(int i=1;i<arr.length;i++){
            Node t=new Node(arr[i]);
            pre.next=t;
            t.prev=pre;
            pre=t;
        }
        return head;
    }
}
