/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/31/2021
 *   Time: 5:23 PM
 *   File: Node.java
 */

public class Node {
    private static final Node NULL = null;
    private int data;
    private Node next;


    public Node() {
        data = 0;
        next = NULL;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public  Node (int d , Node n) {
        data = d;
        next = n;
    }

}