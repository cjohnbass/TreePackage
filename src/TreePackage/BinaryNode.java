/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreePackage;

/**
 *
 * @author Christopher Bass
 */
public class BinaryNode<T> implements BinaryNodeInterface<T> {

    private T data;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode() {
        this(null);//call next constructor
    }

    public BinaryNode(T dataPortion) {
        this(dataPortion, null, null);//call next constructor
    }

    public BinaryNode(T dataPortion, BinaryNode<T> leftChild,
            BinaryNode<T> rightChild) {
        data = dataPortion;
        left = leftChild;
        right = rightChild;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T newData) {
        data = newData;
    }

    @Override
    public BinaryNodeInterface<T> getLeftChild() {
        return left;
    }

    @Override
    public void setLeftChild(BinaryNodeInterface<T> leftChild) {
        left = (BinaryNode<T>) leftChild;
    }

    @Override
    public boolean hasLeftChild() {
        return left != null;
    }

    @Override
    public boolean isLeaf() {
        return (left == null) && (right == null);

    }

    @Override
    public BinaryNodeInterface<T> copy() {
        BinaryNode<T> newRoot = new BinaryNode<T>(data);

        if (left != null) {
            newRoot.left = (BinaryNode<T>) left.copy();
        }
        
        if (right != null) {
            newRoot.right = (BinaryNode<T>) right.copy();
        }
        
        return newRoot;
    }
}
