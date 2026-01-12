class Nd{
    int data;
    Nd next;

    Nd(int x){
        data = x;
        next = null;
    }
    
}

class SLL{
    Nd head;

    static void inser(SLL l1,int x){
        Nd temp = new Nd(x);
        
        if(l1.head == null){
            l1.head = temp;
        }
        else{
            Nd t1 = l1.head;
            while(t1.next != null){
                t1 = t1.next;
            }
            t1.next = temp;
        }
    }

    static void print(SLL l1){
        Nd t1 = l1.head;
        while(t1 != null){
            System.out.print(t1.data + " ");
            t1 = t1.next;
        }
        System.out.println();
    }

    static void reverse(SLL l1){
        Nd prev = null;
        Nd curr = l1.head;
        Nd next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l1.head = prev;
    }

    public static void main(String[] args) {
        SLL l1 = new SLL();
        inser(l1,10);
        inser(l1,20);
        inser(l1,30);
        print(l1);
        reverse(l1);
        print(l1);

        
    }
}
