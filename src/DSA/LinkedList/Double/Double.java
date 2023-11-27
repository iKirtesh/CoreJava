package DSA.LinkedList.Double;


// Doubly Linked List

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class DoubleLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null)
            newNode.next.prev = newNode;
    }

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            head.prev = null;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = prev;
    }

    void deleteNodeAtPosition(int position) {
        Node temp = head;
        Node prev = null;

        if (position == 1) {
            head = temp.next;
            head.prev = null;
            return;
        }

        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = prev;
    }

    void printList() {
        Node temp = head;
        System.out.println("Traversal in forward direction");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("\nTraversal in reverse direction");
        temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    void deleteList() {
        head = null;
    }

    int getLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }
}

public class Double {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertAtBeginning(1);
        doubleLinkedList.insertAtBeginning(2);
        doubleLinkedList.insertAtBeginning(3);
        doubleLinkedList.insertAtBeginning(4);
        doubleLinkedList.insertAtBeginning(5);
        doubleLinkedList.insertAtBeginning(6);
        doubleLinkedList.insertAtBeginning(7);
        doubleLinkedList.insertAtBeginning(8);
        doubleLinkedList.insertAtBeginning(9);
        doubleLinkedList.printList();

        // Insert 10 at the end
        doubleLinkedList.insertAtEnd(10);
        System.out.println("After inserting 10 at the end");
        doubleLinkedList.printList();

        // Insert 11 after 5
        doubleLinkedList.insertAfter(doubleLinkedList.head.next.next.next.next, 11);
        System.out.println("After inserting 11 after 5");
        doubleLinkedList.printList();

        // Delete 11
        doubleLinkedList.deleteNode(11);
        System.out.println("After deleting 11");
        doubleLinkedList.printList();

        // Delete 10
        doubleLinkedList.deleteNodeAtPosition(10);
        System.out.println("After deleting 10");

        doubleLinkedList.printList();

        // Search 5
        System.out.println(doubleLinkedList.search(5));

        // Search 11
        System.out.println(doubleLinkedList.search(11));

        // Get length
        System.out.println(doubleLinkedList.getLength());

        // delete list
        doubleLinkedList.deleteList();


    }

}
