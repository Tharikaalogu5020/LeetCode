/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    let s=head;
    let f=head;
    while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
        if(f==s){
            s=head;
            while(s!=f){
                s=s.next;
                f=f.next;
            }
            return f;
        }
    }
    return null;

};