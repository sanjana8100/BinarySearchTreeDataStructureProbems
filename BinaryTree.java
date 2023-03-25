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
        while(true) {
            if (data.compareTo(currentPointer.data) < 0) {
                if(currentPointer.nextL == null){
                    currentPointer.nextL= newNode;
                    return;
                }
                currentPointer = currentPointer.nextL;
            } else {
                if(currentPointer.nextR == null){
                   currentPointer.nextR= newNode;
                   return;
                }
                currentPointer = currentPointer.nextR;
            }
        }
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
