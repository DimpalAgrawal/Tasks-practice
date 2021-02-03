/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/31/2021
 *   Time: 5:13 PM
 *   File: LinkedList.java
 */



public class LinkedList {
    private final Node Null = null;
    private int size;
    private Node head;

    public LinkedList() {
        size = 0;
        head = Null;
    }

    public int getListSize() {
        return size;
    }

    public void viewList() {
        Node ptr;
        ptr = head;
        if(head==null) {
            System.out.println("empty list");
        }
        for (int i = 0; i <= size; i++) {
            System.out.println(ptr.getData());
            ptr = ptr.getNext();
        }
    }

    public void InsertAtfirst(int n) {
        Node ptr2 = new Node();
        ptr2.setData(n);
        ptr2.setNext(head);
        head = ptr2;
        size++;
    }

    public  void InsertAtPosition(int pos,int data) {
        Node ptr2 = new Node();
        Node ptr1;
        ptr2.setData(data);
        ptr2.setNext(null);
        ptr1 = head;
        for (int i = 0; i <pos-1 ; i++) {
            ptr1.getNext();
        }

        ptr2.setNext(ptr1.getNext());
        ptr1.setNext(ptr2);
        size++;
    }
}