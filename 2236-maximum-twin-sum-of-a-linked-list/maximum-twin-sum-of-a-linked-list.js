/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var pairSum = function(head) {
    if(head===null) return 0;
    let s=head;
    let f=head;
    while(f!==null && f.next!==null){
        f=f.next.next;
        s=s.next;
    }
    let prev=null;
    let next=null;
    while(s!=null)
    {
        next=s.next;
        s.next=prev;
        prev=s;
        s=next;
    }
    let sum=0;
    let first=head;
    let second=prev;
    while(second!==null){
        sum=Math.max(sum,first.val+second.val);
        first=first.next;
        second=second.next;
    }
    return sum;
};