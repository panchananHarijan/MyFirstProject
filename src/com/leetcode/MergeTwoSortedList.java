package com.leetcode;

public class MergeTwoSortedList {
    static ListNode head;

    public static void main(String[] args) {
        MergeTwoSortedList solution = new MergeTwoSortedList();

        // First sorted list: 5 -> 10 -> 30
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(10);
        l1.next.next = new ListNode(30);

        // Second sorted list: 3 -> 7 -> 20
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(20);

        System.out.println("First sorted list:");
        solution.printList(l1);

        System.out.println("Second sorted list:");
        solution.printList(l2);

        ListNode mergedList = solution.mergeTwoLists(l1, l2);
        System.out.println("Merged list:");
        solution.printList(mergedList);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Append remaining elements
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next;
    }

    // Utility function to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int d) {
            this.data = d;
            this.next = null;
        }
    }
}

