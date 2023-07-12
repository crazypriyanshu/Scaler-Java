package main.java.LinkedList;


public class Client {
    public static void main(String[] args) {
        LL linkedList = new LL();
//        linkedList.insertAtLast(1000);
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(40);
        linkedList.insertFirst(50);
        linkedList.insertFirst(60);
        linkedList.insertFirst(70);
        linkedList.insertFirst(80);
//        System.out.println(linkedList);
        linkedList.printLL();
        System.out.println(linkedList.findPositionOf(10));
        linkedList.findMiddle();
        linkedList.insertAtLast(200);
        linkedList.insertAtLast(2000);
        linkedList.printLL();
        linkedList.findMiddle();
        linkedList.insertAValueAtIndex(55, 5);
        linkedList.insertAValueAtIndex(55, 50);
        linkedList.printLL();
        linkedList.reverseLL();
        linkedList.printLL();
        linkedList.removeEleInLL(5);
        linkedList.printLL();





    }
}
