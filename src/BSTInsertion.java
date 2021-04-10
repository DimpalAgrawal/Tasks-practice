/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 4/10/2021
 *   Time: 6:25 PM
 *   File: BSTInsertion.java
 */

// Program Insertion in binary  search tree


public class BSTInsertion {
    public static Node insert(Node root, int data) {

        Node newnode = new Node(data);
        newnode.left = null;
        newnode.right = null;
        if (root == null) {
            root = newnode;
            return root;
        } else if (data <= (root.data)) {
            root.left = insert(root.left, root.data);
        } else {
            root.right = insert(root.right, root.data);

        }
        return root;
    }


    public static void preorder(Node root) {

        if (root == null) {
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

}


    public static void main(String[] args) {
        Node root = null;
         root = insert(root, 2);
         root= insert(root, 5);
         root = insert(root, 4);
         root= insert(root, 9);
         preorder(root);

    }
}