/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 2/17/2021
 *   Time: 10:17 AM
 *   File: StackByLinkedList.java
 */

public class StackByLinkedList {
    Node top;

    public StackByLinkedList() {
        top = null;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public void push(int n) {
        Node newnode = new Node(5);
        newnode.setData(n);
        if (top == null) {
            top = newnode;
        } else {
            newnode.setNext(top);
            top = newnode;
        }
    }

    public void pop() {
        if (top.getNext() == null) {
            System.out.println("empty");
        } else {
            System.out.println("deleted element is" + top.getData);
            top = top.getNext;
        }
    }

    public void Display() {
        Node temp1 = top;

        if (top == null) {
            System.out.println("empty");
        } else {
            while (temp1 != null) {
                System.out.println(temp1.getData);
                temp1.getNext();
            }
        }
    }
}