package com.bridgelabz.BinarySearchTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree<Integer> bst = new BinaryTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        bst.add(60);
        bst.add(22);
        bst.add(95);
        bst.add(40);

        bst.add(65);
        bst.add(11);

        bst.add(67);
        bst.add(3);
        bst.add(16);
        bst.add(63);

        bst.search(bst.root,65);
        bst.display(bst.root);
    }
}
