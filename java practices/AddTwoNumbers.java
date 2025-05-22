 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode temp = new ListNode(1);
            ListNode tail = temp;
            int carryOver = 0;

            while(l1 != null || l2!=null || carryOver!= 0){
                int numl1 = (l1 != null)? l1.val:0 ,
                 numl2 = (l2 != null)? l2.val:0;

                int sum = numl1 + numl2 + carryOver;
                int ans = sum % 10;
                carryOver = sum /10;

                ListNode rslt = new ListNode(ans);
                tail.next = rslt;
                tail = tail.next;

                l1 = (l1 != null)? l1.next: null;
                l2 = (l2 != null)? l2.next: null;

            }

            ListNode rslt = temp.next;
            temp.next = null;

        return rslt;
    }
}
