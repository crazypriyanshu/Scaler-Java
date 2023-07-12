package main.java.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
        System.out.println("Adding new element "+val+" ===> Head pointing to -> "+head.val + " && tail is pointing to "+tail.val);
    }

    public void insertAValueAtIndex(int value, int index) {
        if(index == 1 || index == 0) {
            insertFirst(value);
        }
        if(index == size) {
            insertAtLast(value);
        }
        if(index > size || index < 0) {
            System.out.println("Index not valid");
            return;
        }
        Node temp = head;
        for (int i =1; i< index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;

    }

    public int findPositionOf(int searchVal){
        int pos =1;
        Node temp = head;

        while (temp.val != searchVal && temp.next != null) {
            temp = temp.next;
            pos += 1;
        }
        if (temp.next == null) {
            return -1;
        }

        return pos;
    }

    public void printLL(){
        Node temp = head; // dont want to change anything in head
        while (temp != null) {
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    public void findMiddle() {
        Node slow = head;
        Node fast = head;
        int midPosition = 1;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            midPosition += 1;
        }
        System.out.println("In a size of linked List "+size+" , Mid position is : "+ midPosition);
    }
    public void insertAtLast(int data) {
        if (tail == null) {
            this.insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public Node reverseLL() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }

    public void removeEleInLL(int position) {
        if(head == null) {
            return;
        }
        Node temp = head;
        if(position == 1) {
            head = temp.next;
            return;
        }
        for(int i=0; temp != null && i< position-1; i++){
            temp = temp.next;
        }
        if (temp == null || temp.next == null){
            return;
        }
        Node next = temp.next.next;
        temp.next = next;

    }

}
