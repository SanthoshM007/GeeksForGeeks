class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int c=0;
        
        if(head==null) return c;
        
        Node temp=head;
        
        while(temp!=null){
            c+=1;
            temp=temp.next;
        }
        return c;
    }
}
