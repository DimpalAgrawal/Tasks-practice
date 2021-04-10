/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 3/24/2021
 *   Time: 10:13 AM
 *   File: BSTlinkedlist.java
 */

class Node {
    public Node getNext;
    public String getData;
    int data;
    Node left;
    Node right;

    public Node(int i) {
        this.data =data;
        left=right=null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getNext() {
        return null;
    }

    public void setNext(Node top) {
    }

    public void setData(int n) {
    }

    public void setnext(Node head) {
    }

    public Node getnext() {
        return null;
    }

    public void setprev(Node temp) {
    }
}

public class BSTlinkedlist {
    Node root;

    public BSTlinkedlist() {
        root = null;
    }

    public static Node insert(Node root, Node newnode) {
        if (root == null) {
            return root;
        }
        if (root.data < newnode.data) {
            if (root.right == null) {
                root.right = newnode;
            } else {
                insert(root.right, newnode);
            }
        } else {
            if (root.left == null) {
                root.left = newnode;
            } else {
                insert(root.left, newnode);
                return root;
            }
        }
    return  root;
}


    public void inorderTraversal(Node root) {
      if(root == null) {
          return;
      }
      inorderTraversal(root.left);
        System.out.println(root.data);
      inorderTraversal(root.right);
    }
}

class Main5 {
    public static void main(String[] args) {
        BSTlinkedlist obj = new BSTlinkedlist();
        Node n1 =new Node(5);
        Node n2 =new Node(10);
        Node n3 =new Node(15);
        Node n4 =new Node(20);
        Node n5 =new Node(25);

        obj.insert(obj.root,n1);
        obj.insert(obj.root,n2);
        obj.insert(obj.root,n3);
        obj.insert(obj.root,n4);
        obj.insert(obj.root,n5);

        obj.inorderTraversal(obj.root);


    }
}












