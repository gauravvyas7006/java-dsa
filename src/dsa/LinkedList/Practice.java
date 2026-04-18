package dsa.LinkedList;
class AListNode {
    int val;
    AListNode next;
    AListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class Practice{
    public static void main(String[] args){
        AListNode head = new AListNode(1);
        head.next = new AListNode(2);
        head.next.next = new AListNode(3);
        head.next.next.next = new AListNode(4);

        AListNode prev = null;
        AListNode curr = head;
        while (curr != null){
            AListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        while (head != null){
            System.out.println(head.val + " ");
            head= head.next;
        }
    }
}