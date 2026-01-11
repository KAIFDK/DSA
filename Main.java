
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class LL{
    Node head;

    static void insert(LL l1,int x){
        Node temp = new Node(x);
        if(l1.head == null){
            l1.head = temp;
        }
        else{
            Node t1 = l1.head;
            while(t1.next != null){
                t1 = t1.next; 
            }
            t1.next = temp;
        }
    }

    static void print(LL l1){
        Node t1 = l1.head;
        while(t1 != null){
            System.out.print(t1.data + "->");
            t1 = t1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL l1 = new LL();
        insert(l1, 10);
        insert(l1,20);
        insert(l1,30);
        insert(l1,40);
        print(l1);

    }
}