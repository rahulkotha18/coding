import java.util.*;
class BSTInsert {
    static class Node {
        int key;
        Node left, right;
    };
    static Node newNode(int data) {
        Node temp = new Node();

        temp.key = data;

        temp.left = null;
        temp.right = null;

        return temp;
    }
    static Node insert(Node root, int key) {
        Node newnode = newNode(key);
        Node x = root;
        Node y = null;
        while (x != null) {
            y = x;
            if (key < x.key)
                x = x.left;
            else
                x = x.right;
        }
        if (y == null)
            y = newnode;

        else if (key < y.key)
            y.left = newnode;
        else
            y.right = newnode;
        return y;
    }
    static void Inorder(Node root) {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }
    public static void main(String args[]) {
        Node root = null;
        root = insert(root, 70);
        insert(root, 10);
        insert(root, 100);
        insert(root, 150);
        insert(root, 80);
        insert(root, 90);
        insert(root, 20);
        Inorder(root);

    }
}
