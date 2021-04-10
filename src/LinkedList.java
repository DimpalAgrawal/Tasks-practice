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

    private boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }


    public int getListSize() {
        return size;
    }

    public void viewList() {
        Node ptr;
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            ptr = head;
            for (int i = 1; i <= size; i++) {
                System.out.print(ptr.getData());
                ptr = ptr.getNext();
            }
        }
    }


    public void InsertAtfirst(int n) {

        Node ptr2 = new Node(5);
        ptr2.setData(n);
        ptr2.setNext(head);
        head = ptr2;
        size++;
    }

    public void Reverse() {
        Node temp = null;
        Node temp2 = null;

        while (head != null) {
            temp2 = head.getNext();
            head.setNext(temp);
            temp = head;
            head = temp2;
        }
        head = temp;
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getData());
            ptr = ptr.getNext();
        }
    }

    public void InsertAtPosition(int pos, int data) {
        Node ptr2 = new Node(5);
        Node ptr1;
        ptr2.setData(data);
        ptr2.setNext(null);
        ptr1 = head;
        for (int i = 0; i < pos - 1; i++) {
            ptr1.getNext();
        }
        ptr2.setNext(ptr1.getNext());
        ptr1.setNext(ptr2);
        size++;
    }

    public void insertAtLast(int data) {
        Node ptr2 = new Node(5);
        Node ptr1 = new Node(5);
        ptr2.setData(data);
        ptr1 = head;
        if (ptr1 == Null) {
            head = ptr2;
        } else {
            while (ptr1.getNext() != null) {
                ptr1 = ptr1.getNext();
            }

            ptr1.setNext(ptr2);
        }
        size++;
    }

    public void DeleteAtfirst() {
        if (head == null) {
            System.out.println("No List");
        } else {
            head = head.getNext();
            size--;
        }
    }

    public void DeleteAtLast() {
        if (head == null) {
            System.out.println("No List");
        } else {
            Node ptr1 = new Node(5);
            ptr1 = head;
            for (int i = 1; i < size - 1; i++) {
                ptr1.getNext();
            }
            ptr1.setNext(null);
            size--;
        }
    }

    public void DeleteAtPos(int pos) {
        if (head == null) {
            System.out.println("No List");
        } else {
            Node ptr2 = new Node(5);
            ptr2 = head;
            for (int i = 1; i < pos - 1; i++) {
                ptr2.getNext();
            }

            Node t1 = ptr2.getNext();
            ptr2.setNext(t1.getNext());
            size--;
        }
    }

    public void InsertAtDoubly(int n) {
        Node ptr = new Node(5);
        Node next = null;
        Node prev = null;
        ptr.setData(n);
        ptr.setnext(head);
        head = ptr;
        size++;

    }

    public void DeleteAtPosition(int pos) {
        Node temp = new Node(5);
        Node temp3;
        temp =head;
        for (int i = 1; i <pos ; i++) {
            temp = temp.getNext();
        }

        Node temp2 = temp.getnext();
        temp.setnext(temp2.getnext());
        temp3 = temp2.getnext();
        temp3.setprev(temp);
        size--;
    }
}

































