import org.w3c.dom.Node;

/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 1/26/2021
 *   Time: 2:41 PM
 *   File: Node.java
 */
 class InsertNode {
    public Node head;

    static class Node {
        int data;
        Node next;
        public Node head;


        public Node(int d) {
            data = d;
            next = null;
        }


        public static void main(String[] args) {
            Node emptylist = new Node(4);

            emptylist.head = new Node(10);
            Node secondNode = new Node(20);
            Node thirdNode = new Node(30);

            emptylist.head.next = secondNode;
            emptylist.head.next.next = thirdNode;

            emptylist.printLinkedList();

        }

        private void printLinkedList() {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }
}







