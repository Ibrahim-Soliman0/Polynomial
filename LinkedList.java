public class LinkedList {
        Node head;

    public void add(double coff, int pow){
        Node newNode = new Node(coff,pow);
        if (head == null) {
            head = newNode;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public int size(){
        Node current = head;
        int counter = 0;
        while(current != null){
            current = current.next;
            counter ++;
        }
        return counter;
    }
    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.coefficient + " " + current.power);
            current = current.next;
        }
    }
}
