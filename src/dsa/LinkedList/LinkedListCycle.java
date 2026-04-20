package dsa.LinkedList;
class LinkedList{
    int val;
    LinkedList next;
    LinkedList(int val){
        this.val = val;
        this.next = null;
    }
}
class LinkedListCycle{
    public static void main(String[] args){
        LinkedList head = new LinkedList(1);
        LinkedList secound = new LinkedList(2);
        LinkedList third = new LinkedList(3);
        LinkedList fourth = new LinkedList(4);
        head.next = secound;
        secound.next = third;
        third.next = fourth;

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(LinkedList head){
        LinkedList slow = head;
        LinkedList fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}