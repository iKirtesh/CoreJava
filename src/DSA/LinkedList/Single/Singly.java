package DSA.LinkedList.Single;

// Singly Linked List

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

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

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
        temp.next = next;
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

    int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void deleteList() {
        head = null;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
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
