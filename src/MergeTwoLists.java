
//Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode l3 = dummy;


        while (l1.next != null && l2.next != null) {

           // System.out.println("l3.val : " + l3.val);

            if (l1.val >= l2.val) {
                dummy.next = l2;
                l2 = l2.next;
            } else {
                dummy.next = l1;
                l1 = l1.next;
             }
                dummy = dummy.next;
        }
        if (l2.next != null) {
            dummy.next = l2;
            //System.out.println(l3.val);
        }else if(l1.next != null) {
            dummy.next = l1;
            //System.out.println(l3.val);
        }

        l3 = l3.next;

        while(l3.next != null){
            System.out.println("l3  " + l3.val);
            l3 = l3.next;
        }

        return l3;


    }

    public static void main(String[] args) {

        ListNode dummy = new ListNode();
        ListNode dummy1 = new ListNode(4,dummy);
        ListNode dummy2 = new ListNode(2, dummy1);
        ListNode l1 = new ListNode(1,dummy2);


        ListNode dum = new ListNode();
        ListNode dum1 = new ListNode(4,dum);
        ListNode dum2 = new ListNode(3, dum1);
        ListNode l2 = new ListNode(1,dum2);


        ListNode dummy3 = mergeTwoLists(l1,l2);

        System.out.println("---------------");
        while(dummy3.next != null){
            System.out.println(dummy3.val);
            dummy3 = dummy3.next;
        }
    }


}



