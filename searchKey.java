class Solution {
    static boolean searchKey(int n, Node head, int key) {
        
        Node t=head;
        while(t!=null){
            if(t.data==key) return true;
            t=t.next;
        }
        return false;
    }
}
