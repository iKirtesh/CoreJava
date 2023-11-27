package DSA.LinkedList.Single;

// Singly Linked List

class Node {
    int data;
    DSA.LinkedList.Double.Node next;

    Node(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {
    DSA.LinkedList.Double.Node head;

    void insertAtBeginning(int data) {
        DSA.LinkedList.Double.Node newNode = new DSA.LinkedList.Double.Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        DSA.LinkedList.Double.Node newNode = new DSA.LinkedList.Double.Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DSA.LinkedList.Double.Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void insertAfter(DSA.LinkedList.Double.Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        DSA.LinkedList.Double.Node newNode = new DSA.LinkedList.Double.Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void deleteNode(int key) {
        DSA.LinkedList.Double.Node temp = head;
        DSA.LinkedList.Double.Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    void deleteNodeAtPosition(int position) {
        if (head == null)
            return;

        DSA.LinkedList.Double.Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        DSA.LinkedList.Double.Node next = temp.next.next;
        temp.next = next;
    }

    void deleteList() {
        head = null;
    }

    int getCount() {
        DSA.LinkedList.Double.Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    boolean search(int key) {
        DSA.LinkedList.Double.Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    void printList() {
        DSA.LinkedList.Double.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Singly {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // Insert 1, 2, 3, 4, 5, 6 at the beginning
        singlyLinkedList.insertAtBeginning(1);
        singlyLinkedList.insertAtBeginning(2);
        singlyLinkedList.insertAtBeginning(3);
        singlyLinkedList.insertAtBeginning(4);
        singlyLinkedList.insertAtBeginning(5);
        singlyLinkedList.insertAtBeginning(6);
        singlyLinkedList.printList();

        // Insert 7, 8 at the end
        singlyLinkedList.insertAtEnd(7);
        singlyLinkedList.insertAtEnd(8);
        singlyLinkedList.printList();

        // Insert 9 after 3
        singlyLinkedList.insertAfter(singlyLinkedList.head.next.next, 9);
        singlyLinkedList.printList();

        // Delete 9
        singlyLinkedList.deleteNode(9);
        singlyLinkedList.printList();

        // Delete 3 at position 3
        singlyLinkedList.deleteNodeAtPosition(3);
        singlyLinkedList.printList();

        // search 7
        System.out.println(singlyLinkedList.search(7));

        // Count of nodes = 7
        System.out.println(singlyLinkedList.getCount());

        // Delete the list and print
        singlyLinkedList.deleteList();
        singlyLinkedList.printList();

    }
}
