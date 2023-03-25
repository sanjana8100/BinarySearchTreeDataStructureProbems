package com.bridgelabz.BinarySearchTree;

public class INode <T extends Comparable<T>>{
    T data;
    INode<T> nextR;
    INode<T> nextL;

    public INode(T data){
        this.data = data;
    }
}
