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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse sublist
        ListNode curr = prev.next;
        ListNode prevNode = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }

        // Reconnect
        prev.next.next = curr; // tail of reversed section connects to remaining list
        prev.next = prevNode;  // connect prev to head of reversed section

        return dummy.next;
    }
}