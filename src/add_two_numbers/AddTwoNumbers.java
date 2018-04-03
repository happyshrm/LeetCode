package add_two_numbers;

import java.util.Stack;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * created by hongrm on 2018/3/31 22:36
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);

        print(addTwoNumbers(listNode1, listNode4));
    }

    static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> reserveL1 = new Stack<>();
        Stack<Integer> reserveL2 = new Stack<>();
        addToStack(l1, reserveL1);
        addToStack(l2, reserveL2);
        ListNode node = new ListNode();
        ListNode head = node;
        int tmp = 0;
        if (!(reserveL1.empty() || reserveL2.empty())) {
            head.val = reserveL1.pop().intValue() + reserveL2.pop().intValue();
        }
        while (!(reserveL1.empty() || reserveL2.empty())) {
            System.out.println("stack is null   ");
            int sum = reserveL1.pop().intValue() + reserveL2.pop().intValue() + tmp;
            if (sum >= 10) {
                int tmp2 = sum % 10;
                tmp = sum / 10;
                sum = tmp2;
            }
            ListNode next = new ListNode(sum);
            node.next = next;
            node = next;
        }
        return head;
    }

    private static void addToStack(ListNode node, Stack<Integer> stack) {
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
        ListNode() {}

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
