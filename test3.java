class Node {
    int data;
    Node next;
    Node prev;

    public void display() {

        System.out.print(this.data + "\t");

    }

}

class DoublyLinkedList {

    Node head;
    Node tail;

    public void insertAtBeginning(int value) {

        Node node1 = new Node();
        node1.data = value;
        node1.prev = null;
        node1.next = head;
        if (this.head == null) {
            this.head = this.tail = node1;
        } else {
            this.head.prev = node1;
            this.head = node1;
        }

    }

    // ---------------------------------------------------------------------------------

    public void insertAtEnd(int value) {

        Node node2 = new Node();
        node2.data = value;
        node2.next = null;

        if (this.head == null) {
            this.head = this.tail = node2;
        } else {
            node2.prev = tail;
            tail.next = node2;
            this.tail = node2;

        }

    }

    // -------------------------------------------------------------------------------------
    public void insertAtPos(int value, int pos) {
        Node node3 = new Node();
        node3.data = value;

        Node temp = head;
        Node current = null;

        for (int i = 0; i < pos - 1; i++) {
            current = temp;
            temp = temp.next;

        }

        current.next = node3;
        node3.prev = current;
        node3.next = temp;
        temp.prev = node3;

    }

    public void visit() {

        for (Node current = head; current != null; current = current.next) {

            current.display();
        }
        System.out.println();

        for (Node current = tail; current != null; current = current.prev) {
            current.display();
        }

    }

}

public class test3 {

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtBeginning(23);
        dl.insertAtBeginning(45);
        dl.insertAtBeginning(65);
        dl.insertAtBeginning(75);
        dl.insertAtPos(455, 3);
        dl.insertAtEnd(100);
        dl.visit();
    }
}
