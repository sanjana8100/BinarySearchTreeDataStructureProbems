package com.bridgelabz.BinarySearchTree;

public class BinaryTree<T extends Comparable<T>> {
    INode<T> root;

    public void add(T data){
        INode<T> newNode = new INode<>(data);
        if(root == null) {
            root = newNode;
            return;
        }
        INode<T> currentPointer= root;
        while(currentPointer.nextR != null && currentPointer.nextL != null) {
            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.nextL;
            } else {
                currentPointer = currentPointer.nextR;
            }
        }
        if(data.compareTo(currentPointer.data) < 0)
            currentPointer.nextL= newNode;
        else
            currentPointer.nextR= newNode;
    }

    public void traverse(INode<T> currentPointer){
        if (currentPointer == null)
            return;
        traverse(currentPointer.nextL);
        System.out.print(currentPointer.data+" ");
        traverse(currentPointer.nextR);
    }

    public void display(){
        traverse(root);
    }
}
