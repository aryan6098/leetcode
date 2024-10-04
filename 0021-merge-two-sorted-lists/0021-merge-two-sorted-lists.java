/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode current = null;;
        ListNode ans = null;
        if(list1.val < list2.val) {
            ans = list1;
            list1 = list1.next;
        }else {
            ans = list2;
            list2 = list2.next;
        }
        current = ans;

        while(list1 != null && list2 != null ) {
            if(list1.val < list2.val) {
                current.next = list1;
                current = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
        }
        if(list1 != null) {
            current.next = list1;
        }else {
            current.next = list2;
        }
        return ans;
    }
}