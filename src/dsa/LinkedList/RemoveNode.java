package dsa.LinkedList;

class Noding {
    int val;
    Noding next;

    Noding(int val){
        this.val = val;
        this.next = null;
    }
}

public class RemoveNode {

    // remove nth node from end
    public static Noding checker(Noding head, int n){
        Noding dummy = new Noding(0);
        dummy.next = head;

        Noding fast = dummy;
        Noding slow = dummy;

        // move fast n+1 steps
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        // move both pointers
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        // remove node
        slow.next = slow.next.next;

        return dummy.next;
    }

    // print list
    public static void printList(Noding h){
        while(h != null){
            System.out.print(h.val + " -> ");
            h = h.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Noding head = new Noding(1);
        head.next = new Noding(2);
        head.next.next = new Noding(3);
        head.next.next.next = new Noding(4);
        head.next.next.next.next = new Noding(5);

        int n = 2;

        head = checker(head, n);

        printList(head);
    }
}