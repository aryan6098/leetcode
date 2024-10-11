/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) {
            return null;
        }
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        int lengthA = 1;
        int lengthB = 1;
        while(ptr1.next != null) {
            ptr1 = ptr1.next;
            lengthA++;

        }
        while(ptr2.next != null) {
            ptr2 = ptr2.next;
            lengthB++;

        }
         if (!ptr1.equals(ptr2))
	        return null;

        int diff = Math.abs(lengthA - lengthB);
        ptr1 = headA;
        ptr2 = headB;
       if (lengthA > lengthB) {
	        while (diff-- > 0) {
	            ptr1 = ptr1.next;
	        }
	    } else {
	        while (diff-- > 0)
	            ptr2 = ptr2.next;
	    }
        while(!ptr1.equals(ptr2)) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;



        
    }
}