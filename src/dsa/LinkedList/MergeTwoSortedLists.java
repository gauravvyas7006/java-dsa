package dsa.LinkedList;

class BLinkedList {
    int val;
    BLinkedList next;

    BLinkedList(int val) {
        this.val = val;
        this.next = null;
    }
}

class MergeTwoSortedLists {


    public static BLinkedList merge(BLinkedList l1, BLinkedList l2){
        BLinkedList dummy = new BLinkedList(0);
        BLinkedList tail = dummy;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        BLinkedList l1 = new BLinkedList(1);
        l1.next = new BLinkedList(3);
        l1.next.next = new BLinkedList(6);

        BLinkedList l2 = new BLinkedList(2);
        l2.next = new BLinkedList(4);
        l2.next.next = new BLinkedList(5);

        BLinkedList result = merge(l1, l2);
        while (result != null) {
            System.out.print(result.val + " → ");
            result = result.next;
        }

    }

}